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
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author FacuFalcone - CaidevOficial
 */
@Entity
public class Ticket implements Serializable {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id_ticket;
    @Temporal(TemporalType.DATE)
    Date time;
    @OneToOne
    Game gameAssigned;
    @OneToOne(cascade = CascadeType.ALL)
    Customer customerOwner;

    /**
     * Reserves space in memory to build the entity.
     */
    public Ticket() {
    }

    /**
     * Builds the entity with 4 params.
     *
     * @param id_ticket
     * @param time
     * @param gameAssigned
     * @param customerOwner
     */
    public Ticket(int id_ticket, Date time, Game gameAssigned, Customer customerOwner) {
        this.id_ticket = id_ticket;
        this.time = time;
        this.gameAssigned = gameAssigned;
        this.customerOwner = customerOwner;
    }

    /**
     * Gets the id of the entity.
     *
     * @return the id of the entity.
     */
    public int getId_ticket() {
        return id_ticket;
    }

    /**
     * Gets the time of the entity.
     *
     * @return the time of the entity.
     */
    public Date getTime() {
        return time;
    }

    /**
     * Gets the game assigned to the entity.
     *
     * @return the game assigned.
     */
    public Game getGameAssigned() {
        return gameAssigned;
    }

    /**
     * Gets the owner of the entity.
     *
     * @return the owner of the entity.
     */
    public Customer getCustomerOwner() {
        return customerOwner;
    }

    /**
     * Sets the id of the entity.
     *
     * @param id_ticket the id to set.
     */
    public void setId_ticket(int id_ticket) {
        if (id_ticket > 0) {
            this.id_ticket = id_ticket;
        }
    }

    /**
     * Sets the time of the entity.
     *
     * @param time the time to set.
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * Sets the game assigned of the entity.
     *
     * @param gameAssigned the game to set.
     */
    public void setGameAssigned(Game gameAssigned) {
        if (gameAssigned != null) {
            this.gameAssigned = gameAssigned;
        }
    }

    /**
     * Sets the owner of the entity.
     *
     * @param customerOwner the owner to set.
     */
    public void setCustomerOwner(Customer customerOwner) {
        if (customerOwner != null) {
            this.customerOwner = customerOwner;
        }
    }
}
