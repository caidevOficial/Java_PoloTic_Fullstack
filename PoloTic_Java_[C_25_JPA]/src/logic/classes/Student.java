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
package logic.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Student implements Serializable {

    // Attributes
    @Id
    protected String dni;
    @Basic
    protected String name;
    protected String surname;
    @Temporal(TemporalType.DATE)
    protected Date birthDate;
    
    // Builders
    /**
     * Builds the entity with empty values.
     */
    public Student() {
    }

    /**
     * Builds the entity with 1 param.
     * @param dni 
     */
    public Student(String dni) {
        this();
        this.dni = dni;
    }

    /**
     * Builds the entity with 2 params.
     * @param dni
     * @param name 
     */
    public Student(String dni, String name) {
        this(dni);
        this.name = name;
    }

    /**
     * Builds the entity with 3 params.
     * @param dni
     * @param name
     * @param surname 
     */
    public Student(String dni, String name, String surname) {
        this(dni, name);
        this.surname = surname;
    }

    /**
     * Builds the entity with 4 params.
     * @param dni
     * @param name
     * @param surname
     * @param birthDate 
     */
    public Student(String dni, String name, String surname, Date birthDate) {
        this(dni, name, surname);
        this.birthDate = birthDate;
    }

    /**
     * gets the dni of the entity.
     * @return the dni.
     */
    public String getDni() {
        return dni;
    }

    /**
     *  gets the name of the entity.
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * gets the surname of the entity.
     * @return  the surname.
     */
    public String getSurname() {
        return surname;
    }

    /**
     *  gets the birth date of the entity.
     * @return the birth date.
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * sets the dni of the entity.
     * @param dni dni of the entity.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * sets the name of the entity.
     * @param name name of the entity.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets the surname of the entity.
     * @param surname surname of the entity.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     *  sets the birth date of the entity.
     * @param birthDate birth date  of the entity.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
