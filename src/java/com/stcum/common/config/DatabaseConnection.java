/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.common.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author khdx
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/stcumV2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "44IV100";

    
    private final Connection conn;
    
    public Connection getConn() {
        return conn;
    }
    

    public DatabaseConnection(String DB_URL, String DB_USER, String DB_PASSWORD) throws SQLException {
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
