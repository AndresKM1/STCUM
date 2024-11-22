/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.viajeservice.dto;


import entidades.Viaje;

/**
 *
 * @author Andres
 */
public class ViajeDTO {
        private Viaje viaje;

    public ViajeDTO(Viaje viaje) {
        this.viaje = viaje;
    }
    
    public ViajeDTO() {
        this.viaje = null;
    }

    /**
     * @return the viaje
     */
    public Viaje getViaje() {
        return viaje;
    }

    /**
     * @param viaje the viaje to set
     */
    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    
}
