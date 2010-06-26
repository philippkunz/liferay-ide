/*******************************************************************************
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
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
 *******************************************************************************/
package com.liferay.ide.eclipse.layouttpl.ui.model;


public class LayoutConstraint {

	public static final LayoutConstraint EMPTY = new LayoutConstraint();

	public int rowIndex = -1;

	public int columnIndex = -1;

	@Override
	public boolean equals(Object obj) {
		return obj instanceof LayoutConstraint && this.rowIndex == ((LayoutConstraint) obj).rowIndex &&
			this.columnIndex == ((LayoutConstraint) obj).columnIndex;
	}


}
