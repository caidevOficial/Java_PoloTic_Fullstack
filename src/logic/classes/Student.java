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
    public Student() {
    }

    public Student(String dni) {
        this();
        this.dni = dni;
    }

    public Student(String dni, String name) {
        this(dni);
        this.name = name;
    }

    public Student(String dni, String name, String surname) {
        this(dni, name);
        this.surname = surname;
    }

    public Student(String dni, String name, String surname, Date birthDate) {
        this(dni, name, surname);
        this.birthDate = birthDate;
    }

    /**
     * 
     * @return 
     */
    public String getDni() {
        return dni;
    }

    /**
     * 
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @return 
     */
    public String getSurname() {
        return surname;
    }

    /**
     * 
     * @return 
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 
     * @param dni 
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @param surname 
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * 
     * @param birthDate 
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
