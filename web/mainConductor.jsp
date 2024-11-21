<%-- 
    Document   : mainConductor
    Created on : 21/11/2024, 1:09:11 a. m.
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
        <h1>Hello chofer ... ${Usuario.getNombre()}!</h1>
        <div id="menu">
            <form action=""><button type="submit">Ofrecer servicio</button></form>
            <form action=""><button type="submit">Listar servicios</button></form>
        </div>
    </body>
</html>
