/*
 * Copyright (C) 2020 FacuFalcone - CaidevOficial
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

package logic;

import logic.base.subclass.Gorrion;
import logic.base.subclass.Mono;
import logic.base.subclass.Pato;
import logic.base.subclass.Tiburon;

/**
 * @author FacuFalcone - CaidevOficial
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
	   // Example
	   Mono wukong = new Mono();
	   Tiburon sharky = new Tiburon();
	   Pato donald = new Pato();
	   Gorrion tweety = new Gorrion();
	   
	   wukong.iAmAnAnimal();
	   sharky.BreathInTheWater();
	   donald.changeFeather();
	   tweety.fly();
    }
}
