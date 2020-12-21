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
import Logic.Entities.Game;
import Logic.Entities.Schedule;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author <FacuFalcone - CaidevOficial> Copyright (C) 2020
 */
public class UpdateGame extends HttpServlet {

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
        Schedule thisTime = new Schedule();
        Game thisGame = new Game();
        int id_Game = Integer.parseInt(request.getParameter("id_game"));
        String gameName = request.getParameter("gameName");
        int id_employee = Integer.parseInt(request.getParameter("id_employee"));
        String fromHour = request.getParameter("timeFromHours");
        String fromMinutes = request.getParameter("timeFromMinutes");
        String toHours = request.getParameter("timeToHours");
        String toMinutes = request.getParameter("timeToMinutes");

        if (LC.checkEmployeeByID(id_employee) && LC.checkGameByID(id_Game)) {
            thisGame = LC.getGameByID(id_Game);
            try {
                thisTime.setTimeFrom(LogicController.convertirHoraStringADate(fromHour, fromMinutes));
                thisTime.setTimeTo(LogicController.convertirHoraStringADate(toHours, toMinutes));
            } catch (ParseException ex) {
                response.sendRedirect("errorGame.jsp");
                Logger.getLogger(RegisterGame.class.getName()).log(Level.SEVERE, null, ex);
            }

            thisGame.setGameTime(thisTime);
            thisGame.setName(gameName);
            thisGame.setEmployeeOfGame(LC.getEmployeeByID(id_employee));

            if (LC.editGame(thisGame)) {
                response.sendRedirect("successGame.jsp");
                System.out.println("Despues del success");
            } else {
                response.sendRedirect("errorGame.jsp");
            }
        } else {
            response.sendRedirect("errorGame.jsp");
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
