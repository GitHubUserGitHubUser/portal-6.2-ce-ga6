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
 * The base model interface for the Term service. Represents a row in the &quot;LG_Term&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.TermModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.TermImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Term
 * @see de.uhh.l2g.plugins.model.impl.TermImpl
 * @see de.uhh.l2g.plugins.model.impl.TermModelImpl
 * @generated
 */
public interface TermModel extends BaseModel<Term> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a term model instance should use the {@link Term} interface instead.
	 */

	/**
	 * Returns the primary key of this term.
	 *
	 * @return the primary key of this term
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this term.
	 *
	 * @param primaryKey the primary key of this term
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the term ID of this term.
	 *
	 * @return the term ID of this term
	 */
	public long getTermId();

	/**
	 * Sets the term ID of this term.
	 *
	 * @param termId the term ID of this term
	 */
	public void setTermId(long termId);

	/**
	 * Returns the parent ID of this term.
	 *
	 * @return the parent ID of this term
	 */
	public long getParentId();

	/**
	 * Sets the parent ID of this term.
	 *
	 * @param parentId the parent ID of this term
	 */
	public void setParentId(long parentId);

	/**
	 * Returns the language ID of this term.
	 *
	 * @return the language ID of this term
	 */
	@AutoEscape
	public String getLanguageId();

	/**
	 * Sets the language ID of this term.
	 *
	 * @param languageId the language ID of this term
	 */
	public void setLanguageId(String languageId);

	/**
	 * Returns the prefix of this term.
	 *
	 * @return the prefix of this term
	 */
	@AutoEscape
	public String getPrefix();

	/**
	 * Sets the prefix of this term.
	 *
	 * @param prefix the prefix of this term
	 */
	public void setPrefix(String prefix);

	/**
	 * Returns the year of this term.
	 *
	 * @return the year of this term
	 */
	@AutoEscape
	public String getYear();

	/**
	 * Sets the year of this term.
	 *
	 * @param year the year of this term
	 */
	public void setYear(String year);

	/**
	 * Returns the translation of this term.
	 *
	 * @return the translation of this term
	 */
	@AutoEscape
	public String getTranslation();

	/**
	 * Sets the translation of this term.
	 *
	 * @param translation the translation of this term
	 */
	public void setTranslation(String translation);

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
	public int compareTo(de.uhh.l2g.plugins.model.Term term);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Term> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Term toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Term toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}