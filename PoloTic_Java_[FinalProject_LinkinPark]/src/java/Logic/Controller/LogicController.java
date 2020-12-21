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
package Logic.Controller;

import Logic.Entities.Customer;
import Logic.Entities.Employee;
import Logic.Entities.Game;
import Logic.Entities.Schedule;
import Logic.Entities.Ticket;
import Logic.Entities.User;
import PersistenceDB.Controller.PersistenceController;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author FacuFalcone - CaidevOficial
 */
public class LogicController {

    PersistenceController PC = new PersistenceController();

    // <editor-fold defaultstate="collapsed" desc="CREATE AREA. Click on the + sign on the left to edit the code.">
    /**
     * Creates the user into the DB.
     *
     * @param newUser the user to create.
     * @return True if can create the user, otherwise returns false.
     */
    public boolean createUser(User newUser) {
        boolean success = false;
        if (PC.createUser(newUser)) {
            success = true;
        }
        System.out.println("LC create:" + success);
        return success;
    }

    /**
     * Creates the employee into the DB.
     *
     * @param newEmployee the employee to create.
     * @return
     */
    public boolean createEmployee(Employee newEmployee) {
        boolean success = false;
        if (PC.createEmployee(newEmployee)) {
            success = true;
        }
        System.out.println("LC create Employee:" + success);
        return success;
    }

    /**
     * Creates the user and the employee into the DB.
     *
     * @param newUser the user to create.
     * @param newEmployee the employee to create.
     * @return
     */
    public boolean createFullEmployee(User newUser, Employee newEmployee) {
        boolean success = false;
        if (PC.createUser(newUser) && PC.createEmployee(newEmployee)) {
            success = true;
        }
        System.out.println("LC create User, Employee:" + success);
        return success;
    }

    /**
     * Creates the game into the DB.
     *
     * @param newGame the game to create.
     * @return True if can create the game, otherwise returns false.
     */
    public boolean createGame(Game newGame) {
        boolean success = false;
        if (PC.createGame(newGame)) {
            success = true;
        }
        System.out.println("LC create Game:" + success);
        return success;
    }

    /**
     * Creates the ticket into the DB.
     *
     * @param newTicket the ticket to create.
     * @return True if can create the ticket, otherwise returns false.
     */
    public boolean createTicket(Ticket newTicket) {
        boolean success = false;
        if (PC.createTicket(newTicket)) {
            success = true;
        }
        System.out.println("LC create Ticket:" + success);
        return success;
    }

    /**
     * Creates the Schedule into the DB.
     *
     * @param newSchedule the Schedule to create.
     * @return True if can create the ticket, otherwise returns false.
     */
    public boolean createSchedule(Schedule newSchedule) {
        boolean success = false;
        if (PC.createSchedule(newSchedule)) {
            success = true;
        }
        System.out.println("LC create Schedule:" + success);
        return success;
    }

    /**
     * Creates the Customer into the DB.
     *
     * @param newCustomer the Customer to create.
     * @return True if can create the ticket, otherwise returns false.
     */
    public boolean createCustomer(Customer newCustomer) {
        boolean success = false;
        if (PC.createCustomer(newCustomer)) {
            success = true;
        }
        System.out.println("LC create Customer:" + success);
        return success;
    }

    // <editor-fold defaultstate="collapsed" desc="CHECK AREA. Click on the + sign on the left to edit the code.">
    /**
     * Checks if the user exist.
     *
     * @param username username of the entity.
     * @param password password of the entity.
     * @return return true if exist, otherwise false.
     */
    public boolean checkIN(String username, String password) {
        boolean exist = false;
        List<User> allUsers = new ArrayList<User>();
        allUsers = PC.getUsers();

        for (User thisUser : allUsers) {
            if (thisUser.getUsername().equals(username) && thisUser.getPassword().equals(password)) {
                //return true;
                exist = true;
                return exist;
            }
        }
        return exist;
    }

