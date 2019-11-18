/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.servicios.impl;

import com.api.Backend.modelos.Usuario;
import com.api.Backend.repository.UsuariosRepositorio;
import com.api.Backend.servicio.UsuariosServicios;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class UsuariosServicioImpl implements UsuariosServicios{
    
    @Autowired
    UsuariosRepositorio usuariosR;

    @Override
    @Transactional()
    public List<Usuario> getUsuarios() {
        return usuariosR.findAll();
    }

    @Override
    @Transactional
    public void save(Usuario u) {
        usuariosR.save(u);
    }

    @Override
    @Transactional()
    public Usuario getUsuario(int id) {
        return usuariosR.getOne(id);
    }

    @Override
    public void delete(int id) {
        usuariosR.deleteById(id);
    }
    
}
