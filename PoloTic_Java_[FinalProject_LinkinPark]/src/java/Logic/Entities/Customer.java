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
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Customer extends Person implements Serializable {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_customer;

    /**
     * Reserves space in memory to build the entity.
     */
    public Customer() {
    }

    /**
     * Builds the entity with 3 params.
     *
     * @param id_customer
     * @param name
     * @param surname
     */
    public Customer(int id_customer, String name, String surname) {
        super(name, surname);
        this.id_customer = id_customer;
    }

    /**
     * Gets the id of the entity.
     *
     * @return the id of the entity.
     */
    public int getId_customer() {
        return id_customer;
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Sets the id of the entity.
     *
     * @param id_customer the id to set.
     */
    public void setId_customer(int id_customer) {
        if (id_customer > 0) {
            this.id_customer = id_customer;
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