    /**
     * Checks if the user exist.
     *
     * @param username username of the entity.
     * @return return true if exist, otherwise false.
     */
    public boolean checkUser(String username) {
        boolean exist = false;
        //List<User> allUsers = new ArrayList<User>();
        List<User> allUsers = allUsers = PC.getUsers();

        for (User thisUser : allUsers) {
            if (thisUser.getUsername().equals(username)) {
                exist = true;
                return exist;
            }
        }
        return exist;
    }

    /**
     * Checks if the user exist by it's ID.
     *
     * @param idUser id of the entity.
     * @return return true if exist, otherwise false.
     */
    public boolean checkUserByID(int idUser) {
        boolean exist = false;
        User theUser;
        theUser = PC.getUserByID(idUser);

        if (theUser != null) {
            exist = true;
        }

        return exist;
    }

    /**
     * Checks if the employee exist by it's ID.
     *
     * @param iEmployee id of the entity.
     * @return return true if exist, otherwise false.
     */
    public boolean checkEmployeeByID(int iEmployee) {
        boolean exist = false;
        Employee theEmployee = PC.getEmployeeByID(iEmployee);

        if (theEmployee != null) {
            exist = true;
        }

        return exist;
    }

    /**
     * Checks if the game exist.
     *
     * @param id_Game id of the game.
     * @return true if exist, otherwise false.
     */
    public boolean checkGameByID(int id_Game) {
        Game theGame = PC.getGameByID(id_Game);

        if (theGame != null) {
            return true;
        }

        return false;
    }

    /**
     * Checks if the ticket exist.
     *
     * @param id_Ticket id of the ticket.
     * @return true if exist, otherwise false.
     */
    public boolean checkTicketByID(int id_Ticket) {
        Ticket theTicket = PC.getTicketByID(id_Ticket);

        if (theTicket != null) {
            return true;
        }

        return false;
    }

    /**
     * Checks if the customer exist.
     *
     * @param id_Customer id of the costumer.
     * @return true if exist, otherwise false.
     */
    public boolean checkCustomerByID(int id_Customer) {
        Customer theCustomer = PC.getCustomerByID(id_Customer);

        if (theCustomer != null) {
            return true;
        }

        return false;
    }

    // <editor-fold defaultstate="collapsed" desc="GET AREA. Click on the + sign on the left to edit the code.">
    /**
     * Gets the user by its ID.
     *
     * @param idUser the id of the user.
     * @return the user.
     */
    public User getUserByID(int idUser) {
        return PC.getUserByID(idUser);
    }

    /**
     * Gets the game by it's id.
     *
     * @param idGame the id of the game
     * @return the game.
     */
    public Game getGameByID(int idGame) {
        return PC.getGameByID(idGame);
    }

    /**
     * Gets the employee by its ID.
     *
     * @param idEmployee the id of the user.
     * @return the employee.
     */
    public Employee getEmployeeByID(int idEmployee) {
        return PC.getEmployeeByID(idEmployee);
    }

    /**
     * Gets the ticket by it's id.
     *
     * @param id_Ticket the id of the ticket.
     * @return the ticket.
     */
    public Ticket getTicketByID(int id_Ticket) {
        return PC.getTicketByID(id_Ticket);
    }

    /**
     * Gets the customer by it's id.
     *
     * @param id_Customer the id of the customer.
     * @return the customer.
     */
    public Customer getCustomerByID(int id_Customer) {
        return PC.getCustomerByID(id_Customer);
    }

    /**
     * Gets the list of games.
     *
     * @return the list of games.
     */
    public List<Game> getAllGames() {
        return PC.getGames();
    }

    /**
     * Gets the list of users.
     *
     * @return the list of users.
     */
    public List<User> getAllUsers() {
        return PC.getUsers();
    }

    /**
     * Gets the list of employees.
     *
     * @return the list of employees.
     */
    public List<Employee> getAllEmployees() {
        return PC.getEmployees();
    }

    /**
     * Gets the list of customers.
     *
     * @return the list of customers.
     */
    public List<Customer> getAllCustomers() {
        return PC.getCustomers();
    }

    /**
     * Gets the quantity of employees.
     *
     * @return the quantity of employees in the DB.
     */
    public int getEmployeeCount() {
        return PC.getEmployeeCount();
    }

    /**
     * Gets the list of schedules.
     *
     * @return the list of schedules.
     */
    public List<Schedule> getAllSchedules() {
        return PC.getSchedules();
    }

