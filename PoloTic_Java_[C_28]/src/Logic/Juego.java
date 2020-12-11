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
package Logic;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Juego implements Serializable {
    
    // Attributes
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_game;
    @Basic
    String name;
    int capacity;
    int min_age;
    @OneToMany
    List<Employee> allAmployees;
    
    /**
     * Builds the entity empty.
     */    
    public Juego() {
    }

    /**
     * Builds the entity with 5 params.
     * @param id_game the id of the entity.
     * @param name the name of the entity.
     * @param capacity the capacity of the entity.
     * @param min_age the minimun age to enter.
     * @param allAmployees list to assign to the entity.
     */
    public Juego(int id_game, String name, int capacity, int min_age, List<Employee> allAmployees) {
        this.id_game = id_game;
        this.name = name;
        this.capacity = capacity;
        this.min_age = min_age;
        this.allAmployees = allAmployees;
    }

    /**
     * Gets the list of employees of the entity.
     * @return the list of employees.
     */
    public List<Employee> getAllAmployees() {
        return allAmployees;
    }

    /**
     * Sets the list of employees to the entity.
     * @param allAmployees the list to set.
     */
    public void setAllAmployees(List<Employee> allAmployees) {
        this.allAmployees = allAmployees;
    }

    /**
     * Gets the id of the entity.
     * @return the id.
     */
    public int getId_game() {
        return id_game;
    }

    /**
     * Gets the name of the entity.
     * @return the name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the capacity of the entity.
     * @return the capaciti.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Gets the minimun age for mount into the entity.
     * @return the minimun age.
     */
    public int getMin_age() {
        return min_age;
    }

    /**
     * Sets the id of the entity.
     * @param id_game the id to set.
     */
    public void setId_game(int id_game) {
        this.id_game = id_game;
    }

    /**
     * Sets the name of the entity.
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the capacity of the entity.
     * @param capacity the capacity to set.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Sets the minimun age to mount into the entity.
     * @param min_age the minimun age to set.
     */
    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }
}
