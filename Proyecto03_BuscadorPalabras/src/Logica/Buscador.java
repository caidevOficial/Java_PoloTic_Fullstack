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

import GUI.Front;

/**
 * @author caidev
 *
 */
public class Buscador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 //se instancia el objeto.
        Front ventana = new Front();
        ventana.setVisible(true); // la hago visible
        ventana.setLocationRelativeTo(null);
        //para que aparezca en el medio, se pone relative null
        // ya que no toma nada como referencia para tener una locacion.
	}
}
