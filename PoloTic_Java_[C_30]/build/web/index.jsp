<%-- 
    Document   : index
    Author     : <FacuFalcone - CaidevOficial>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Prueba JSP</title>
    </head>
    <body>
        <h1>Probando JSP!</h1>
        <%-- 
        <h2>GET</h2>
        <form action="confirmacion.jsp" method="GET">
            Nombre: <input type="text" name="nombreInput">
            Edad: <input type="text" name="edad">
            <input type="submit" value="enviar">
        </form>
        --%>
        <h2>POST:</h2>
        <form action="ServletPrueba" method="POST">
            Nombre: <input type="text" name="nombre">
            Edad: <input type="text" name="edad">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
