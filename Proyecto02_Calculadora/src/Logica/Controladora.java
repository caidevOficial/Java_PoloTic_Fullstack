/*
 * Copyright (C) 2020 caidev
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Logica;

/**
 * @author caidev
 *
 */
public class Controladora {
	
	public static double Suma(double num1, double num2) {
		return num1+num2;
	}
	
	public static double Resta(double num1, double num2) {
		return num1+num2;
	}
	
	public static double Mul(double num1, double num2) {
		return num1+num2;
	}
	
	public static double Div(double num1, double num2) {
		if(num2!=0) {
			return num1+num2;
		}
		return 0;
	}
}
