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

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Employee extends Person implements Serializable {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_employee;
    @OneToOne(cascade = CascadeType.ALL)
    private User employeeUser;

    /**
     * Reserves space in memory to build the entity.
     */
    public Employee() {
    }

    /**
     * Builds the entity with 4 params.
     *
     * @param id_employee
     * @param employeeUser
     * @param name
     * @param surname
     */
    public Employee(int id_employee, User employeeUser, String name, String surname) {
        super(name, surname);
        this.id_employee = id_employee;
        this.employeeUser = employeeUser;
    }

    /**
     * Gets the id of the entity.
     *
     * @return the id of the entity.
     */
    public int getId_employee() {
        return id_employee;
    }

    /**
     * Gets the complete user of the entity.
     *
     * @return the full user of the entity.
     */
    public User getEmployeeUser() {
        return employeeUser;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    /**
     * Sets the id of the entity.
     *
     * @param id_employee the id to set.
     */
    public void setId_employee(int id_employee) {
        if (id_employee > 0) {
            this.id_employee = id_employee;
        }
    }

    /**
     * Sets the full user of the entity.
     *
     * @param employeeUser the user to set in the entity.
     */
    public void setEmployeeUser(User employeeUser) {
        if (employeeUser != null) {
            this.employeeUser = employeeUser;
        }
    }

    @Override
    public void setSurname(String surname) {
        if (surname != null && !surname.equals("")) {
            super.setSurname(surname);
        }
    }

    @Override
    public void setName(String name) {
        if (name != null && !name.equals("")) {
            super.setName(name);
        }
    }
}
