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

    public TransporteService() {
        this.tDAO = new TransporteDAO();
    }
    
    public void registrarTransporte(String marca, String modelo, int capacidad, String condicionesgenerales, int idUsuario){
        tDAO.insertarTransporte(marca, modelo, capacidad, condicionesgenerales, idUsuario);
    }
}
