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

package de.uhh.l2g.plugins.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author Iavor Sturm
 */
public class VideoStatisticFinderUtil {
	public static java.util.List<de.uhh.l2g.plugins.model.VideoStatistic> findAllStats() {
		return getFinder().findAllStats();
	}

	public static VideoStatisticFinder getFinder() {
		if (_finder == null) {
			_finder = (VideoStatisticFinder)PortletBeanLocatorUtil.locate(de.uhh.l2g.plugins.service.ClpSerializer.getServletContextName(),
					VideoStatisticFinder.class.getName());

			ReferenceRegistry.registerReference(VideoStatisticFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(VideoStatisticFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(VideoStatisticFinderUtil.class,
			"_finder");
	}

	private static VideoStatisticFinder _finder;
}