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

package logic.entities;

import java.util.Date;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Professor {

    // Atributos
    String dni;
    String name;
    String surname;
    Date birthDate;
    String speciality;
    Course aCourse;

    /**
     * Builds the entity empty.
     */
    public Professor() {
    }

    /**
     * @param dni dni of the entity.
     */
    public Professor(String dni) {
	   this.dni = dni;
    }

    /**
     * Builds the entity with 2 params.
     * @param dni dni of the entity.
     * @param name name of the entity.
     */
    public Professor(String dni, String name) {
	   this.dni = dni;
	   this.name = name;
    }

    /**
     * Builds the entity with 3 params.
     * @param dni dni of the entity.
     * @param name name of the entity.
     * @param surname surname of the entity.
     */
    public Professor(String dni, String name, String surname) {
	   this.dni = dni;
	   this.name = name;
	   this.surname = surname;
    }

    /**
     * Builds the entity with 4 params.
     * @param dni dni of the entity.
     * @param name name of the entity.
     * @param surname surname of the entity.
     * @param birthDate BirthDate of the entity.
     */
    public Professor(String dni, String name, String surname, Date birthDate) {
	   this.dni = dni;
	   this.name = name;
	   this.surname = surname;
	   this.birthDate = birthDate;
    }

    /**
     * Builds the entity with 5 params.
     * @param dni dni of the entity.
     * @param name name of the entity.
     * @param surname surname of the entity.
     * @param birthDate BirthDate of the entity.
     * @param speciality Speciality BirthDate of the entity.
     */
    public Professor(String dni, String name, String surname, Date birthDate, String speciality) {
	   this.dni = dni;
	   this.name = name;
	   this.surname = surname;
	   this.birthDate = birthDate;
	   this.speciality = speciality;
    }

    /**
     * Builds the entity with 6 params.
     * @param dni dni of the entity.
     * @param name name of the entity.
     * @param surname surname of the entity.
     * @param birthDate BirthDate of the entity.
     * @param speciality Speciality BirthDate of the entity.
     * @param aCourse Course of the entity.
     */
    public Professor(String dni, String name, String surname, Date birthDate, String speciality, Course aCourse) {
	   this.dni = dni;
	   this.name = name;
	   this.surname = surname;
	   this.birthDate = birthDate;
	   this.speciality = speciality;
	   this.aCourse = aCourse;
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
     * @return the birthDate
     */
    public Date getBirthDate() {
	   return birthDate;
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
	   return speciality;
    }

    /**
     * @return the aCourse
     */
    public Course getaCourse() {
	   return aCourse;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
	   if (dni != null) {
		  this.dni = dni;
	   }
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
	   if (name != null) {
		  this.name = name;
	   }
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
	   if (surname != null) {
		  this.surname = surname;
	   }
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
	   if (birthDate != null) {
		  this.birthDate = birthDate;
	   }
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
	   if (speciality != null) {
		  this.speciality = speciality;
	   }
    }

    /**
     * @param aCourse the aCourse to set
     */
    public void setaCourse(Course aCourse) {
	   if (aCourse != null) {
		  this.aCourse = aCourse;
	   }
    }
    
    @Override
    public String toString() {
	   String name = getName();
	   Course aCourse = getaCourse();
	   String message = "Name: " + name + "\nCourse: " + aCourse + "\n";
	   return message;
    }

}
