/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Milo
 */
public class Transporte {
    private int idTransporte;
    private String tipoVehiculo;
    private int capacidad;
    private String condicionesGenerales;
    private Usuario usuario;

    // Constructor
    public Transporte(int idTransporte, String tipoVehiculo, int capacidad, String condicionesGenerales, Usuario usuario) {
        this.idTransporte = idTransporte;
        this.tipoVehiculo = tipoVehiculo;
        this.capacidad = capacidad;
        this.condicionesGenerales = condicionesGenerales;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
