/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.transporteservice.dao;

import com.stcum.common.config.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author khdx
 */
public class TransporteDAO {
     private static final String URL = "jdbc:postgresql://localhost:5432/stcumV2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "44IV100";
    
    private ResultSet result;
    
    public void insertarTransporte(String marca, String modelo , int capacidad, String condicionesgenerales, int idUsuario) {
        String sql = "INSERT INTO transportes ( capacidad, condicionesgenerales, idUsuario, marca, modelo) VALUES (?, ?, ?, ?, ?)";

        try {
            DatabaseConnection dbc = new DatabaseConnection(URL, USER, PASSWORD);
            Connection conn = dbc.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, capacidad);
            ps.setString(2, condicionesgenerales);
            ps.setInt(3, idUsuario);
            ps.setString(4, marca);
            ps.setString(5, modelo);
    
 
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
}
