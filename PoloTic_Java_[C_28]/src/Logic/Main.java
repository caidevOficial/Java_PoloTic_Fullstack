/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ONLY FOR PRACTICE PURPOSES!
        LogicController LC = new LogicController();
        
        User user1 = new User();
        user1.setUserName("Facundo");
        user1.setPassword("1234");
        User user2 = new User();
        user2.setUserName("Caidev");
        user2.setPassword("1234");
        
        Employee emp1 = new Employee();
        emp1.setDni("11222444");
        emp1.setName("FacuFalcone");
        emp1.setCharge("Supervisor");
        emp1.setUser(user1);
        
        Employee emp2 = new Employee();
        emp2.setDni("11222443");
        emp2.setName("CaidevSama");
        emp2.setCharge("Empleado");
        emp2.setUser(user2);
        
        LC.createFullEmployee(user1, emp1);
        LC.createFullEmployee(user2, emp2);
        
        List<Employee> allEmployees = new ArrayList<Employee>();
        allEmployees.add(emp1);
        allEmployees.add(emp2);
                
        Juego game1 = new Juego();
        game1.setName("Tren Fantasma");
        game1.setCapacity(10);
        game1.setMin_age(10);
        game1.setAllAmployees(allEmployees);
        
        LC.createGame(game1);

    }
}
