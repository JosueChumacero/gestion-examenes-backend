/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.examenes.controladores;

import com.gestion.examenes.entidades.Rol;
import com.gestion.examenes.entidades.Usuario;
import com.gestion.examenes.entidades.UsuarioRol;
import com.gestion.examenes.servicios.UsuarioServicio;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tony_
 */
@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioControlador {
    
    @Autowired
    UsuarioServicio usuarioServicio;
    
    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{
        
        Set<UsuarioRol> roles = new HashSet<>();
        Rol rol=new Rol();
        rol.setRolId(2L);
        rol.setNombre("NORMAL");
        
        UsuarioRol usuarioRol=new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);
        roles.add(usuarioRol);
        return usuarioServicio.guardarUsuario(usuario, roles);
    }
    
    @GetMapping("/{username}")
    public Usuario obtenerUsuario(@PathVariable("username") String username){
        return usuarioServicio.obtenerUsaario(username);
    }
    
    @DeleteMapping("/{usuarioId}")
    public void  eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
        usuarioServicio.elimianrUsuario(usuarioId);
    }

}
