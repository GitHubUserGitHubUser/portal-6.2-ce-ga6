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

import java.util.Date;

/**
 * The base model interface for the Lectureseries service. Represents a row in the &quot;LG_Lectureseries&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link de.uhh.l2g.plugins.model.impl.LectureseriesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link de.uhh.l2g.plugins.model.impl.LectureseriesImpl}.
 * </p>
 *
 * @author Iavor Sturm
 * @see Lectureseries
 * @see de.uhh.l2g.plugins.model.impl.LectureseriesImpl
 * @see de.uhh.l2g.plugins.model.impl.LectureseriesModelImpl
 * @generated
 */
public interface LectureseriesModel extends BaseModel<Lectureseries> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lectureseries model instance should use the {@link Lectureseries} interface instead.
	 */

	/**
	 * Returns the primary key of this lectureseries.
	 *
	 * @return the primary key of this lectureseries
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lectureseries.
	 *
	 * @param primaryKey the primary key of this lectureseries
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the number of this lectureseries.
	 *
	 * @return the number of this lectureseries
	 */
	@AutoEscape
	public String getNumber();

	/**
	 * Sets the number of this lectureseries.
	 *
	 * @param number the number of this lectureseries
	 */
	public void setNumber(String number);

	/**
	 * Returns the event type of this lectureseries.
	 *
	 * @return the event type of this lectureseries
	 */
	@AutoEscape
	public String getEventType();

	/**
	 * Sets the event type of this lectureseries.
	 *
	 * @param eventType the event type of this lectureseries
	 */
	public void setEventType(String eventType);

	/**
	 * Returns the category ID of this lectureseries.
	 *
	 * @return the category ID of this lectureseries
	 */
	public long getCategoryId();

	/**
	 * Sets the category ID of this lectureseries.
	 *
	 * @param categoryId the category ID of this lectureseries
	 */
	public void setCategoryId(long categoryId);

	/**
	 * Returns the name of this lectureseries.
	 *
	 * @return the name of this lectureseries
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this lectureseries.
	 *
	 * @param name the name of this lectureseries
	 */
	public void setName(String name);

	/**
	 * Returns the short desc of this lectureseries.
	 *
	 * @return the short desc of this lectureseries
	 */
	@AutoEscape
	public String getShortDesc();

	/**
	 * Sets the short desc of this lectureseries.
	 *
	 * @param shortDesc the short desc of this lectureseries
	 */
	public void setShortDesc(String shortDesc);

	/**
	 * Returns the term ID of this lectureseries.
	 *
	 * @return the term ID of this lectureseries
	 */
	public long getTermId();

	/**
	 * Sets the term ID of this lectureseries.
	 *
	 * @param termId the term ID of this lectureseries
	 */
	public void setTermId(long termId);

	/**
	 * Returns the language of this lectureseries.
	 *
	 * @return the language of this lectureseries
	 */
	@AutoEscape
	public String getLanguage();

	/**
	 * Sets the language of this lectureseries.
	 *
	 * @param language the language of this lectureseries
	 */
	public void setLanguage(String language);

	/**
	 * Returns the faculty name of this lectureseries.
	 *
	 * @return the faculty name of this lectureseries
	 */
	@AutoEscape
	public String getFacultyName();

	/**
	 * Sets the faculty name of this lectureseries.
	 *
	 * @param facultyName the faculty name of this lectureseries
	 */
	public void setFacultyName(String facultyName);

	/**
	 * Returns the lectureseries ID of this lectureseries.
	 *
	 * @return the lectureseries ID of this lectureseries
	 */
	public long getLectureseriesId();

	/**
	 * Sets the lectureseries ID of this lectureseries.
	 *
	 * @param lectureseriesId the lectureseries ID of this lectureseries
	 */
	public void setLectureseriesId(long lectureseriesId);

	/**
	 * Returns the password of this lectureseries.
	 *
	 * @return the password of this lectureseries
	 */
	@AutoEscape
	public String getPassword();

	/**
	 * Sets the password of this lectureseries.
	 *
	 * @param password the password of this lectureseries
	 */
	public void setPassword(String password);

	/**
	 * Returns the approved of this lectureseries.
	 *
	 * @return the approved of this lectureseries
	 */
	public int getApproved();

	/**
	 * Sets the approved of this lectureseries.
	 *
	 * @param approved the approved of this lectureseries
	 */
	public void setApproved(int approved);

	/**
	 * Returns the long desc of this lectureseries.
	 *
	 * @return the long desc of this lectureseries
	 */
	@AutoEscape
	public String getLongDesc();

	/**
	 * Sets the long desc of this lectureseries.
	 *
	 * @param longDesc the long desc of this lectureseries
	 */
	public void setLongDesc(String longDesc);

	/**
	 * Returns the latest open access video ID of this lectureseries.
	 *
	 * @return the latest open access video ID of this lectureseries
	 */
	public long getLatestOpenAccessVideoId();

	/**
	 * Sets the latest open access video ID of this lectureseries.
	 *
	 * @param latestOpenAccessVideoId the latest open access video ID of this lectureseries
	 */
	public void setLatestOpenAccessVideoId(long latestOpenAccessVideoId);

	/**
	 * Returns the latest video upload date of this lectureseries.
	 *
	 * @return the latest video upload date of this lectureseries
	 */
	public Date getLatestVideoUploadDate();

	/**
	 * Sets the latest video upload date of this lectureseries.
	 *
	 * @param latestVideoUploadDate the latest video upload date of this lectureseries
	 */
	public void setLatestVideoUploadDate(Date latestVideoUploadDate);

	/**
	 * Returns the latest video generation date of this lectureseries.
	 *
	 * @return the latest video generation date of this lectureseries
	 */
	@AutoEscape
	public String getLatestVideoGenerationDate();

	/**
	 * Sets the latest video generation date of this lectureseries.
	 *
	 * @param latestVideoGenerationDate the latest video generation date of this lectureseries
	 */
	public void setLatestVideoGenerationDate(String latestVideoGenerationDate);

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
	public int compareTo(de.uhh.l2g.plugins.model.Lectureseries lectureseries);

	@Override
	public int hashCode();

	@Override
	public CacheModel<de.uhh.l2g.plugins.model.Lectureseries> toCacheModel();

	@Override
	public de.uhh.l2g.plugins.model.Lectureseries toEscapedModel();

	@Override
	public de.uhh.l2g.plugins.model.Lectureseries toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}