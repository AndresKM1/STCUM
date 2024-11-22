/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.viajeservice.service;

import com.stcum.transporteservice.model.Transporte;
import com.stcum.viajeservice.dao.ViajeDAO;
import com.stcum.viajeservice.model.Viaje;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Andres
 */
public class ViajeServicio {
    private ViajeDAO viajeDAO; 
    
    public ViajeServicio() {
        this.viajeDAO = new ViajeDAO();
    }
    public void agregarViaje(String origen, String destino, Timestamp horaSalida, String estado, int idTransporte, double precio){
        viajeDAO.insertarViaje(origen, destino, horaSalida, estado, idTransporte, precio);
    }

    public void crearViaje(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
    String origen = request.getParameter("origen");
    String destino = request.getParameter("destino");
    Timestamp horaSalida = Timestamp.valueOf(request.getParameter("horaSalida"));
    String estado = request.getParameter("estado");
    int idTransporte = Integer.parseInt(request.getParameter("idTransporte"));
    double precio = Double.parseDouble(request.getParameter("precio"));
    
    
    //crear un viaje
     agregarViaje(origen, destino, horaSalida, estado, idTransporte, precio);
    
    // Redirigir o enviar respuesta después de crear el viaje
    request.setAttribute("mensaje", "Viaje creado exitosamente.");
    request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

    public void listarViajes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Viaje> viajes = viajeDAO.obtenerTodosLosViajes(); 
    request.setAttribute("viajes", viajes); // Agregar la lista de viajes al request
    request.getRequestDispatcher("listarViajes.jsp").forward(request, response); // Redirigir a la página JSP para mostrar los viajes
}
}
