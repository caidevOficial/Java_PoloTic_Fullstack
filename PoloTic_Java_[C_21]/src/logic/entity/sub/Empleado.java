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

import logic.entity.Persona;

/**
 * @author CaidevOficial
 *
 */
public class Empleado extends Persona{
    
    // Attributes
    protected int nroLegajo;
    protected Date fechaIngreso;
    /**
     * 
     */
    public Empleado() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @param dni
     */
    public Empleado(String dni) {
	super(dni);
	// TODO Auto-generated constructor stub
    }
    
    /**
     * @param dni
     * @param name
     */
    public Empleado(String dni, String name) {
	super(dni, name);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param dni
     * @param name
     * @param surname
     */
    public Empleado(String dni, String name, String surname) {
	super(dni, name, surname);
	// TODO Auto-generated constructor stub
    }

    /**
     * @param dni
     * @param name
     * @param surname
     * @param address
     */
    public Empleado(String dni, String name, String surname, String address) {
	super(dni, name, surname, address);
	// TODO Auto-generated constructor stub
    }
    
    /**
     * @param dni
     * @param name
     * @param surname
     * @param address
     * @param birthDate
     */
    public Empleado(String dni, String name, String surname, String address, Date birthDate) {
	super(dni, name, surname, address, birthDate);
	// TODO Auto-generated constructor stub
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
	super(dni, name, surname, birthDate, address, age);
	
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
     * @return the nroLegajo
     */
    public int getNroLegajo() {
        return nroLegajo;
    }

    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param nroLegajo the nroLegajo to set
     */
    public void setNroLegajo(int nroLegajo) {
	if(nroLegajo>=0) {
	    this.nroLegajo = nroLegajo;	    
	}
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
	if(fechaIngreso!=null) {
	    this.fechaIngreso = fechaIngreso;	    
	}
    }
    
    

}
