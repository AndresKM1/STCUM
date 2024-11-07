/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Milo
 */
import java.sql.Timestamp;

public class Viaje {
    private int idViaje;
    private String origen;
    private String destino;
    private Timestamp horaSalida;
    private String estado;
    private Transporte transporte;
    private double precio;
    
    // Constructor
    public Viaje(int idViaje, String origen, String destino, Timestamp horaSalida, String estado, Transporte transporte, double precio) {
        this.idViaje = idViaje;
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.estado = estado;
        this.transporte = transporte;
        this.precio = precio;
    }

    // Getters y Setters
    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Timestamp getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Timestamp horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}

