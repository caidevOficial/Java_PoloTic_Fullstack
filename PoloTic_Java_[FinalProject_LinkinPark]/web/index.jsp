<%-- 
    Document   : index
    Created on : 14 dic. 2020, 18:13:06
    Author     : FacuFalcone - CaidevOficial
--%>
<%@page import="Logic.Controller.LogicController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Dashboard - Linkin Park</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="apple-mobile-web-app-capable" content="yes">
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">
        <link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
              rel="stylesheet">
        <link href="resources/css/font-awesome.css" rel="stylesheet">
        <link href="resources/css/style.css" rel="stylesheet">
        <link href="resources/css/pages/dashboard.css" rel="stylesheet">
        <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
              <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
            <![endif]-->
    </head>
    <body>
        <%
            HttpSession thisSession = request.getSession();
            String user = (String) thisSession.getAttribute("theUsername");
            out.println(user);
            if (user == null) {
                //response.sendRedirect("error.jsp");
            } else {
                LogicController LC = new LogicController();
                thisSession.setAttribute("control", LC);
                //setAttribute("control", LC);
            }
        %>

        <div class="navbar navbar-fixed-top">
            <div class="navbar-inner">
                <div class="container"> <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"><span
                            class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span> </a><a class="brand" href="index.html">Home - Linkin Park </a>
                    <div class="nav-collapse">
                        <ul class="nav pull-right">
                            <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                                        class="icon-cog"></i> Account <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="javascript:;">Settings</a></li>
                                    <li><a href="javascript:;">Help</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
                                        class="icon-user"></i> 
                                    In honor to Chester ♥
                                    <b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="javascript:;">Profile</a></li>
                                    <li><a href="<% session.invalidate();%>" >Logout</a></li>
                                </ul>
                            </li>
                        </ul>
                        <form class="navbar-search pull-right">
                            <input type="text" class="search-query" placeholder="Search">
                        </form>
                    </div>
                    <!--/.nav-collapse --> 
                </div>
                <!-- /container --> 
            </div>
            <!-- /navbar-inner --> 
        </div>
        <!-- /navbar -->
        <div class="subnavbar">
            <div class="subnavbar-inner">
                <div class="container">
                    <ul class="mainnav">

                        <li class="active">					
                            <a href="guidely.jsp">
                                <i class="icon-facetime-video"></i>
                                <span>App Tour</span>
                            </a>  									
                        </li>


                        <li class="active">
                            <a href="index.jsp">
                                <i class="icon-dashboard"></i>
                                <span>Dashboard</span> 
                            </a> 
                        </li>

                    </ul>
                </div>
                <!-- /container --> 
            </div>
            <!-- /subnavbar-inner --> 
        </div>
        <!-- /subnavbar -->
        <div class="main">
            <div class="main-inner">
                <div class="container">
                    <div class="row">
                        <div class="span6">

                            <!-- /widget -->

                            <!-- /widget -->
                            <div class="widget">
                                <div class="widget-header"> <i class="icon-file"></i>
                                    <h3> Content</h3>
                                </div>
                                <!-- /widget-header -->
                                <div class="widget-content">
                                    <ul class="messages_layout">
                                        <li class="from_user left"> <a href="#" class="avatar"><img src="resources/img/message_avatar1.png"/></a>
                                            <div class="message_wrap"> <span class="arrow"></span>
                                                <div class="info"> <a class="name">John Smith</a> <span class="time">1 hour ago</span>
                                                    <div class="options_arrow">
                                                        <div class="dropdown pull-right"> <a class="dropdown-toggle " id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="#"> <i class=" icon-caret-down"></i> </a>
                                                            <ul class="dropdown-menu " role="menu" aria-labelledby="dLabel">
                                                                <li><a href="#"><i class=" icon-share-alt icon-large"></i> Reply</a></li>
                                                                <li><a href="#"><i class=" icon-trash icon-large"></i> Delete</a></li>
                                                                <li><a href="#"><i class=" icon-share icon-large"></i> Share</a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="text"> As an interesting side note, as a head without a body, I envy the dead. There's one way and only one way to determine if an animal is intelligent. Dissect its brain! Man, I'm sore all over. I feel like I just went ten rounds with mighty Thor. </div>
                                            </div>
                                        </li>
                                        <li class="by_myself right"> <a href="#" class="avatar"><img src="resources/img/message_avatar2.png"/></a>
                                            <div class="message_wrap"> <span class="arrow"></span>
                                                <div class="info"> <a class="name">Bender (myself) </a> <span class="time">4 hours ago</span>
                                                    <div class="options_arrow">
                                                        <div class="dropdown pull-right"> <a class="dropdown-toggle " id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="#"> <i class=" icon-caret-down"></i> </a>
                                                            <ul class="dropdown-menu " role="menu" aria-labelledby="dLabel">
                                                                <li><a href="#"><i class=" icon-share-alt icon-large"></i> Reply</a></li>
                                                                <li><a href="#"><i class=" icon-trash icon-large"></i> Delete</a></li>
                                                                <li><a href="#"><i class=" icon-share icon-large"></i> Share</a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="text"> All I want is to be a monkey of moderate intelligence who wears a suit… that's why I'm transferring to business school! I had more, but you go ahead. Man, I'm sore all over. I feel like I just went ten rounds with mighty Thor. File not found. </div>
                                            </div>
                                        </li>
                                        <li class="from_user left"> <a href="#" class="avatar"><img src="resources/img/message_avatar1.png"/></a>
                                            <div class="message_wrap"> <span class="arrow"></span>
                                                <div class="info"> <a class="name">Celeste Holm </a> <span class="time">1 Day ago</span>
                                                    <div class="options_arrow">
                                                        <div class="dropdown pull-right"> <a class="dropdown-toggle " id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="#"> <i class=" icon-caret-down"></i> </a>
                                                            <ul class="dropdown-menu " role="menu" aria-labelledby="dLabel">
                                                                <li><a href="#"><i class=" icon-share-alt icon-large"></i> Reply</a></li>
                                                                <li><a href="#"><i class=" icon-trash icon-large"></i> Delete</a></li>
                                                                <li><a href="#"><i class=" icon-share icon-large"></i> Share</a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="text"> And I'd do it again! And perhaps a third time! But that would be it. Are you crazy? I can't swallow that. And I'm his friend Jesus. No, I'm Santa Claus! And from now on you're all named Bender Jr. </div>
                                            </div>
                                        </li>
                                        <li class="from_user left"> <a href="#" class="avatar"><img src="resources/img/message_avatar2.png"/></a>
                                            <div class="message_wrap"> <span class="arrow"></span>
                                                <div class="info"> <a class="name">Mark Jobs </a> <span class="time">2 Days ago</span>
                                                    <div class="options_arrow">
                                                        <div class="dropdown pull-right"> <a class="dropdown-toggle " id="dLabel" role="button" data-toggle="dropdown" data-target="#" href="#"> <i class=" icon-caret-down"></i> </a>
                                                            <ul class="dropdown-menu " role="menu" aria-labelledby="dLabel">
                                                                <li><a href="#"><i class=" icon-share-alt icon-large"></i> Reply</a></li>
                                                                <li><a href="#"><i class=" icon-trash icon-large"></i> Delete</a></li>
                                                                <li><a href="#"><i class=" icon-share icon-large"></i> Share</a></li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="text"> That's the ONLY thing about being a slave. Now, now. Perfectly symmetrical violence never solved anything. Uh, is the puppy mechanical in any way? As an interesting side note, as a head without a body, I envy the dead. </div>
                                            </div>
                                        </li>
                                    </ul>
                                </div>
                                <!-- /widget-content --> 
                            </div>
                            <!-- /widget --> 
                        </div>
                        <!-- /span6 -->
                        <div class="span6">
                            <div class="widget">
                                <div class="widget-header"> <i class="icon-bookmark"></i>
                                    <h3>Important Shortcuts</h3>
                                </div>
                                <!-- /widget-header -->
                                <div class="widget-content">
                                    <div class="shortcuts"> 
                                        <a href="management.jsp" class="shortcut"><i class="shortcut-icon icon-list-alt"></i><span class="shortcut-label">Management</span> </a>
                                        <a href="javascript:;" class="shortcut"><i class="shortcut-icon icon-signal"></i><span class="shortcut-label">Reports</span> </a>
                                        <a href="listEmployees.jsp" class="shortcut"><i class="shortcut-icon icon-user"></i><span class="shortcut-label">Users</span> </a>

                                        <!-- /shortcuts --> 
                                    </div>
                                    <!-- /widget-content --> 
                                </div>
                                <div class="widget widget-nopad">
                                    <div class="widget-header"> <i class="icon-list-alt"></i>
                                        <h3> Recent News</h3>
                                    </div>
                                    <!-- /widget-header -->
                                    <div class="widget-content">
                                        <ul class="news-items">
                                            <li>
                                                <div class="news-item-date"> <span class="news-item-day">29</span> <span class="news-item-month">Aug</span> </div>
                                                <div class="news-item-detail"> <a href="http://www.egrappler.com/thursday-roundup-40/" class="news-item-title" target="_blank">Thursday Roundup # 40</a>
                                                    <p class="news-item-preview"> This is our web design and development news series where we share our favorite design/development related articles, resources, tutorials and awesome freebies. </p>
                                                </div>

                                            </li>
                                            <li>

                                                <div class="news-item-date"> <span class="news-item-day">15</span> <span class="news-item-month">Jun</span> </div>
                                                <div class="news-item-detail"> <a href="http://www.egrappler.com/retina-ready-responsive-app-landing-page-website-template-app-landing/" class="news-item-title" target="_blank">Retina Ready Responsive App Landing Page Website Template – App Landing</a>
                                                    <p class="news-item-preview"> App Landing is a retina ready responsive app landing page website template perfect for software and application developers and small business owners looking to promote their iPhone, iPad, Android Apps and software products.</p>
                                                </div>

                                            </li>
                                            <li>

                                                <div class="news-item-date"> <span class="news-item-day">29</span> <span class="news-item-month">Oct</span> </div>
                                                <div class="news-item-detail"> <a href="http://www.egrappler.com/open-source-jquery-php-ajax-contact-form-templates-with-captcha-formify/" class="news-item-title" target="_blank">Open Source jQuery PHP Ajax Contact Form Templates With Captcha: Formify</a>
                                                    <p class="news-item-preview"> Formify is a contribution to lessen the pain of creating contact forms. The collection contains six different forms that are commonly used. These open source contact forms can be customized as well to suit the need for your website/application.</p>
                                                </div>

                                            </li>
                                        </ul>
                                    </div>
                                    <!-- /widget-content --> 
                                </div>
                                <!-- /widget -->
                            </div>
                            <!-- /span6 --> 
                        </div>
                        <!-- /row --> 
                    </div>
                    <!-- /container --> 
                </div>
                <!-- /main-inner --> 
            </div>
            <!-- /main -->

            <!-- /extra -->
            <div class="footer">
                <div class="footer-inner">
                    <div class="container">
                        <div class="row">
                            <div class="span12"> &copy; 2020 <a href="#"> Facu Falcone - CaidevOficial </a>. </div>
                            <!-- /span12 --> 
                        </div>
                        <!-- /row --> 
                    </div>
                    <!-- /container --> 
                </div>
                <!-- /footer-inner --> 
            </div>
            <!-- /footer --> 
            <!-- Le javascript
            ================================================== --> 
            <!-- Placed at the end of the document so the pages load faster --> 
            <script src="resources/js/jquery-1.7.2.min.js"></script> 
            <script src="resources/js/excanvas.min.js"></script> 
            <script src="resources/js/chart.min.js" type="text/javascript"></script> 
            <script src="resources/js/bootstrap.js"></script>
            <script language="javascript" type="text/javascript" src="resources/js/full-calendar/fullcalendar.min.js"></script>

            <script src="resources/js/base.js"></script> 
    </body>
</html>
