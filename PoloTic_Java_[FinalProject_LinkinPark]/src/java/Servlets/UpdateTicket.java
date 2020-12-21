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
package Servlets;

import Logic.Controller.LogicController;
import Logic.Entities.Ticket;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author <FacuFalcone - CaidevOficial> Copyright (C) 2020
 */
public class UpdateTicket extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        LogicController LC = new LogicController();
        Ticket thisTicket = new Ticket();
        
        int id_Ticket = Integer.parseInt(request.getParameter("id_Ticket"));
        int id_Customer = Integer.parseInt(request.getParameter("id_Customer"));
        int id_Game = Integer.parseInt(request.getParameter("id_Game"));
        String time = request.getParameter("time");
        
        if(LC.checkGameByID(id_Game) && LC.checkTicketByID(id_Ticket) && LC.checkCustomerByID(id_Customer)){
            thisTicket = LC.getTicketByID(id_Ticket);
            thisTicket.setCustomerOwner(LC.getCustomerByID(id_Customer));
            thisTicket.setGameAssigned(LC.getGameByID(id_Game));
            thisTicket.setTime(LC.deStringToDate(time));
            
            if(LC.editTicket(thisTicket)){
                response.sendRedirect("successTicket.jsp");
            }else{
                response.sendRedirect("errorTicket.jsp");
            }
        }else{
            response.sendRedirect("noExistTicket.jsp");
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
