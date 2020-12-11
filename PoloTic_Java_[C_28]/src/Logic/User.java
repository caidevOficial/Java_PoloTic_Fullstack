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

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class User implements Serializable {
    
    // Attributes
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int userID;
    
    @Basic
    String userName;
    String password;

    /**
     * Builds the entity empty.
     */
    public User() {
    }

    /**
     * Builds the entity with 3 params.
     * @param userID the id of the entity.
     * @param userName the username of the entity.
     * @param password  the password of the entity.
     */
    public User(int userID, String userName, String password) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
    }

    /**
     * Gets the id of the entity.
     * @return the id.
     */
    public int getUserID() {
        return userID;
    }

    /**
     * gets the username of the entity.
     * @return the username.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Gets the password of the entity.
     * @return the password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the id of the entity.
     * @param userID the id to set.
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Sets the username of the entity.
     * @param userName the username to set.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Sets the password of the entity.
     * @param password the password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
