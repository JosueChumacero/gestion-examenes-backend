/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.gestion.examenes.repositorios;

import com.gestion.examenes.entidades.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author tony_
 */
public interface RolRepositorio extends JpaRepository<Rol, Long> {

}
