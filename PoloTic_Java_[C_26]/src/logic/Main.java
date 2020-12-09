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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import logic.Base.Persona;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Main {

    static List<Persona> listaPersonas = new ArrayList<Persona>();
    static List<Persona> otraListaPersonas = new LinkedList<Persona>();
    static Stack<Integer> pila = new Stack<Integer>();
    
    /**
     * Ejemplo para agregar entidades al AL y acceder a los indices.
     */
    public static void EjemploArrayL() {
	   // Ejemplo ArrayList 
	   Persona per1 = new Persona("Ragnar", 30, 1);
	   Persona per2 = new Persona("Lagertha", 29, 2);
	   
	   // 1ra Forma de agregar
	   listaPersonas.add(per1);
	   listaPersonas.add(per2);
	   // 2da Forma de agregar
	   listaPersonas.add(new Persona("Bjorn", 18, 3));
	   
	   // Recorrer con foreach
	   for (Persona persona : listaPersonas) {
		  System.out.println(persona.getNombre());
	   }
    }
    
    public static void EjemploLinkedL() {
	   // Ejemplo LinkedList 
	   
	   otraListaPersonas.add(new Persona("Floki", 31, 1));
	   // Agrego al principio
	   otraListaPersonas.add(0,new Persona("Ubbe", 18, 2));
	   otraListaPersonas.add(new Persona("Ivar", 15, 3));
	   
	   // Recorrer con foreach
	   for (Persona persona : otraListaPersonas) {
		  System.out.println(persona.getNombre());
	   }
    }
    
    public static void EjemploStack() {
	   System.out.println("Pila vacia: " + pila);
	   pila.push(1); pila.push(2);
	   
	   for (Integer numero : pila) {
		  System.out.println(numero);
	   }
	   
	   System.out.println("Pila vacia: " + pila);
	   System.out.println(pila.search(2)); // para buscar.
	   System.out.println(pila.peek()); // muestra el elemento de arriba
    }
    
    public static void main(String[] args) {
	   //EjemploArrayL();
	   //EjemploLinkedL();
	   EjemploStack();
    }
}
