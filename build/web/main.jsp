<%-- 
    Document   : main
    Created on : 20/11/2024, 6:05:44 p. m.
    Author     : khdx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/mainConductor.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ... ${Usuario.getNombre()}!</h1>
        <div id="menu">
            <form action=""><button type="submit">Reservar servicio</button></form>
            <form action=""><button type="submit">Ver perfil</button></form>
        </div>
    </body>
</html>
