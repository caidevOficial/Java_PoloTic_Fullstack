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

import Logic.Controller.LogicController;
import Logic.Entities.Employee;
import Logic.Entities.User;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogicController LC = new LogicController();
        
        User user1 = new User();
        user1.setPassword("1234");
        user1.setUsername("admin");
        
        Employee emp1 = new Employee();
        emp1.setName("administrador");
        emp1.setSurname("caidev");
        emp1.setEmployeeUser(user1);
        
       LC.createFullEmployee(user1, emp1);
    }
    
}
