<%-- 
    Document   : AgregarViaje
    Created on : 22/11/2024, 3:45:25?a. m.
    Author     : Andres
--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./assets/css/register.css"/>
    <title>Agregar Viaje</title>
</head>
<body>
    <form action="ViajeControllerServlet" method="POST"> 
        <h2>Agregar Viaje</h2>
        
        <label for="origen">Origen</label>
        <input type="text" id="origen" name="origen" required><br><br>

        <label for="destino">Destino</label>
        <input type="text" id="destino" name="destino" required><br><br>

        <label for="horaSalida">Hora de Salida</label>
        <input type="datetime-local" id="horaSalida" name="horaSalida" required><br><br>

        <label for="estado">Estado</label>
        <select id="estado" name="estado" required>
            <option value="Disponible">En camino</option>
            <option value="No Disponible">En espera</option>
        </select><br><br>

        <label for="idTransporte">ID de Transporte</label>
        <input type="number" id="idTransporte" name="idTransporte" required><br><br>

        <label for="precio">Precio</label>
        <input type="number" id="precio" name="precio" step="0.01" required><br><br>

        <button type="submit">Agregar Viaje</button>
    </form>
</body>
</html>
