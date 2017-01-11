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
 * The base model interface for the Sys service. Represents a row in the &quot;LG_Sys&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.SysModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.SysImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Sys
 * @see de.uhh.l2g.plugins.model.impl.SysImpl
 * @see de.uhh.l2g.plugins.model.impl.SysModelImpl
 * @generated
 */
public interface SysModel extends BaseModel<Sys> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sys model instance should use the {@link Sys} interface instead.
	 */

	/**
	 * Returns the primary key of this sys.
	 *
	 * @return the primary key of this sys
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this sys.
	 *
	 * @param primaryKey the primary key of this sys
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the sys ID of this sys.
	 *
	 * @return the sys ID of this sys
	 */
	public int getSysId();

	/**
	 * Sets the sys ID of this sys.
	 *
	 * @param sysId the sys ID of this sys
	 */
	public void setSysId(int sysId);

	/**
	 * Returns the version of this sys.
	 *
	 * @return the version of this sys
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this sys.
	 *
	 * @param version the version of this sys
	 */
	public void setVersion(String version);

	/**
	 * Returns the setup wizard of this sys.
	 *
	 * @return the setup wizard of this sys
	 */
	public int getSetupWizard();

	/**
	 * Sets the setup wizard of this sys.
	 *
	 * @param setupWizard the setup wizard of this sys
	 */
	public void setSetupWizard(int setupWizard);

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
	public int compareTo(de.uhh.l2g.plugins.model.Sys sys);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Sys> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Sys toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Sys toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}