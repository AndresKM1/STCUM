/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.viajeservice.service;

import com.stcum.transporteservice.model.Transporte;
import com.stcum.viajeservice.dao.ViajeDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;

/**
 *
 * @author Andres
 */
public class ViajeServicio {
    private ViajeDAO viajeDAO; 
    
    public ViajeServicio() {
        this.viajeDAO = new ViajeDAO();
    }
    public void agregarViaje(String origen, String destino, Timestamp horaSalida, String estado, Transporte transporte, double precio){
        viajeDAO.insertarViaje(origen, destino, horaSalida, estado, transporte, precio);
    }

    public void crearViaje(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
    String origen = request.getParameter("origen");
    String destino = request.getParameter("destino");
    Timestamp horaSalida = Timestamp.valueOf(request.getParameter("horaSalida"));
    String estado = request.getParameter("estado");
    double precio = Double.parseDouble(request.getParameter("precio"));
    
    
    // Obtener parámetros para el Transporte
    int idTransporte = Integer.parseInt(request.getParameter("idTransporte")); // ID del transporte
    String marca = request.getParameter("marca");
    String modelo = request.getParameter("modelo");
    int capacidad = Integer.parseInt(request.getParameter("capacidad"));
    String condicionesGenerales = request.getParameter("condicionesGenerales");
    int idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
    
    
    // Crear el objeto Transporte
    Transporte transporte = new Transporte(idTransporte, marca, modelo, capacidad, condicionesGenerales, idUsuario);
    
    //  lógica para crear un viaje, como llamar a un servicio que maneje la lógica de negocio
     agregarViaje(origen, destino, horaSalida, estado, transporte, precio);
    
    // Redirigir o enviar respuesta después de crear el viaje
    request.setAttribute("mensaje", "Viaje creado exitosamente.");
    request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

    public void listarViajes(HttpServletRequest request, HttpServletResponse response) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
