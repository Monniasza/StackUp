/*
 * Copyright (c) 2018, 2020 Adrian Siekierka
 *
 * This file is part of StackUp.
 *
 * StackUp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * StackUp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with StackUp.  If not, see <http://www.gnu.org/licenses/>.
 */

package pl.asie.stackup;

public class StackUpConfig {
	public static boolean coremodActive = false;
	public static boolean coremodPatchRefinedStorage = true;
	public static boolean coremodPatchMantle = true;
	public static boolean coremodPatchIc2 = true;
	public static boolean coremodPatchAppliedEnergistics2 = true;
	public static boolean coremodPatchActuallyAdditions = true;

	public static boolean scriptingActive = false;

	public static boolean scaleTextLinearly = false;
	public static float lowestScaleDown = 0.0f;
	public static float highestScaleDown = 1.0f;
	public static boolean equalScaleDown = false;
	public static boolean compatChiselsBits = true;
}