    /**
     * Gets the list of tickets.
     *
     * @return the list of tickets.
     */
    public List<Ticket> getAllTickets() {
        return PC.getTickets();
    }

    //Metodo usado para obtener la hora actual del sistema
    //@return Retorna un STRING con la hora actual formato "hh:mm"
    public static String getActualTime() {
        Date rightNow = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("hh:mm");
        return formater.format(rightNow);
    }

    // <editor-fold defaultstate="collapsed" desc="DATE AREA. Click on the + sign on the left to edit the code.">
    //Convertir Hora a String
    public static Date convertirHoraStringADate(String hora, String minutos) throws ParseException {

        String horaString = hora + ":" + minutos;
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        Date horaCompleta = new Date();

        horaCompleta = formatoHora.parse(horaString);

        System.out.println("La hora es: " + horaCompleta);
        return horaCompleta;
    }

    /**
     * Transform a string into a Date format.
     *
     * @param fecha String to convert.
     * @return the string converted into a Date format.
     */
    public static synchronized Date deStringToDate(String fecha) {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd"); //formato guión
        Date fechaEnviar = null;
        try {
            fechaEnviar = df.parse(fecha);
            return fechaEnviar;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * Converts a Date into a String.
     *
     * @param thisDate the date to convert.
     * @return Date converted into a string.
     */
    public static String DatetoString(Date thisDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:ii");
        return dateFormat.format(thisDate);
    }

    // <editor-fold defaultstate="collapsed" desc="DELETE AREA. Click on the + sign on the left to edit the code.">
    /**
     * Deletes a user by it's id.
     *
     * @param id the id of the user to delete.
     * @return true if can, otherwise false.
     */
    public boolean deleteUser(int id) {
        return PC.deleteUser(id);
    }

    /**
     * Deletes a employee and a user by their id.
     *
     * @param idEmployee id of the employee to delete.
     * @param idUser id of the user to delete.
     * @return true if can, otherwise false.
     */
    public boolean deleteEmployee(int idEmployee, int idUser) {
        return PC.deleteUser(idUser) && PC.deleteEmployee(idEmployee);
    }

    /**
     * Deletes a game by it's id.
     *
     * @param id_Game id of the game to delete.
     * @return true if can, otherwise false.
     */
    public boolean deleteGame(int id_Game) {
        return PC.deleteGame(id_Game);
    }

    /**
     * Deletes a schedule by it's id.
     *
     * @param id_schedule id of the schedule.
     * @return true if can, otherwise false.
     */
    public boolean deleteSchedule(int id_schedule) {
        return PC.deleteSchedule(id_schedule);
    }

    /**
     * Deletes a ticket by it's id.
     *
     * @param id_Ticket the id of the ticket to delete.
     * @return true if can, otherwise false.
     */
    public boolean deleteTicket(int id_Ticket) {
        return PC.deleteTicket(id_Ticket);
    }

    /**
     * Deletes a customer by it's id.
     *
     * @param id_customer the id of the customer to delete.
     * @return true if can, otherwise false.
     */
    public boolean deleteCustomer(int id_customer) {
        return PC.deleteCustomer(id_customer);
    }

    // <editor-fold defaultstate="collapsed" desc="GET AREA. Click on the + sign on the left to edit the code.">
    /**
     * Edits a ticket.
     *
     * @param thisTicket ticket to edit.
     * @return true if can, otherwise false.
     */
    public boolean editTicket(Ticket thisTicket) {
        return PC.editTicket(thisTicket);
    }

    /**
     * Edits a game.
     *
     * @param thisGame game to edit.
     * @return true if can, otherwise false.
     */
    public boolean editGame(Game thisGame) {
        return PC.editGame(thisGame);
    }

    /**
     * Edits an employee.
     *
     * @param thisEmployee employee to edit.
     */
    public void editEmployee(Employee thisEmployee) {
        PC.editEmployee(thisEmployee);
    }

    /**
     * Edits a user.
     *
     * @param newUser user to edit.
     */
    public void editUser(User newUser) {
        PC.editUser(newUser);
    }
}
