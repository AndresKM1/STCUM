/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.transporteservice.service;

import com.stcum.transporteservice.dao.TransporteDAO;

/**
 *
 * @author khdx
 */
public class TransporteService {
    private TransporteDAO tDAO;

    public TransporteService(TransporteDAO tDAO) {
        this.tDAO = tDAO;
    }
    
    public void registrarTransporte(String tipovehiculo, int capacidad, String condicionesgenerales, double precio, int idUsuario){
        tDAO.insertarTransporte(tipovehiculo, capacidad, condicionesgenerales, precio, idUsuario);
    }
}
