/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestion.examenes.repositorios;

import com.gestion.examenes.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tony_
 */
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

    public Usuario findByUsername(String username);
}
