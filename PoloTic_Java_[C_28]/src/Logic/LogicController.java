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

import Persist.PersistenceController;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class LogicController {
    
    PersistenceController PC = new PersistenceController();
    
    /**
     * Creates the user into the DB.
     * @param newUser the user to create.
     * @return True if can create the user, otherwise returns false.
     */
    private boolean createUser(User newUser){
        boolean success = false;
        if(PC.createUser(newUser)){
            success = true;
        }
        System.out.println("LC create:" + success);
        return success;
    }
    
    /**
     * Creates the user and the employee into the DB.
     * @param newUser the user to create.
     * @param newEmployee the employee to create.
     * @return 
     */
    public boolean createFullEmployee(User newUser, Employee newEmployee){
        boolean success = false;
        if(PC.createUser(newUser) && PC.createEmployee(newEmployee)){
            success = true;
        }
        System.out.println("LC create User, Employee:" + success);
        return success;
    }
    
    /**
     * Creates the game into the DB.
     * @param newGame the game to create.
     * @return True if can create the game, otherwise returns false.
     */
    public boolean createGame(Juego newGame){
        boolean success = false;
        if(PC.createGame(newGame)){
            success = true;
        }
        System.out.println("LC create Game:" + success);
        return success;
    }
}
