/**
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
 */

package de.uhh.l2g.plugins.service.base;

import de.uhh.l2g.plugins.service.InstitutionLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Iavor Sturm
 * @generated
 */
public class InstitutionLocalServiceClpInvoker {
	public InstitutionLocalServiceClpInvoker() {
		_methodName0 = "addInstitution";

		_methodParameterTypes0 = new String[] {
				"de.uhh.l2g.plugins.model.Institution"
			};

		_methodName1 = "createInstitution";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteInstitution";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteInstitution";

		_methodParameterTypes3 = new String[] {
				"de.uhh.l2g.plugins.model.Institution"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchInstitution";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getInstitution";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getInstitutions";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getInstitutionsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateInstitution";

		_methodParameterTypes15 = new String[] {
				"de.uhh.l2g.plugins.model.Institution"
			};

		_methodName172 = "getBeanIdentifier";

		_methodParameterTypes172 = new String[] {  };

		_methodName173 = "setBeanIdentifier";

		_methodParameterTypes173 = new String[] { "java.lang.String" };

		_methodName178 = "getById";

		_methodParameterTypes178 = new String[] { "long" };

		_methodName179 = "getRootInstitutionsByOpenAccessVideos";

		_methodParameterTypes179 = new String[] {  };

		_methodName180 = "getByParentIdList";

		_methodParameterTypes180 = new String[] { "long" };

		_methodName181 = "getByParentIdCount";

		_methodParameterTypes181 = new String[] { "long" };

		_methodName182 = "getByParentId";

		_methodParameterTypes182 = new String[] { "long" };

		_methodName183 = "getRoot";

		_methodParameterTypes183 = new String[] {  };

		_methodName184 = "getByParentIdMap";

		_methodParameterTypes184 = new String[] { "long" };

		_methodName185 = "getByLevel";

		_methodParameterTypes185 = new String[] { "int" };

		_methodName186 = "getByLectureseriesId";

		_methodParameterTypes186 = new String[] { "long", "int", "int" };

		_methodName187 = "getAllSortedAsTree";

		_methodParameterTypes187 = new String[] { "int", "int" };

		_methodName188 = "getMaxSortByParentId";

		_methodParameterTypes188 = new String[] { "long" };

		_methodName189 = "getLockingElements";

		_methodParameterTypes189 = new String[] { "long" };

		_methodName190 = "getInstitutionsFromLectureseriesIdsAndVideoIds";

		_methodParameterTypes190 = new String[] {
				"java.util.ArrayList", "java.util.ArrayList"
			};

		_methodName191 = "getInstitutionsFromLectureseriesIdsAndVideoIds";

		_methodParameterTypes191 = new String[] {
				"java.util.ArrayList", "java.util.ArrayList", "java.lang.Long"
			};

		_methodName198 = "getDefaultInstitutionId";

		_methodParameterTypes198 = new String[] {  };

		_methodName199 = "addDefaultInstitution";

		_methodParameterTypes199 = new String[] {
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName200 = "addInstitution";

		_methodParameterTypes200 = new String[] {
				"java.lang.String", "long", "long", "int"
			};

		_methodName201 = "updateInstitution";

		_methodParameterTypes201 = new String[] {
				"long", "java.lang.String", "int"
			};

		_methodName202 = "removeByInstitutionId";

		_methodParameterTypes202 = new String[] { "java.lang.Long" };

		_methodName203 = "deleteInstitution";

		_methodParameterTypes203 = new String[] { "long" };

		_methodName204 = "updateCounter";

		_methodParameterTypes204 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return InstitutionLocalServiceUtil.addInstitution((de.uhh.l2g.plugins.model.Institution)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return InstitutionLocalServiceUtil.createInstitution(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return InstitutionLocalServiceUtil.deleteInstitution(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return InstitutionLocalServiceUtil.deleteInstitution((de.uhh.l2g.plugins.model.Institution)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return InstitutionLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return InstitutionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return InstitutionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return InstitutionLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return InstitutionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return InstitutionLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return InstitutionLocalServiceUtil.fetchInstitution(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return InstitutionLocalServiceUtil.getInstitution(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return InstitutionLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return InstitutionLocalServiceUtil.getInstitutions(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return InstitutionLocalServiceUtil.getInstitutionsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return InstitutionLocalServiceUtil.updateInstitution((de.uhh.l2g.plugins.model.Institution)arguments[0]);
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return InstitutionLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			InstitutionLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return InstitutionLocalServiceUtil.getById(((Long)arguments[0]).longValue());
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return InstitutionLocalServiceUtil.getRootInstitutionsByOpenAccessVideos();
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return InstitutionLocalServiceUtil.getByParentIdList(((Long)arguments[0]).longValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			return InstitutionLocalServiceUtil.getByParentIdCount(((Long)arguments[0]).longValue());
		}

		if (_methodName182.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes182, parameterTypes)) {
			return InstitutionLocalServiceUtil.getByParentId(((Long)arguments[0]).longValue());
		}

		if (_methodName183.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes183, parameterTypes)) {
			return InstitutionLocalServiceUtil.getRoot();
		}

		if (_methodName184.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes184, parameterTypes)) {
			return InstitutionLocalServiceUtil.getByParentIdMap(((Long)arguments[0]).longValue());
		}

		if (_methodName185.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes185, parameterTypes)) {
			return InstitutionLocalServiceUtil.getByLevel(((Integer)arguments[0]).intValue());
		}

		if (_methodName186.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes186, parameterTypes)) {
			return InstitutionLocalServiceUtil.getByLectureseriesId(((Long)arguments[0]).longValue(),
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName187.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes187, parameterTypes)) {
			return InstitutionLocalServiceUtil.getAllSortedAsTree(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName188.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes188, parameterTypes)) {
			return InstitutionLocalServiceUtil.getMaxSortByParentId(((Long)arguments[0]).longValue());
		}

		if (_methodName189.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes189, parameterTypes)) {
			return InstitutionLocalServiceUtil.getLockingElements(((Long)arguments[0]).longValue());
		}

		if (_methodName190.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes190, parameterTypes)) {
			return InstitutionLocalServiceUtil.getInstitutionsFromLectureseriesIdsAndVideoIds((java.util.ArrayList<java.lang.Long>)arguments[0],
				(java.util.ArrayList<java.lang.Long>)arguments[1]);
		}

		if (_methodName191.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes191, parameterTypes)) {
			return InstitutionLocalServiceUtil.getInstitutionsFromLectureseriesIdsAndVideoIds((java.util.ArrayList<java.lang.Long>)arguments[0],
				(java.util.ArrayList<java.lang.Long>)arguments[1],
				(java.lang.Long)arguments[2]);
		}

		if (_methodName198.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes198, parameterTypes)) {
			return InstitutionLocalServiceUtil.getDefaultInstitutionId();
		}

		if (_methodName199.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes199, parameterTypes)) {
			return InstitutionLocalServiceUtil.addDefaultInstitution((com.liferay.portal.service.ServiceContext)arguments[0]);
		}

