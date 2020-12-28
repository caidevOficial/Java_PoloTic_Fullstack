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
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Employee implements Serializable {
    
    // Attributes
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int employeeID;
    @Basic
    String dni;
    String name;
    String charge;
    
    @OneToOne
    User user;

    /**
     * Builds the entity empty.
     */
    public Employee() {
    }

    /**
     * Builds the entity with 5 params.
     * @param employeeID the id of the entity.
     * @param dni the dni of the entity.
     * @param name the name of the entity.
     * @param chargethe charge in the enterprise of the entity.
     * @param newUser the user of the entity.
     */
    public Employee(int employeeID, String dni, String name, String charge, User newUser) {
        this.employeeID = employeeID;
        this.dni = dni;
        this.name = name;
        this.charge = charge;
        this.user = newUser;
    }

    /**
     * Returns the user of the entity.
     * @return the user.
     */
    public User getUser() {
        return user;
    }

    /**
     * Returns the id of the entity.
     * @return the id.
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Returns the dni of the entity.
     * @return the dni.
     */
    public String getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    /**
     * Returns the charge of the entity.
     * @return the charge.
     */
    public String getCharge() {
        return charge;
    }

    /**
     * Sets the user of the entity.
     * @param user User to set.
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Sets the id of the entity.
     * @param employeeID the id to set.
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Sets the dni of the entity.
     * @param dni the dni to set.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Sets the name of the entity.
     * @param name the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the charge of the entity.
     * @param charge the charge to set.
     */
    public void setCharge(String charge) {
        this.charge = charge;
    }
}
