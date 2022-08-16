/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestion.examenes.servicios;

import com.gestion.examenes.entidades.Usuario;
import com.gestion.examenes.entidades.UsuarioRol;
import com.gestion.examenes.repositorios.RolRepositorio;
import com.gestion.examenes.repositorios.UsuarioRepositorio;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tony_
 */
@Service
public class UsuarioServicioImpl implements UsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Autowired
    private RolRepositorio rolRepositorio;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception{
        Usuario usuarioLocal= usuarioRepositorio.findByUsername(usuario.getUsername());
        if (usuarioLocal!=null){
            throw  new Exception("Usuario ya existe");
        }else {
            for (UsuarioRol usuarioRole : usuarioRoles) {
                rolRepositorio.save(usuarioRole.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepositorio.save(usuario);
        }
        return  usuarioLocal;
    }

    @Override
    public Usuario obtenerUsaario(String username) {
        return usuarioRepositorio.findByUsername(username);
    }

    @Override
    public void elimianrUsuario(Long usuarioId) {
        usuarioRepositorio.deleteById(usuarioId);
    }

}
