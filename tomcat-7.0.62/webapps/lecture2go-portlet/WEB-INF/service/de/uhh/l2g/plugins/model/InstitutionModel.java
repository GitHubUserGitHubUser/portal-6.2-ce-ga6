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

package de.uhh.l2g.plugins.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Institution service. Represents a row in the &quot;LG_Institution&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.InstitutionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.InstitutionImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Institution
 * @see de.uhh.l2g.plugins.model.impl.InstitutionImpl
 * @see de.uhh.l2g.plugins.model.impl.InstitutionModelImpl
 * @generated
 */
public interface InstitutionModel extends BaseModel<Institution> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a institution model instance should use the {@link Institution} interface instead.
	 */

	/**
	 * Returns the primary key of this institution.
	 *
	 * @return the primary key of this institution
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this institution.
	 *
	 * @param primaryKey the primary key of this institution
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the institution ID of this institution.
	 *
	 * @return the institution ID of this institution
	 */
	public long getInstitutionId();

	/**
	 * Sets the institution ID of this institution.
	 *
	 * @param institutionId the institution ID of this institution
	 */
	public void setInstitutionId(long institutionId);

	/**
	 * Returns the parent ID of this institution.
	 *
	 * @return the parent ID of this institution
	 */
	public long getParentId();

	/**
	 * Sets the parent ID of this institution.
	 *
	 * @param parentId the parent ID of this institution
	 */
	public void setParentId(long parentId);

	/**
	 * Returns the name of this institution.
	 *
	 * @return the name of this institution
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this institution.
	 *
	 * @param name the name of this institution
	 */
	public void setName(String name);

	/**
	 * Returns the typ of this institution.
	 *
	 * @return the typ of this institution
	 */
	@AutoEscape
	public String getTyp();

	/**
	 * Sets the typ of this institution.
	 *
	 * @param typ the typ of this institution
	 */
	public void setTyp(String typ);

	/**
	 * Returns the www of this institution.
	 *
	 * @return the www of this institution
	 */
	@AutoEscape
	public String getWww();

	/**
	 * Sets the www of this institution.
	 *
	 * @param www the www of this institution
	 */
	public void setWww(String www);

	/**
	 * Returns the level of this institution.
	 *
	 * @return the level of this institution
	 */
	public int getLevel();

	/**
	 * Sets the level of this institution.
	 *
	 * @param level the level of this institution
	 */
	public void setLevel(int level);

	/**
	 * Returns the sort of this institution.
	 *
	 * @return the sort of this institution
	 */
	public int getSort();

	/**
	 * Sets the sort of this institution.
	 *
	 * @param sort the sort of this institution
	 */
	public void setSort(int sort);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(de.uhh.l2g.plugins.model.Institution institution);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Institution> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Institution toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Institution toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}