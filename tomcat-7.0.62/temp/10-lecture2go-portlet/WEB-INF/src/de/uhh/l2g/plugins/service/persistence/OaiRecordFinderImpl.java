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
package de.uhh.l2g.plugins.service.persistence;

import java.util.Date;
import java.util.Iterator;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import de.uhh.l2g.plugins.service.persistence.OaiRecordFinder;
import de.uhh.l2g.plugins.NoSuchOaiRecordException;
import de.uhh.l2g.plugins.model.OaiRecord;

public class OaiRecordFinderImpl extends BasePersistenceImpl<OaiRecord> implements OaiRecordFinder {
	public static final String FIND_EARLIEST_DATESTAMP = OaiRecordFinder.class.getName() + ".findEarliestDatestamp";

	public Date findEarliestDatestamp() {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get(FIND_EARLIEST_DATESTAMP);
			SQLQuery q = session.createSQLQuery(sql);
			q.addScalar("earliestDatestamp", Type.TIMESTAMP);
			q.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(q);
			return (Date) q.uniqueResult();
		} catch (Exception e) {
			
		} finally {
			closeSession(session);
		}
		return null;
	}
}
