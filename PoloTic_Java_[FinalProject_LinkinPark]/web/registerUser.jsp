<%-- 
    Document   : registerEmployee
    Created on : 18 dic. 2020, 06:52:03
    Author     : <FacuFalcone - CaidevOficial> Copyright (C) 2020
--%>
<%@page import="Logic.Controller.LogicController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Register Employee</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="apple-mobile-web-app-capable" content="yes"> 

        <link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />

        <link href="resources/css/font-awesome.css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">

        <link href="resources/css/style.css" rel="stylesheet" type="text/css">
        <link href="resources/css/pages/signin.css" rel="stylesheet" type="text/css">
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

                    <a class="brand" href="index.jsp">
                        Back to Home				
                    </a>		

                    <div class="nav-collapse">
                        <ul class="nav pull-right">
                            <li class="">						
                                <a href="index.jsp" class="">
                                    <i class="icon-chevron-left"></i>
                                    Back to Homepage
                                </a>
                            </li>
                        </ul>
                    </div><!--/.nav-collapse -->	
                </div> <!-- /container -->
            </div> <!-- /navbar-inner -->
        </div> <!-- /navbar -->
        
        <div class="account-container register">
            <div class="content clearfix">
                <form action="AddUser" method="POST">
                    <h1>Register User</h1>			
                    <div class="login-fields">
                        <p>Create the user:</p>
                        <div class="field">
                            <label for="user">Username:</label>
                            <input type="text" id="user" name="user" value="" placeholder="User" class="login" required/>
                        </div> <!-- /field -->

                        <div class="field">
                            <label for="password">Password:</label>
                            <input type="password" id="password" name="password" value="" placeholder="Password" class="login" required/>
                        </div> <!-- /field -->
 
                    <div class="login-actions">
                        <span class="login-checkbox">
                            <input id="Field" name="Field" type="checkbox" class="field login-checkbox" value="First Choice" tabindex="4" required/>
                            <label class="choice" for="Field">Agree with the ridiculously long Terms & Conditions that you didn't bother to read.</label>
                        </span>

                        <button class="button btn btn-primary btn-large">Register</button>
                    </div> <!-- .actions -->
                </form>
            </div> <!-- /content -->
        </div> <!-- /account-container -->
        <!-- Text Under Box -->
        <div class="login-extra">
            Already have an account? <a href="login.jsp">Login to your account</a>
        </div> <!-- /login-extra -->

        <script src="resources/js/jquery-1.7.2.min.js"></script>
        <script src="resources/js/bootstrap.js"></script>
        <script src="resources/js/signin.js"></script>
<%
//    }
%>
    </body>
</html>
