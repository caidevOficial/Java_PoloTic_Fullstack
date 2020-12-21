<%-- 
    Document   : error
    Created on : 18 dic. 2020, 05:50:15
    Author     : <FacuFalcone - CaidevOficial> Copyright (C) 2020
--%>

<%@page import="Logic.Controller.LogicController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
  
<head>
    <meta charset="utf-8">
    <title>404 - Error</title>

	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes"> 
	    
	<link href="resources/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css" />
	
	<link href="resources/css/font-awesome.css" rel="stylesheet">
	    <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600" rel="stylesheet">
	    
	<link href="resources/css/style.css" rel="stylesheet" type="text/css" />

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
			
			<a class="brand" href="index.html">
				Error Area - [Linkin Park]				
			</a>		
			
			<div class="nav-collapse">
				<ul class="nav pull-right">
					
					<li class="">						
						<a href="index.jsp" class="">
							<i class="icon-chevron-left"></i>
							Back to Home
						</a>
						
					</li>
				</ul>
				
			</div><!--/.nav-collapse -->	
	
		</div> <!-- /container -->
		
	</div> <!-- /navbar-inner -->
	
</div> <!-- /navbar -->



<div class="container">
	
	<div class="row">
		
		<div class="span12">
			
			<div class="error-container">
				<h1>¯\_( ͡❛ ͜ʖ ͡❛)_/¯</h1>
				
				<h2>Oh crap! this is embarrassing.. The Ticket doesn't exist in the system, please choose another!.</h2>
				
				<div class="error-details">
					Sorry, an error has occurred! try to another Ticket !
					
				</div> <!-- /error-details -->
				
				<div class="error-actions">
					<a href="management.jsp" class="btn btn-large btn-primary">
						<i class="icon-chevron-left"></i>
						&nbsp;
						Back to Management						
					</a>
					
					
					
				</div> <!-- /error-actions -->
							
			</div> <!-- /error-container -->			
			
		</div> <!-- /span12 -->
		
	</div> <!-- /row -->
	
</div> <!-- /container -->


<script src="js/jquery-1.7.2.min.js"></script>
<script src="js/bootstrap.js"></script>
<%
 //   }
%>
</body>

</html>
