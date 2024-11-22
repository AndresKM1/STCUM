<%-- 
    Document   : ListarViajes
    Created on : 22/11/2024, 4:09:41 a. m.
    Author     : Andres
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.stcum.viajeservice.model.Viaje" %>
<!DOCTYPE html>
<html>
<head>
    <title>Lista de Viajes</title>
</head>
<body>
    <h2>Lista de Viajes</h2>
    <table border="1">
        <tr>
            <th>ID Viaje</th>
            <th>Origen</th>
            <th>Destino</th>
            <th>Hora de Salida</th>
            <th>Estado</th>
            <th>ID Transporte</th>
            <th>Precio</th>
        </tr>
        <%
            List<Viaje> viajes = (List<Viaje>) request.getAttribute("viajes");
            for (Viaje viaje : viajes) {
        %>
        <tr>
            <td><%= viaje.getIdViaje() %></td>
            <td><%= viaje.getOrigen() %></td>
            <td><%= viaje.getDestino() %></td>
            <td><%= viaje.getHoraSalida() %></td>
            <td><%= viaje.getEstado() %></td>
            <td><%= viaje.getIdTransporte() %></td>
            <td><%= viaje.getPrecio() %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
