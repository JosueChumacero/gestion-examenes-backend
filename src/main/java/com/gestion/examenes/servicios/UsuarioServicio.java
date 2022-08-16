/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestion.examenes.servicios;

import com.gestion.examenes.entidades.Usuario;
import com.gestion.examenes.entidades.UsuarioRol;
import java.util.Set;

/**
 *
 * @author tony_
 */
public interface UsuarioServicio {
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles);
    
}
