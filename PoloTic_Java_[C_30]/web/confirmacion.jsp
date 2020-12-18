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
        <p>Nombre: <%=session.getAttribute("nombre")%> </p>
        <p>Edad: <%=session.getAttribute("edad")%></p> 
    </body>
</html>
