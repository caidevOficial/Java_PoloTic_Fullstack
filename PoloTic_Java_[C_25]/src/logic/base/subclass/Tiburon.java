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
import logic.base.Interface.IAcuatic;

/**
 * @author FacuFalcone - CaidevOficial
 *
 */
public class Tiburon extends Animal implements IAcuatic{

    /**
     * 
     */
    public Tiburon() {
	   // TODO Auto-generated constructor stub
    }

    @Override
    public void iAmAnAnimal() {
	   System.out.println("Iam an animal: Shark.");
    }

    @Override
    public void Swim() {
	   System.out.println("I'm a shark and i can swim!");
    }

    @Override
    public void BreathInTheWater() {
	   System.out.println("I'm a shark and i can breath in the water");
    }

}
