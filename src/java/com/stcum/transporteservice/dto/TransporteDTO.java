/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.transporteservice.dto;

import com.stcum.transporteservice.model.Transporte;

/**
 *
 * @author khdx
 */
public class TransporteDTO {
    private Transporte transporte;

    public TransporteDTO(Transporte transporte) {
        this.transporte = transporte;
    }
    
    public TransporteDTO() {
        this.transporte = null;
    }

    /**
     * @return the transporte
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * @param transporte the transporte to set
     */
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    
    
}
