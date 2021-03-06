/*******************************************************************************
 * License
 * 
 * The Lecture2Go software is based on the liferay portal 6.2-ga6
 * <http://www.liferay.com> (Copyright notice see below)
 * 
 * Lecture2Go <http://lecture2go.uni-hamburg.de> is an open source
 * platform for media management and distribution. Our goal is to
 * support the free access to knowledge because this is a component
 * of each democratic society. The open source software is aimed at
 * academic institutions and has to strengthen the blended learning.
 * 
 * All Lecture2Go plugins are continuously being developed and improved.
 * For more details please visit <http://lecture2go-open-source.rrz.uni-hamburg.de>
 * 
 * Copyright (c) 2013 - present University of Hamburg / Computer and Data Center (RRZ)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 * 
 * +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++
 * 
 * The Liferay Plugins SDK:
 * 
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 * 
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * Third Party Software
 * 
 * Lecture2Go uses third-party libraries which may be distributed under different licenses 
 * to the above (but are compatible with the used GPL license). Informations about these 
 * licenses and copyright informations are mostly detailed in the library source code or jars themselves. 
 * You must agree to the terms of these licenses, in addition to  the above Lecture2Go source code license, 
 * in order to use this software.
 ******************************************************************************/
package de.uhh.l2g.plugins.search;

import java.util.Collections;
import java.util.List;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Junction;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

import de.uhh.l2g.plugins.service.ClpSerializer;

public class UserSearchHelper {

	protected static Log LOG = LogFactoryUtil.getLog(UserSearchHelper.class.getName());

	public static List<User>getUser(UserDisplayTerms displayTerms,int start,int end) throws SystemException{
		boolean adW = displayTerms.isAdvancedSearch();
		boolean iAnO = displayTerms.isAndOperator();
		//
		String rI = displayTerms.getRoleId();
		String kWr = displayTerms.getKeywords();
		//
        List<User> userList = getUserData(adW, iAnO, rI, kWr);
        return ListUtil.subList(userList, start , end);
	}
	
	public static int getTotalUserCount(UserDisplayTerms displayTerms,int start,int end) throws SystemException{
	       return getUserData(displayTerms.isAdvancedSearch(), displayTerms.isAndOperator(), displayTerms.getRoleId(), displayTerms.getKeywords()).size();
	}
	
	@SuppressWarnings("unchecked")
	public static List<User>getUserData(boolean isAdvancedSearch,boolean isAndOperator, String rId, String keywords) throws SystemException {
		List<User> userList = Collections.EMPTY_LIST;
		try {
			//text search
			if (!Validator.isBlank(keywords)) {
				ClassLoader classLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(), "portletClassLoader");
				DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(User.class, "usr", classLoader);
				Junction junction = null;
				junction = RestrictionsFactoryUtil.disjunction();
				//
				String[] kwordsSplit = keywords.split(" ");
				for (String str: kwordsSplit) {           
					if(!str.isEmpty()){
						Criterion c1 = PropertyFactoryUtil.forName("usr.firstName").like("%" + str + "%");
						junction.add(c1);
						//
						Criterion c2 = PropertyFactoryUtil.forName("usr.lastName").like("%" + str + "%");
						junction.add(c2);
						//
						Criterion c3 = PropertyFactoryUtil.forName("usr.middleName").like("%" + str + "%");
						junction.add(c3);
						//
						Criterion c4 = PropertyFactoryUtil.forName("usr.screenName").like("%" + str + "%");
						junction.add(c4);
						//
						Criterion c5 = PropertyFactoryUtil.forName("usr.emailAddress").like("%" + str + "%");
						junction.add(c5);
					}
				}
				dynamicQuery.add(junction);
				//order by 
				dynamicQuery.addOrder(OrderFactoryUtil.desc("usr.firstName"));
				//fire up the query
				userList = UserLocalServiceUtil.dynamicQuery(dynamicQuery);
				//
			}
			//role id search
			if (Validator.isDigit(rId) && !rId.equals("0") && Validator.isBlank(keywords)) {
				Long lrId = new Long(rId);
				userList = UserLocalServiceUtil.getRoleUsers(lrId);
			}
			//no parameter chosen
			if ((!Validator.isDigit(rId) || rId.equals("0")) && Validator.isBlank(keywords)) {
				userList = UserLocalServiceUtil.getUsers(1, UserLocalServiceUtil.getUsersCount());
			}
		} catch (Exception e) {
			LOG.warn("can't fetch user list!");
		}
		return userList;
	}
}
