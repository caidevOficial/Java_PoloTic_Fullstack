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
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class User implements Serializable {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_user;
    @Basic
    String username;
    String password;

    /**
     * Reserves space in memory to build the entity.
     */
    public User() {
    }

    /**
     * Builds the entity with 3 params.
     *
     * @param id_user
     * @param username
     * @param password
     */
    public User(int id_user, String username, String password) {
        this.id_user = id_user;
        this.username = username;
        this.password = password;
    }

    /**
     * Gets the id of the entity.
     *
     * @return the id of the entity.
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * Gets the username of the entity.
     *
     * @return the username of the entity.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Gets the password of the entity.
     *
     * @return the password of the entity.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the id of the entity.
     *
     * @param id_user the id to set.
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * Sets the username of the entity.
     *
     * @param username the username to set.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets the password of the entity.
     *
     * @param password the password to set.
     */
    public void setPassword(String password) {
        if (password != null && !password.equals("")) {
            this.password = password;
        }
    }
}
