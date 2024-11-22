<%-- 
    Document   : RegistrarTransporte
    Created on : 21/11/2024, 11:51:48 p. m.
    Author     : Andres
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/register.css"/>
    <title>Registrar Transporte</title>
</head>
<body>
    <form action="TransporteRegisterServlet" method="POST">
        <h2>Registrar Transporte</h2>
        
        <label for="tipo">Marca</label>
        <input type="text" id="marca" name="marca" required><br><br>
        
        <label for="tipo">Modelo</label>
        <input type="text" id="modelo" name="modelo" required><br><br>

        <label for="capacidad">Capacidad</label>
        <input type="number" id="capacidad" name="capacidad" required><br><br>

        <label for="condiciones">Condiciones Generales</label>
        <textarea id="condiciones" name="condiciones" required></textarea><br><br>

        <input type="number" id="idUsuario" name="idUsuario" value="${Usuario.getIdUsuario()}" required hidden="True"><br><br>

        <button type="submit">Registrar Transporte</button>
    </form>
</body>
</html>
