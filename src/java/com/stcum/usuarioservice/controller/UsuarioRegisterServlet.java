package com.stcum.usuarioservice.controller;



import com.stcum.usuarioservice.service.UsuarioServicio;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khdx
 */
@WebServlet(name = "UsuarioServlet", urlPatterns ={"/UsuarioServlet"})
public class UsuarioRegisterServlet extends HttpServlet{
    private UsuarioServicio usuarioServicio;

    public UsuarioRegisterServlet() {
        this.usuarioServicio = new UsuarioServicio();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String contrasena = request.getParameter("contrasena");
        int idtipousuario = Integer.parseInt(request.getParameter("idtipousuario"));

        // Crear la reseña
        usuarioServicio.agregarUsuario(nombre, correo, contrasena, idtipousuario);
        System.out.println(nombre+" "+correo+" "+contrasena+" "+idtipousuario);
        // Redirigir después de agregar la reseña
        response.sendRedirect("index.html");
    }
}


