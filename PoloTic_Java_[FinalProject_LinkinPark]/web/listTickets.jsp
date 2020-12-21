<%-- 
    Document   : listUserEmployees
    Created on : 18 dic. 2020, 12:10:03
    Author     : <FacuFalcone - CaidevOficial> Copyright (C) 2020
--%>

<%@page import="Logic.Entities.Ticket"%>
<%@page import="java.util.List"%>
<%@page import="Logic.Controller.LogicController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>List Tickets</title>
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
            /*
            HttpSession thisSession = request.getSession();
            String user = (String) request.getSession().getAttribute("theUsername");

            if (user == null) {
                response.sendRedirect("error.jsp");
            } else {
             */
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
                        Tickets List				
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
            <div class="row ">
               <div class="span5 ">
                    <div class="widget widget-table action-table">
                        <div class="widget-header"> <i class="icon-th-list"></i>
                            <h3>Tickets List</h3>
                        </div>
                        <div class="widget-content">
                            <table class="table table-striped table-bordered">
                                <thead>
                                    <tr>
                                        <th><center>ID</center></th>
                                 <th><center>Game</center></th>
                                   <th><center>Schedule</center></th>
                                <th><center>Owner</center></th>
                                </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <%
                                            LogicController LC = new LogicController();
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
                </div> 
            </div>
        </div>

        <!-- Text Under Box -->

        <script src="resources/js/jquery-1.7.2.min.js"></script>
        <script src="resources/js/bootstrap.js"></script>
        <script src="resources/js/signin.js"></script>
        <%
            //           }
%>
    </body>
</html>
