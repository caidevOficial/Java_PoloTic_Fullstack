/*
 * Copyright (C) 2020 <FacuFalcone - CaidevOficial>
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

package Logic.Entities;

import javax.persistence.Basic;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

/**
 * @author FacuFalcone - CaidevOficial
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
    
    // Attributes
    @Basic
    protected String name;
    protected String surname;

    /**
     * Reserves space in memory to build the entity.
     */
    public Person() {
    }

    /**
     * Builds the entity with 2 params.
     * @param name
     * @param surname 
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    /**
     * Gets the name of the entity.
     * @return the name of the entity.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the surname of the entity.
     * @return the surname of the entity.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the name of the entity.
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the surname of the entity.
     * @param surname the surname to set.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
