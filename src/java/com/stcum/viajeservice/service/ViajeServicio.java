/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.viajeservice.service;

import com.stcum.transporteservice.model.Transporte;
import com.stcum.viajeservice.dao.ViajeDAO;
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
}
