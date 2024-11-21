/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.usuarioservice.service;
import com.stcum.usuarioservice.dao.UsuarioDAO;
import com.stcum.usuarioservice.dto.UsuarioDTO;
/**
 *
 * @author khdx
 */
public class UsuarioServicio {
    private UsuarioDAO usuarioDAO;

    public UsuarioServicio() {
        this.usuarioDAO = new UsuarioDAO();
    }

    public void agregarUsuario(String nombre, String correo, String contrasena, int idtipousuario) {
        usuarioDAO.insertarUsuario(nombre, correo, contrasena, idtipousuario);
    }

    

    public UsuarioDTO loguear(String correo, String contrasena) {
        return usuarioDAO.validarUsuario(correo, contrasena);
    }
}
