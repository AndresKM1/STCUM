/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.usuarioservice.dao;

import com.stcum.common.config.DatabaseConnection;
import com.stcum.usuarioservice.dto.UsuarioDTO;
import com.stcum.usuarioservice.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author khdx
 */
public class UsuarioDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/stcumV2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "44IV100";
    
    private ResultSet result;
    
    public void insertarUsuario(String nombre, String correo, String contrasena, int idtipousuario) {
        String sql = "INSERT INTO usuarios (nombre, correo, contrasena, idtipousuario) VALUES (?, ?, ?, ?)";

        try {
            DatabaseConnection dbc = new DatabaseConnection(URL, USER, PASSWORD);
            Connection conn = dbc.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setString(2, correo);
            ps.setString(3, contrasena);
            ps.setInt(4, idtipousuario);
 
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public UsuarioDTO validarUsuario(String correo, String contrasena) {
        Usuario molde = new Usuario();
        UsuarioDTO uDTO = new UsuarioDTO();

        String sql = "SELECT * FROM usuarios WHERE correo = ? AND contrasena = ?";
        try {
            DatabaseConnection dbc = new DatabaseConnection(URL, USER, PASSWORD);
            Connection conn = dbc.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, correo);
            ps.setString(2, contrasena);
            result = ps.executeQuery();
            while(result.next()){
                molde.setNombre(result.getString("nombre"));
                molde.setCorreo(result.getString("correo"));
                molde.setContrasena(result.getString("contrasena"));
                molde.setTipoUsuario(result.getInt("idtipousuario"));
                
                
            }
            uDTO.setUsuarioToSend(molde);
            System.out.println("RESULTADO: "+ uDTO.getUsuarioToSend().getCorreo());
            return uDTO;
            
        } catch (Exception e) {
            return null;
        }
    }
}
