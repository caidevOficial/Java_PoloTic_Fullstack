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
public class Game implements Serializable {

    // Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_game;
    @Basic
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Schedule gameTime;
    @OneToOne
    private Employee employeeOfGame;

    /**
     * Reserves space in memory to build the entity.
     */
    public Game() {
    }

    /**
     *
     * @param id_game
     * @param name
     * @param gameTime
     * @param employeeOfGame
     */
    public Game(int id_game, String name, Schedule gameTime, Employee employeeOfGame) {
        this.id_game = id_game;
        this.name = name;
        this.gameTime = gameTime;
        this.employeeOfGame = employeeOfGame;
    }

    /**
     *
     * @return
     */
    public Schedule getGameTime() {
        return gameTime;
    }

    /**
     *
     * @param gameTime
     */
    public void setGameTime(Schedule gameTime) {
        if (gameTime != null) {
            this.gameTime = gameTime;
        }
    }

    /**
     *
     * @return
     */
    public Employee getEmployeeOfGame() {
        return employeeOfGame;
    }

    public void setEmployeeOfGame(Employee employeeOfGame) {
        if (employeeOfGame != null) {
            this.employeeOfGame = employeeOfGame;
        }
    }

    /**
     * Gets the id of the entity.
     *
     * @return the id of the entity.
     */
    public int getId_game() {
        return id_game;
    }

    /**
     * Gets the name of the entity.
     *
     * @return the name of the entity.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the id of the entity.
     *
     * @param id_game the id to set.
     */
    public void setId_game(int id_game) {
        if (id_game > 0) {
            this.id_game = id_game;
        }
    }

    /**
     * Sets the name of the entity.
     *
     * @param name the name to set.
     */
    public void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        }
    }
}
