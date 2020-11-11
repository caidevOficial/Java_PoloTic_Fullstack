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

package logic.entity.sub;

import java.util.Date;

/**
 * @author CaidevOficial
 *
 */
public class Consultor extends Empleado{
    
    // Attributes
    protected String area;

    /**
     * 
     */
    public Consultor() {
	super();
	
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param birthDate
     * @param address
     * @param age
     * @param nroLegajo
     * @param fechaIngreso
     */
    public Consultor(String dni, String name, String surname, Date birthDate, String address, int age, int nroLegajo, Date fechaIngreso) {
	super(dni, name, surname, birthDate, address, age, nroLegajo, fechaIngreso);
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param birthDate
     * @param address
     * @param age
     * @param nroLegajo
     */
    public Consultor(String dni, String name, String surname, Date birthDate, String address, int age, int nroLegajo) {
	super(dni, name, surname, birthDate, address, age, nroLegajo);
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param birthDate
     * @param address
     * @param age
     */
    public Consultor(String dni, String name, String surname, Date birthDate, String address, int age) {
	super(dni, name, surname, birthDate, address, age);
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param address
     * @param birthDate
     */
    public Consultor(String dni, String name, String surname, String address, Date birthDate) {
	super(dni, name, surname, address, birthDate);
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param address
     */
    public Consultor(String dni, String name, String surname, String address) {
	super(dni, name, surname, address);
    }

    /**
     * @param dni
     * @param name
     * @param surname
     */
    public Consultor(String dni, String name, String surname) {
	super(dni, name, surname);
    }

    /**
     * @param dni
     * @param name
     */
    public Consultor(String dni, String name) {
	super(dni, name);
    }

    /**
     * @param dni
     */
    public Consultor(String dni) {
	super(dni);
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
	if(area!=null) {
	    this.area = area;	    
	}
    }
}
