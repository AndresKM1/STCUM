/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.transporteservice.model;

/**
 *
 * @author Milo
 */
public class Transporte {
    private int idTransporte;
    private String tipoVehiculo;
    private int capacidad;
    private String condicionesGenerales;
    private int idUsuario;

    // Constructor
    public Transporte(int idTransporte, String tipoVehiculo, int capacidad, String condicionesGenerales, int idUsuario) {
        this.idTransporte = idTransporte;
        this.tipoVehiculo = tipoVehiculo;
        this.capacidad = capacidad;
        this.condicionesGenerales = condicionesGenerales;
        this.idUsuario = idUsuario;
    }

    // Getters y Setters
    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCondicionesGenerales() {
        return condicionesGenerales;
    }

    public void setCondicionesGenerales(String condicionesGenerales) {
        this.condicionesGenerales = condicionesGenerales;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}
