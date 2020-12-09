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

import logic.Abs.entity.Persona;

/**
 * @author CaidevOficial
 *
 */
public class Empleado extends Persona {

    // Attributes
    protected int nroLegajo;
    protected Date fechaIngreso;

    /**
     * Builds the entity with default params.
     */
    public Empleado() {
	super();
    }

    /**
     * @param dni
     */
    public Empleado(String dni) {
	super.dni = dni;
    }

    /**
     * @param dni
     * @param name
     */
    public Empleado(String dni, String name) {
	this(dni);
	this.name = name;
    }

    /**
     * @param dni
     * @param name
     * @param surname
     */
    public Empleado(String dni, String name, String surname) {
	this(dni,name);
	this.surname = surname;
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param birthDate
     * @param address
     * @param age
     */
    public Empleado(String dni, String name, String surname, Date birthDate, String address, int age) {
	this(dni, name, surname, address, birthDate);
	this.age = age;
    }

    /**
     * 
     * @param dni
     * @param name
     * @param surname
     * @param birthDate
     * @param address
     * @param age
     * @param nroLegajo
     */
    public Empleado(String dni, String name, String surname, Date birthDate, String address, int age, int nroLegajo) {
	this(dni, name, surname, birthDate, address, age);
	this.nroLegajo = nroLegajo;
    }

    /**
     * 
     * @param dni
     * @param name
     * @param surname
     * @param birthDate
     * @param address
     * @param age
     * @param nroLegajo
     * @param fechaIngreso
     */
    public Empleado(String dni, String name, String surname, Date birthDate, String address, int age, int nroLegajo, Date fechaIngreso) {
	this(dni, name, surname, birthDate, address, age, nroLegajo);
	this.fechaIngreso = fechaIngreso;
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param address
     */
    public Empleado(String dni, String name, String surname, String address) {
	this(dni, name, surname);
	this.address = address;
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param address
     * @param birthDate
     */
    public Empleado(String dni, String name, String surname, String address, Date birthDate) {
	this(dni, name, surname, address);
	this.birthDate = birthDate;
    }

    
    public String getDNI() {
	return dni;
    }
    
    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
	return fechaIngreso;
    }

    /**
     * @return the nroLegajo
     */
    public int getNroLegajo() {
	return nroLegajo;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
	if (fechaIngreso != null) {
	    this.fechaIngreso = fechaIngreso;
	}
    }

    /**
     * @param nroLegajo the nroLegajo to set
     */
    public void setNroLegajo(int nroLegajo) {
	if (nroLegajo >= 0) {
	    this.nroLegajo = nroLegajo;
	}
    }
}
