/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stcum.usuarioservice.dto;

import com.stcum.usuarioservice.model.Usuario;

/**
 *
 * @author Andres
 */
public class UsuarioDTO {
    private Usuario usuarioToSend;

    public UsuarioDTO(Usuario usuarioToSend) {
        this.usuarioToSend = usuarioToSend;
    }
    
    public UsuarioDTO() {
        this.usuarioToSend = null;
    }
    
    public Usuario getUsuarioToSend(){
        return this.usuarioToSend;
    }
    
    public void setUsuarioToSend(Usuario usuarioToSend){
        this.usuarioToSend = usuarioToSend ;
    }

}
