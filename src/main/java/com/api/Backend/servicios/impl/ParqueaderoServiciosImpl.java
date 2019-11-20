/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.servicios.impl;

import com.api.Backend.modelos.Parqueadero;
import com.api.Backend.repository.ParqueaderoRepositorio;
import com.api.Backend.servicio.ParqueaderoServicios;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class ParqueaderoServiciosImpl implements ParqueaderoServicios{
    
    @Autowired
    ParqueaderoRepositorio par;

    @Override
    @Transactional
    public List<Parqueadero> getParqueaderos() {
        return par.findAll();
    }

    @Override
    @Transactional
    public void save(Parqueadero p) {
        par.save(p);
    }

    @Override
    @Transactional
    public Parqueadero getParqueadero(String id) {
        return par.getOne(id);
    }

    @Override
    public void delete(String id) {
        par.deleteById(id);
    }
    
    
}
