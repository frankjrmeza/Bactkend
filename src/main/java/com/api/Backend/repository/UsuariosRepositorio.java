/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.repository;

import com.api.Backend.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
 */
public interface UsuariosRepositorio extends JpaRepository <Usuario, String> {
    
}
