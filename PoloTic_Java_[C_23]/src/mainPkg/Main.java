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

package mainPkg;

import base.Vehicle;
import base.SubClass.Bus;
import base.SubClass.Car;
import base.SubClass.Motorcycle;
import base.SubClass.Truck;

/**
 * @author FacuFalcone - CaidevOficial
 *
 */
public class Main {

    // Main array
    public static Vehicle array[] = new Vehicle[10];

    /**
     * Search for a free Index of the array.
     * @param array
     * @return the free index or -1 if error.
     */
    public static int findFreeIndex(Vehicle[] array) {
	   int freeIndex = -1;
	   if (array != null) {
		  for (int i = 0; i < array.length; i++) {
			 if (array[i] == null) {
				freeIndex = i;
				break;
			 }
		  }
	   }

	   return freeIndex;
    }

    /**
     * Prints on screen the greetings.
     * @param array
     */
    public static void sendGreetings(Vehicle[] array) {

	   if (array != null) {
		  for (int i = 0; i < array.length; i++) {
			 if(array[i]!=null) {
				array[i].Greetings();				
			 }
		  }
	   }
    }

    /**
     * Hardcode the array with default values.
     * @param array
     */
    public static void Hardcode(Vehicle[] array) {
	   // Cars
	   array[0] = new Car("Negro", "Fiat", "Cronos", "1122233", "11-333-44", "1.4", 3, "Leather", 800);
	   array[1] = new Car("Plateado", "Peugeot", "207", "1122244", "11-333-45", "1.4 HDI", 3, "Cotton", 500);
	   array[2] = new Car("Blanco", "Fiat", "Fiorino", "1122255", "11-333-46", "1.6", 2, "Vinil", 300);
	   // Motorcycles
	   array[3] = new Motorcycle("Negro", "Honda", "Wave", "2233322", "22-333-11", "1.1", 1, "Metal", 110);
	   array[4] = new Motorcycle("Negro", "Harley-Davidson", "Luxury", "2244422", "22-555-11", "2.1", 1, "Metal", 210);
	   array[5] = new Motorcycle("Negro", "Honda", "Storm", "2255522", "22-777-11", "1.5", 1, "Metal", 150);
	   // Busses
	   array[6] = new Bus("Amarillo", "Mercedes-Benz", "KJ123", "9912345", "99-345-21", "2.8 HDI", 40, "newType", true, true);
	   array[7] = new Bus("Blanco", "Mercedes-Benz", "HT123", "9912932", "99-345-90", "2.7 HDI", 45, "newType", false, true);
	   // Trucks
	   array[8] = new Truck("Rojo", "Fiat", "Iveco", "5567899", "55-876-98", "3.0 HDI", 2, 3, false);
	   // EndEx1
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {

	   Hardcode(array);
	   sendGreetings(array);
    }
}
