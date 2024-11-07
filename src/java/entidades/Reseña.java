/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Milo
 */
public class Reseña {
    private int idReseña;
    private String comentario;
    private Usuario usuario;
    private Viaje viaje;

    // Constructor
    public Reseña(int idReseña, String comentario, Usuario usuario, Viaje viaje) {
        this.idReseña = idReseña;
        this.comentario = comentario;
        this.usuario = usuario;
        this.viaje = viaje;
    }

    // Getters y Setters
    public int getIdReseña() {
        return idReseña;
    }

    public void setIdReseña(int idReseña) {
        this.idReseña = idReseña;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
}
