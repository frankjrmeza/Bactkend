/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.servicios.impl;

import com.api.Backend.modelos.Reserva;
import com.api.Backend.repository.ReservaRepositorio;
import com.api.Backend.servicio.ReservaServicios;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class ReservaServiciosImpl implements ReservaServicios {
    
    @Autowired
    ReservaRepositorio res;

    @Override
    @Transactional()
    public List<Reserva> getReservas() {
        return res.findAll();
    }

    @Override
    @Transactional()
    public void save(Reserva r) {
        res.save(r);
    }

    @Override
    @Transactional()
    public Reserva getReserva(String id) {
        return res.getOne(id);
    }

    @Override
    public void delete(String id) {
        res.deleteById(id);
    }
    
}
