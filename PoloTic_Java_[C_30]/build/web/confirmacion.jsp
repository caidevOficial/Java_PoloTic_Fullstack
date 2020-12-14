<%-- 
    Document   : confirmacion
    Author     : <FacuFalcone - CaidevOficial>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hiciste el primer llamado entre dos paginas JSP.</h1>
        <h1>Datos ingresados:</h1>
        <p>Nombre: </p> <%=session.getAttribute("nombre")%>
        <p>Edad: </p> <%=session.getAttribute("edad")%>
    </body>
</html>
