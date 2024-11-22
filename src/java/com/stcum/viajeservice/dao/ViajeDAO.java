/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.viajeservice.dao;


import com.stcum.common.config.DatabaseConnection;
import com.stcum.transporteservice.model.Transporte;
import com.stcum.viajeservice.model.Viaje;
import jakarta.resource.cci.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andres
 */
public class ViajeDAO {
    private static final String URL = "jdbc:postgresql://localhost:5432/stcumV2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "44IV100";
    
    public void insertarViaje(String origen, String destino, Timestamp horaSalida, String estado, int idTransporte, double precio){
    String sql = "INSERT INTO viajes ( origen, destino, horaSalida, estado, transporte, precio) VALUES (?, ?, ?, ?, ?, ?)";
     try {
            DatabaseConnection dbc = new DatabaseConnection(URL, USER, PASSWORD);
            Connection conn = dbc.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, origen);
            ps.setString(2, destino);
            ps.setTimestamp(3, horaSalida);
            ps.setString(4, estado);
            ps.setInt(5, idTransporte);
            ps.setDouble(6, precio);
            
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Viaje> obtenerTodosLosViajes() {
         List<Viaje> listaViajes = new ArrayList<>();
    
   
    String sql = "SELECT * FROM viajes"; 
    try     {DatabaseConnection dbc = new DatabaseConnection(URL, USER, PASSWORD);
            Connection conn = dbc.getConn();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = (ResultSet) ps.executeQuery();
        
        while (rs.next()) {
            int idViaje = rs.getInt("idViaje");
            String origen = rs.getString("origen");
            String destino = rs.getString("destino");
            Timestamp horaSalida = rs.getTimestamp("horaSalida");
            String estado = rs.getString("estado");
            int idTransporte = rs.getInt("idTransporte");
            double precio = rs.getDouble("precio");

            
            Viaje viaje = new Viaje(idViaje, origen, destino, horaSalida, estado, idTransporte, precio);
            listaViajes.add(viaje);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Manejo de excepciones
    }
    return listaViajes;
    }
    
}