		if (_methodName200.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes200, parameterTypes)) {
			return InstitutionLocalServiceUtil.addInstitution((java.lang.String)arguments[0],
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Integer)arguments[3]).intValue());
		}

		if (_methodName201.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes201, parameterTypes)) {
			return InstitutionLocalServiceUtil.updateInstitution(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue());
		}

		if (_methodName202.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes202, parameterTypes)) {
			return InstitutionLocalServiceUtil.removeByInstitutionId((java.lang.Long)arguments[0]);
		}

		if (_methodName203.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes203, parameterTypes)) {
			return InstitutionLocalServiceUtil.deleteInstitution(((Long)arguments[0]).longValue());
		}

		if (_methodName204.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes204, parameterTypes)) {
			return InstitutionLocalServiceUtil.updateCounter();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName172;
	private String[] _methodParameterTypes172;
	private String _methodName173;
	private String[] _methodParameterTypes173;
	private String _methodName178;
	private String[] _methodParameterTypes178;
	private String _methodName179;
	private String[] _methodParameterTypes179;
	private String _methodName180;
	private String[] _methodParameterTypes180;
	private String _methodName181;
	private String[] _methodParameterTypes181;
	private String _methodName182;
	private String[] _methodParameterTypes182;
	private String _methodName183;
	private String[] _methodParameterTypes183;
	private String _methodName184;
	private String[] _methodParameterTypes184;
	private String _methodName185;
	private String[] _methodParameterTypes185;
	private String _methodName186;
	private String[] _methodParameterTypes186;
	private String _methodName187;
	private String[] _methodParameterTypes187;
	private String _methodName188;
	private String[] _methodParameterTypes188;
	private String _methodName189;
	private String[] _methodParameterTypes189;
	private String _methodName190;
	private String[] _methodParameterTypes190;
	private String _methodName191;
	private String[] _methodParameterTypes191;
	private String _methodName198;
	private String[] _methodParameterTypes198;
	private String _methodName199;
	private String[] _methodParameterTypes199;
	private String _methodName200;
	private String[] _methodParameterTypes200;
	private String _methodName201;
	private String[] _methodParameterTypes201;
	private String _methodName202;
	private String[] _methodParameterTypes202;
	private String _methodName203;
	private String[] _methodParameterTypes203;
	private String _methodName204;
	private String[] _methodParameterTypes204;
}