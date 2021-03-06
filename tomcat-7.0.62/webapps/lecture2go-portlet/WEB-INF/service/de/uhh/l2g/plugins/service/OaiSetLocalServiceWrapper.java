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

package de.uhh.l2g.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OaiSetLocalService}.
 *
 * @author Iavor Sturm
 * @see OaiSetLocalService
 * @generated
 */
public class OaiSetLocalServiceWrapper implements OaiSetLocalService,
	ServiceWrapper<OaiSetLocalService> {
	public OaiSetLocalServiceWrapper(OaiSetLocalService oaiSetLocalService) {
		_oaiSetLocalService = oaiSetLocalService;
	}

	/**
	* Adds the oai set to the database. Also notifies the appropriate model listeners.
	*
	* @param oaiSet the oai set
	* @return the oai set that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.model.OaiSet addOaiSet(
		de.uhh.l2g.plugins.model.OaiSet oaiSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.addOaiSet(oaiSet);
	}

	/**
	* Creates a new oai set with the primary key. Does not add the oai set to the database.
	*
	* @param oaiSetId the primary key for the new oai set
	* @return the new oai set
	*/
	@Override
	public de.uhh.l2g.plugins.model.OaiSet createOaiSet(long oaiSetId) {
		return _oaiSetLocalService.createOaiSet(oaiSetId);
	}

	/**
	* Deletes the oai set with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param oaiSetId the primary key of the oai set
	* @return the oai set that was removed
	* @throws PortalException if a oai set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.model.OaiSet deleteOaiSet(long oaiSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.deleteOaiSet(oaiSetId);
	}

	/**
	* Deletes the oai set from the database. Also notifies the appropriate model listeners.
	*
	* @param oaiSet the oai set
	* @return the oai set that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.model.OaiSet deleteOaiSet(
		de.uhh.l2g.plugins.model.OaiSet oaiSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.deleteOaiSet(oaiSet);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oaiSetLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.model.impl.OaiSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.model.impl.OaiSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public de.uhh.l2g.plugins.model.OaiSet fetchOaiSet(long oaiSetId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.fetchOaiSet(oaiSetId);
	}

	/**
	* Returns the oai set with the primary key.
	*
	* @param oaiSetId the primary key of the oai set
	* @return the oai set
	* @throws PortalException if a oai set with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.model.OaiSet getOaiSet(long oaiSetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.getOaiSet(oaiSetId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the oai sets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link de.uhh.l2g.plugins.model.impl.OaiSetModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of oai sets
	* @param end the upper bound of the range of oai sets (not inclusive)
	* @return the range of oai sets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<de.uhh.l2g.plugins.model.OaiSet> getOaiSets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.getOaiSets(start, end);
	}

	/**
	* Returns the number of oai sets.
	*
	* @return the number of oai sets
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getOaiSetsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.getOaiSetsCount();
	}

	/**
	* Updates the oai set in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oaiSet the oai set
	* @return the oai set that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public de.uhh.l2g.plugins.model.OaiSet updateOaiSet(
		de.uhh.l2g.plugins.model.OaiSet oaiSet)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.updateOaiSet(oaiSet);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _oaiSetLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oaiSetLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oaiSetLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<de.uhh.l2g.plugins.model.OaiSet> getAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oaiSetLocalService.getAll();
	}

	@Override
	public java.util.List<de.uhh.l2g.plugins.model.OaiSet> getByOaiRecordId(
		long oaiRecordId) {
		return _oaiSetLocalService.getByOaiRecordId(oaiRecordId);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public OaiSetLocalService getWrappedOaiSetLocalService() {
		return _oaiSetLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedOaiSetLocalService(
		OaiSetLocalService oaiSetLocalService) {
		_oaiSetLocalService = oaiSetLocalService;
	}

	@Override
	public OaiSetLocalService getWrappedService() {
		return _oaiSetLocalService;
	}

	@Override
	public void setWrappedService(OaiSetLocalService oaiSetLocalService) {
		_oaiSetLocalService = oaiSetLocalService;
	}

	private OaiSetLocalService _oaiSetLocalService;
}