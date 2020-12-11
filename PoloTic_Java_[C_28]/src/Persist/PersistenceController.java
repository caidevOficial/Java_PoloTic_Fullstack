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
package Persist;

import Logic.Employee;
import Logic.Juego;
import Logic.User;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class PersistenceController {
   
     EmployeeJpaController newEmployee = new EmployeeJpaController();
     UserJpaController newUser = new UserJpaController();
     JuegoJpaController newGame = new JuegoJpaController();
     
    public boolean createEmployee(Employee thisNewEmployee){
        boolean success = false;
        try {
            newEmployee.create(thisNewEmployee);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el empleado.");
        }
        return success;
    }
    
    public boolean createUser(User thisNewUser){
        boolean success = false;
        try {
            newUser.create(thisNewUser);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el usuario.");
        }
        return success;
    }
    
    public boolean createGame(Juego thisNewGame){
        boolean success = false;
        try {
            newGame.create(thisNewGame);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el juego.");
        }
        return success;
    }
}
