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
package PersistenceDB.Controller;

import Logic.Entities.Customer;
import Logic.Entities.Employee;
import Logic.Entities.Game;
import Logic.Entities.Schedule;
import Logic.Entities.Ticket;
import Logic.Entities.User;
import PersistenceDB.CustomerJpaController;
import PersistenceDB.EmployeeJpaController;
import PersistenceDB.GameJpaController;
import PersistenceDB.ScheduleJpaController;
import PersistenceDB.TicketJpaController;
import PersistenceDB.UserJpaController;
import PersistenceDB.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class PersistenceController {

    CustomerJpaController thisNewCustomer = new CustomerJpaController();
    EmployeeJpaController thisNewEmployee = new EmployeeJpaController();
    GameJpaController thisNewGame = new GameJpaController();
    ScheduleJpaController thisNewSchedule = new ScheduleJpaController();
    TicketJpaController thisNewTicket = new TicketJpaController();
    UserJpaController thisNewUser = new UserJpaController();

    // <editor-fold defaultstate="collapsed" desc="CREATE AREA. Click on the + sign on the left to edit the code.">
    //=========================================================
    
    /**
     * 
     * @param newUser
     * @return 
     */
    public boolean createUser(User newUser) {
        boolean success = false;
        try {
            thisNewUser.create(newUser);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el usuario.");
        }
        return success;
    }

    /**
     * 
     * @param newEmployee
     * @return 
     */
    public boolean createEmployee(Employee newEmployee) {
        boolean success = false;
        try {
            thisNewEmployee.create(newEmployee);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el empleado.");
        }
        return success;
    }

    /**
     * 
     * @param newGame
     * @return 
     */
    public boolean createGame(Game newGame) {
        boolean success = false;
        try {
            thisNewGame.create(newGame);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el juego.");
        }
        return success;
    }

    /**
     * 
     * @param newTicket
     * @return 
     */
    public boolean createTicket(Ticket newTicket) {
        boolean success = false;
        try {
            thisNewTicket.create(newTicket);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el Ticket.");
        }
        return success;
    }

    /**
     * 
     * @param newSchedule
     * @return 
     */
    public boolean createSchedule(Schedule newSchedule) {
        boolean success = false;
        try {
            thisNewSchedule.create(newSchedule);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el Horario.");
        }
        return success;
    }

    /**
     * 
     * @param newCustomer
     * @return 
     */
    public boolean createCustomer(Customer newCustomer) {
        boolean success = false;
        try {
            thisNewCustomer.create(newCustomer);
            success = true;
        } catch (Exception e) {
            System.out.println("Error al crear el Cliente.");
        }
        return success;
    }

    // <editor-fold defaultstate="collapsed" desc="GET AREA. Click on the + sign on the left to edit the code.">
    //=========================================================
    
    /**
     * 
     * @return 
     */
    public List<User> getUsers() {
        return thisNewUser.findUserEntities();
    }

    /**
     * 
     * @param idUser
     * @return 
     */
    public User getUserByID(int idUser) {
        return thisNewUser.findUser(idUser);
    }

    /**
     * 
     * @param gameid
     * @return 
     */
    public Game getGameById(int gameid) {
        return thisNewGame.findGame(gameid);
    }

    /**
     * 
     * @return 
     */
    public List<Game> getGames() {
        return thisNewGame.findGameEntities();
    }

    /**
     * 
     * @return 
     */
    public List<Employee> getEmployees() {
        return thisNewEmployee.findEmployeeEntities();
    }

    /**
     * 
     * @return 
     */
    public List<Schedule> getSchedules() {
        return thisNewSchedule.findScheduleEntities();
    }

    /**
     * 
     * @param iEmployee
     * @return 
     */
    public Employee getEmployeeByID(int iEmployee) {
        return thisNewEmployee.findEmployee(iEmployee);
    }

    /**
     * 
     * @return 
     */
    public int getEmployeeCount() {
        return thisNewEmployee.getEmployeeCount();
    }

    /**
     * 
     * @param idGame
     * @return 
     */
    public Game getGameByID(int idGame) {
        return thisNewGame.findGame(idGame);
    }

    /**
     * 
     * @return 
     */
    public List<Ticket> getTickets() {
        return thisNewTicket.findTicketEntities();
    }

    /**
     * 
     * @param id_Ticket
     * @return 
     */
    public Ticket getTicketByID(int id_Ticket) {
        return thisNewTicket.findTicket(id_Ticket);
    }

    /**
     * 
     * @return 
     */
    public List<Customer> getCustomers() {
        return thisNewCustomer.findCustomerEntities();
    }

    /**
     * 
     * @param id_Customer
     * @return 
     */
    public Customer getCustomerByID(int id_Customer) {
        return thisNewCustomer.findCustomer(id_Customer);
    }

    // <editor-fold defaultstate="collapsed" desc="EDIT AREA. Click on the + sign on the left to edit the code.">  
    //=========================================================
    
    /**
     * 
     * @param thisEmployee 
     */
    public void editEmployee(Employee thisEmployee) {
        try {
            thisNewEmployee.edit(thisEmployee);
            System.out.println("Employee updated successfully!");
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("something get wrong with the update of the Employee!");
        }
    }

    /**
     * 
     * @param newUser 
     */
    public void editUser(User newUser) {
        try {
            thisNewUser.edit(newUser);
            System.out.println("User updated successfully!");
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("something get wrong with the update of the User!");
        }
    }

    /**
     * 
     * @param thisGame
     * @return 
     */
    public boolean editGame(Game thisGame) {
        try {
            thisNewGame.edit(thisGame);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /**
     * 
     * @param thisTicket
     * @return 
     */
    public boolean editTicket(Ticket thisTicket) {
        try {
            thisNewTicket.edit(thisTicket);
            return true;
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="DELETE AREA. Click on the + sign on the left to edit the code.">
    //=========================================================
    
    /**
     * 
     * @param id
     * @return 
     */
    public boolean deleteUser(int id) {
        try {
            thisNewUser.destroy(id);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /**
     * 
     * @param id_Ticket
     * @return 
     */
    public boolean deleteTicket(int id_Ticket) {
        try {
            thisNewTicket.destroy(id_Ticket);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /**
     * 
     * @param id_customer
     * @return 
     */
    public boolean deleteCustomer(int id_customer) {
        try {
            thisNewCustomer.destroy(id_customer);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * 
     * @param idEmployee
     * @return 
     */
    public boolean deleteEmployee(int idEmployee) {
        try {
            thisNewEmployee.destroy(idEmployee);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /**
     * 
     * @param id_Game
     * @return 
     */
    public boolean deleteGame(int id_Game) {
        try {
            thisNewGame.destroy(id_Game);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    /**
     * 
     * @param id_schedule
     * @return 
     */
    public boolean deleteSchedule(int id_schedule) {
        try {
            thisNewSchedule.destroy(id_schedule);
            return true;
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
 
}
