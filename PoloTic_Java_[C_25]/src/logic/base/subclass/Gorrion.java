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

package logic.base.subclass;

import logic.base.Abstract.Animal;
import logic.base.Interface.IFlyer;

/**
 * @author FacuFalcone - CaidevOficial
 *
 */
public class Gorrion extends Animal implements IFlyer{

    /**
     * 
     */
    public Gorrion() {
	   
    }

    @Override
    public void fly() {
	   System.out.println("Vuelo y soy un gorrion.");
	   
    }

    @Override
    public void changeFeather() {
	   System.out.println("Cambio de plumas y soy un gorrion.");
	   
    }

    @Override
    public void iAmAnAnimal() {
	   System.out.println("Iam an animal: Bird.");
    }

}
