/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.servicios.impl;

import com.api.Backend.modelos.Administrador;
import com.api.Backend.repository.AdministradorRepositorio;
import com.api.Backend.servicio.AdministradorServicios;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class AdministradorServiciosImpl implements AdministradorServicios {
    
    @Autowired
    AdministradorRepositorio repor;
    
    @Override
    @Transactional()
    public List<Administrador> getAdministrador() {
        return repor.findAll();
    }

    @Override
    @Transactional
    public void save(Administrador a) {
        repor.save(a);
    }

    @Override
    @Transactional
    public Administrador getAdministrador(String id) {
        return repor.getOne(id);
    }

    @Override
    public void delete(String id) {
        repor.deleteById(id);
    }
    
}
