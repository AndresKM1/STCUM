/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.stcum.usuarioservice.controller;

import com.stcum.usuarioservice.dto.UsuarioDTO;
import com.stcum.usuarioservice.service.UsuarioServicio;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author khdx
 */
@WebServlet(name = "UsuarioControllerServlet", urlPatterns = {"/UsuarioControllerServlet"})
public class UsuarioControllerServlet extends HttpServlet {


        private UsuarioServicio userService;
        private UsuarioDTO uDTO;

        public UsuarioControllerServlet() {
            this.userService = new UsuarioServicio();
            this.uDTO = new UsuarioDTO();

        }

        /**
         * Processes requests for both HTTP <code>GET</code> and
         * <code>POST</code> methods.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet UsuarioLoginServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet UsuarioLoginServlet at " + request.getContextPath() + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }

            
        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            String action = request.getParameter("action");
            switch (action) {
                case "ingresar":
                        
                    ingresar(request, response);

                    break;

                case "conductorOfrecer":
                    request.setAttribute("Usuario", uDTO.getUsuarioToSend());  
                    request.getRequestDispatcher("OfrecerServicio.jsp").forward(request, response);
                    
                    break;
                    
                case "conductorRegistrarVehiculo":
                    request.setAttribute("Usuario", uDTO.getUsuarioToSend());  
                    request.getRequestDispatcher("RegistrarTransporte.jsp").forward(request, response);
                    break;
                    
                    
                case "conductorListar":
                    request.setAttribute("Usuario", uDTO.getUsuarioToSend());  
                    requestGetAttr(request, uDTO);
                    break;
                    
                    
                default:
                    throw new AssertionError();
                    
                
            }

        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo() {
            return "Short description";
        }// </editor-fold>
        
        private void requestGetAttr(HttpServletRequest request, UsuarioDTO dto){
                        request.setAttribute("Usuario", dto.getUsuarioToSend());  

        }
        
        private void ingresar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String correo = request.getParameter("email");
            String contrasena = request.getParameter("password");
            uDTO.setUsuarioToSend(userService.loguear(correo, contrasena).getUsuarioToSend());
            request.setAttribute("Usuario", uDTO.getUsuarioToSend());  
            //requestGetAttr(request, uDTO);
            if (uDTO != null) {
                switch (uDTO.getUsuarioToSend().getTipoUsuario()) {
                    case 3://Pasajero          
                        request.getRequestDispatcher("main.jsp").forward(request, response);
                        break;
                    case 2://Conductor
                        request.getRequestDispatcher("mainConductor.jsp").forward(request, response);
                        break;

                    case 1://Admin

                        break;
                    default:
                        throw new AssertionError();
                }
                
            } else {
                request.getRequestDispatcher("index.html").forward(request, response);

            }

            
        }
        
        
    
}
