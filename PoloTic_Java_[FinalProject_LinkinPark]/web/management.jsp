<%-- 
    Document   : managment
    Created on : 18 dic. 2020, 06:32:11
    Author     : <FacuFalcone - CaidevOficial> Copyright (C) 2020
--%>

<%@page import="Logic.Controller.LogicController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Account Upgrade - Bootstrap Admin Template</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="apple-mobile-web-app-capable" content="yes">    
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
        <link href="resources/css/font-awesome.css" rel="stylesheet">
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/pages/plans.css" rel="stylesheet"> 

        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
          <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
    </head>

    <body>
        <%
        /*
            HttpSession thisSession = request.getSession();
            String user = (String) request.getSession().getAttribute("theUsername");
            out.println("Username: " + user);

            if (user == null) {
                response.sendRedirect("error.jsp");
            } else {
                LogicController LC = new LogicController();
                thisSession.setAttribute("control", LC);
            }  
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

                    <a class="brand" href="index.jsp">
                        Back to Home				
                    </a>		

                    <div class="nav-collapse">
                        <ul class="nav pull-right">
                            <li class="dropdown">						
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <i class="icon-cog"></i>
                                    Account
                                    <b class="caret"></b>
                                </a>

                                <ul class="dropdown-menu">
                                    <li><a href="javascript:;">Settings</a></li>
                                    <li><a href="javascript:;">Help</a></li>
                                </ul>						
                            </li>

                            <li class="dropdown">						
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                    <i class="icon-user"></i> 
                                    In honor to Chester ♥
                                    <b class="caret"></b>
                                </a>

                                <ul class="dropdown-menu">
                                    <li><a href="javascript:;">Profile</a></li>
                                    <li><a href="<% session.invalidate(); %>">Logout</a></li>
                                </ul>						
                            </li>
                        </ul>
                        <form class="navbar-search pull-right">
                            <input type="text" class="search-query" placeholder="Search">
                        </form>
                    </div><!--/.nav-collapse -->	
                </div> <!-- /container -->
            </div> <!-- /navbar-inner -->
        </div> <!-- /navbar -->

        <div class="subnavbar">
            <div class="subnavbar-inner">
                <div class="container">
                    <ul class="mainnav">
                         <li>					
                            <a href="guidely.jsp">
                                <i class="icon-facetime-video"></i>
                                <span>App Tour</span>
                            </a>  									
                        </li>
                   </ul>
                </div> <!-- /container -->
            </div> <!-- /subnavbar-inner -->
        </div> <!-- /subnavbar -->

        <div class="main">
            <div class="main-inner">
                <div class="container">
                    <div class="row">
                        <div class="span12">
                            <div class="widget">
                                <div class="widget-header">
                                    <i class="icon-th-large"></i>
                                    <h3>Choose Your Action</h3>
                                </div> <!-- /widget-header -->

                                <div class="widget-content">
                                    <div class="pricing-plans plans-4">
                                        
                                        <!-- USER -->
                                        <div class="plan-container">
                                            <div class="plan ">
                                                <div class="plan-header">
                                                    <div class="plan-title">
                                                        User Area	        		
                                                    </div> <!-- /plan-title -->

                                                    <div class="plan-price">
                                                        Manage<span class="term">User</span>
                                                    </div> <!-- /plan-price -->

                                                </div> <!-- /plan-header -->	        

                                                <div class="plan-features">
                                                    <ul>
                                                        <li><strong>Area</strong> dedicated to the Management of the users.</li>
                                                        <li>Here you can</li>
                                                        <li>view, upgrade and delete</li>
                                                        <li>users.</li>
                                                    </ul>
                                                </div> <!-- /plan-features -->

                                                <div class="plan-actions">				
                                                    <a href="registerUser.jsp" class="btn">Create</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="listUsers.jsp" class="btn">Read</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="modifyUser.jsp" class="btn">Update</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="deleteUser.jsp" class="btn">Delete!</a>				
                                                </div> <!-- /plan-actions -->
                                            </div> <!-- /plan -->
                                        </div> <!-- /plan-container -->
                                        
                                        <!-- EMPLOYEE -->
                                        <div class="plan-container">
                                            <div class="plan green">
                                                <div class="plan-header">
                                                    <div class="plan-title">
                                                        Employee Area	        		
                                                    </div> <!-- /plan-title -->

                                                    <div class="plan-price">
                                                        Manage<span class="term">Employee</span>
                                                    </div> <!-- /plan-price -->

                                                </div> <!-- /plan-header -->	        

                                                <div class="plan-features">
                                                    <ul>
                                                        <li><strong>Area</strong> dedicated to the Management of the employees.</li>
                                                        <li>Here you can</li>
                                                        <li>Setup, view, upgrade and delete</li>
                                                        <li>both, employees and users.</li>
                                                    </ul>
                                                </div> <!-- /plan-features -->

                                                <div class="plan-actions">				
                                                    <a href="registerEmployee.jsp" class="btn">Create</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="listEmployees.jsp" class="btn">Read</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="modifyEmployee.jsp" class="btn">Update</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="deleteEmployee.jsp" class="btn">Delete!</a>				
                                                </div> <!-- /plan-actions -->
                                            </div> <!-- /plan -->
                                        </div> <!-- /plan-container -->

                                        <!-- GAME -->
                                        <div class="plan-container">
                                            <div class="plan green">
                                                <div class="plan-header">
                                                    <div class="plan-title">
                                                        Game Area	        		
                                                    </div> <!-- /plan-title -->
                                                    <div class="plan-price">
                                                        Manage<span class="term">Games for the Park</span>
                                                    </div> <!-- /plan-price -->
                                                </div> <!-- /plan-header -->	          

                                                <div class="plan-features">
                                                    <ul>					
                                                        <li><strong>Area</strong> dedicated to the Management of the games.</li>
                                                        <li>Here you can</li>
                                                        <li>Setup, view, upgrade and delete</li>
                                                        <li>All the games in the park.</li>
                                                    </ul>
                                                </div> <!-- /plan-features -->

                                                <div class="plan-actions">				
                                                    <a href="registerGame.jsp" class="btn">Create</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="listGames.jsp" class="btn">Read</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="modifyGame.jsp" class="btn">Update</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="deleteGame.jsp" class="btn">Delete</a>				
                                                </div> <!-- /plan-actions -->
                                            </div> <!-- /plan -->
                                        </div> <!-- /plan-container -->

                                        <!-- TICKET -->
                                        <div class="plan-container">
                                            <div class="plan">
                                                <div class="plan-header">

                                                    <div class="plan-title">
                                                        Ticket Area	        		
                                                    </div> <!-- /plan-title -->

                                                    <div class="plan-price">
                                                        Manage<span class="term">tickets for games.</span>
                                                    </div> <!-- /plan-price -->

                                                </div> <!-- /plan-header -->	       

                                                <div class="plan-features">
                                                    <ul>
                                                        <li><strong>Area</strong> dedicated to the management of the ticket.</li>
                                                        <li>First: Select Game & schedule</li>
                                                        <li>Then: just make money!</li>
                                                        <li>and make magic happn!</li>
                                                    </ul>
                                                </div> <!-- /plan-features -->

                                                <div class="plan-actions">				
                                                    <a href="registerTicket.jsp" class="btn">Create</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="listTickets.jsp" class="btn">Read</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="modifyTicket.jsp" class="btn">Update</a>				
                                                </div> <!-- /plan-actions -->
                                                <div class="plan-actions">				
                                                    <a href="deleteTicket.jsp" class="btn">Delete!</a>				
                                                </div> <!-- /plan-actions -->
                                            </div> <!-- /plan -->
                                        </div> <!-- /plan-container -->
                                    </div> <!-- /pricing-plans -->
                                </div> <!-- /widget-content -->
                            </div> <!-- /widget -->					
                        </div> <!-- /span12 -->     	
                    </div> <!-- /row -->
                </div> <!-- /container -->
            </div> <!-- /main-inner -->
        </div> <!-- /main -->

        <div class="footer">
            <div class="footer-inner">
                <div class="container">
                    <div class="row">
                        <div class="span12">
                            &copy; 2020 <a href="#"> Facu Falcone - CaidevOficial </a>.
                        </div> <!-- /span12 -->
                    </div> <!-- /row -->
                </div> <!-- /container -->
            </div> <!-- /footer-inner -->
        </div> <!-- /footer -->


        <!-- Le javascript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="js/jquery-1.7.2.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/base.js"></script>
    </body>
</html>
