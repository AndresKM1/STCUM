/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Milo
 */


import java.util.HashMap;
import java.util.Map;

public enum TipoUsuario {
    CLIENTE(1, "Cliente"),
    PROVEEDOR(2, "Proveedor"),
    ADMINISTRADOR(3, "Administrador");

    private final int id;
    private final String nombre;
    private static final Map<Integer, TipoUsuario> porId = new HashMap<>();

    static {
        for (TipoUsuario tipo : values()) {
            porId.put(tipo.id, tipo);
        }
    }

    TipoUsuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public static TipoUsuario getById(int id) {
        TipoUsuario tipo = porId.get(id);
        if (tipo == null) {
            throw new IllegalArgumentException("No existe TipoUsuario con id: " + id);
        }
        return tipo;
    }

    @Override
    public String toString() {
        return "TipoUsuario{" +
               "id=" + id +
               ", nombre='" + nombre + '\'' +
               '}';
    }
}

