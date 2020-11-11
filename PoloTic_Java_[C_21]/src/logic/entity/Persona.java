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

package logic.entity;

import java.util.Date;

/**
 * @author CaidevOficial
 *
 */
public class Persona {
    
    // Atributes
    protected String dni;
    protected String name;
    protected String surname;
    protected String address;
    protected Date birthDate;
    protected int age;
    
    /**
     * 
     */
    public Persona() {
	this.dni = "11111111";
	this.name = "";
	this.surname = "";
	this.birthDate = null;
	this.address = "";
	this.age = 0;
    }

    /**
     * Builds the entity with 1 param.
     * @param dni the dni number of the entity.
     */
    public Persona(String dni) {
	this();
    }
    
    /**
     * Builds the entity with 2 params.
     * @param dni the dni number of the entity.
     * @param name the name of the entity.
     */
    public Persona(String dni, String name) {
	this(dni);
	this.name = name;
    }
    
    /**
     * Builds the entity with 3 params.
     * @param dni the dni number of the entity.
     * @param name the name of the entity.
     * @param surname the surname of the entity.
     */
    public Persona(String dni, String name, String surname) {
	this(dni, name);
	this.surname = surname;
    }
    
    /**
     * Builds the entity with 4 params.
     * @param dni the dni number of the entity.
     * @param name the name of the entity.
     * @param surname the surname of the entity.
     * @param address the address of the entity.
     */
    public Persona(String dni, String name, String surname, String address) {
	this(dni, name, surname);
	this.address = address;
    }

    /**
     * Builds the entity with 5 params.
     * @param dni the dni number of the entity.
     * @param name the name of the entity.
     * @param surname the surname of the entity.
     * @param address the address of the entity.
     * @param birthDate the birth Date of the entity.
     */
    public Persona(String dni, String name, String surname, String address, Date birthDate) {
	this(dni, name, surname, address);
	this.birthDate = birthDate;
    }
    
    /**
     * Builds the entity with 6 params
     * @param dni the dni number of the entity.
     * @param name the name of the entity.
     * @param surname the surname of the entity.
     * @param birthDate the birth Date of the entity.
     * @param address the address of the entity.
     * @param age The age of the entity.
     */
    public Persona(String dni, String name, String surname, Date birthDate, String address, int age) {
	this(dni, name, surname, address, birthDate);
	this.age = age;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
	if(dni!=null) {
	    this.dni = dni;	    
	}
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	if(name!=null) {
	    this.name = name;	    
	}
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
	if(surname!=null) {
	    this.surname = surname;	    
	}
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
	if(address!=null) {
	    this.address = address;	    
	}
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
	if(birthDate!=null) {
	    this.birthDate = birthDate;	    
	}
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
	if(age>=0) {
	    this.age = age;	    
	}
    }
}
