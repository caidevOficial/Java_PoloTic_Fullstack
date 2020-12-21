<%-- 
    Document   : deleteEmployee
    Created on : 18 dic. 2020, 16:32:38
    Author     : <FacuFalcone - CaidevOficial> Copyright (C) 2020
--%>

<%@page import="Logic.Entities.Ticket"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Controller.LogicController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Delete Tickets</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="apple-mobile-web-app-capable" content="yes"> 

        <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />

        <link href="resources/css/font-awesome.css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">

        <link href="resources/css/style.css" rel="stylesheet" type="text/css">
        <link href="resources/css/pages/signin.css" rel="stylesheet" type="text/css">
        <link href="resources/css/pages/dashboard.css" rel="stylesheet">
    </head>
    <body>
        <%
            HttpSession thisSession = request.getSession(true);
            String user = (String) request.getSession().getAttribute("theUsername");

           /*
            if (user == null) {
                response.sendRedirect("error.jsp");
            } else {*/
                LogicController LC = new LogicController();
                thisSession.setAttribute("control", LC);
        %>
        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container">
                    <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </a>

                    <a class="brand" href="#">
                        Delete Ticket				
                    </a>		

                    <div class="nav-collapse">
                        <ul class="nav pull-right">
                            <li class="">						
                                <a href="management.jsp" class="">
                                    <i class="icon-chevron-left"></i>
                                    Back to Management page
                                </a>

                            </li>
                        </ul>
                    </div><!--/.nav-collapse -->	
                </div> <!-- /container -->
            </div> <!-- /navbar-inner -->
        </div> <!-- /navbar -->

        <div class="container-fluid cata-flex">
            <div class="row">
                <div class="span5 ">
                    <!-- TABLA DE Empleados --> 
                    <div class="widget widget-table action-table">
                        <div class="widget-header"> <i class="icon-th-list"></i>
                            <h3>Tickets List</h3>
                        </div>
                        <div class="widget-content">
                            <table class="table table-striped table-bordered">
                                <thead>
                                    <tr>
                                        <th><center>ID Ticket</center></th>
                                <th><center>Game</center></th>
                                <th><center>Time</center></th>
                                <th><center>Customer</center></th>
                                </tr>
                                </thead>

                                <tbody>
                                    <tr>
                                        <%
                                            List<Ticket> allTickets = LC.getAllTickets();
                                            for (Ticket thisTicket : allTickets) {
                                        %>
                                        <td><center><%=thisTicket.getId_ticket()%></center></td>
                                <td><center><%=thisTicket.getGameAssigned().getName()%></center></td>
                            <td><center><%=thisTicket.getTime()%></center></td>
                                <td><center><%=thisTicket.getCustomerOwner().getSurname()%>, <%=thisTicket.getCustomerOwner().getName()%></center></td>
                                </tr>
                                <% }%>
                                </tbody>
                            </table>
                        </div> 
                    </div> 

                    <!-- TABLA DE ABAJO --> 

                    <div class="account-container register ">
                        <div class="content clearfix widget">
                            <form action="DeleteTicket" method="POST">
                                <h1>Delete Ticket</h1>			
                                <div class="login-fields">
                                    <p>Remember that it will delete the Ticket!</p>
                                    <div class="field">
                                        <label for="user">ID for Delete:</label>
                                        <input type="text" id="game" name="id_Ticket" value="" placeholder="id_Ticket" class="login" required/>
                                    </div> <!-- /field -->

                                </div> <!-- /login-fields -->

                                <div class="login-actions">
                                    <span class="login-checkbox">
                                        <input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4" required/>
                                        <label class="choice" for="Field">Agree with the ridiculously long Terms & Conditions that you didn't bother to read.</label>
                                    </span>

                                    <button class="button btn btn-primary btn-large">Delete Ticket</button>
                                </div> <!-- .actions -->
                            </form>
                        </div> <!-- /content -->
                    </div> <!-- /account-container -->

                </div>
            </div>
        </div>



        <!-- Text Under Box -->

        <script src="resources/js/jquery-1.7.2.min.js"></script>
        <script src="resources/js/bootstrap.js"></script>
        <script src="resources/js/signin.js"></script>
        <%
           // }
        %>
    </body>
</html>
