/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.rutas;

import com.api.Backend.modelos.Reserva;
import com.api.Backend.servicio.ReservaServicios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Dell
 */
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/app")

public class ReservaRutas {
    
    @Autowired
    ReservaServicios service;

    @GetMapping("/Reserva")
    public List<Reserva> getReservas() {
        return service.getReservas();
    }

    @GetMapping("/Reserva/{Id}")
    public Reserva getReserva(@PathVariable String Id) {
        Reserva r = service.getReserva(Id);
        return r;
    }

    @PostMapping("/Reserva")
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva save(@RequestBody Reserva r) {
        r.setId("");
        service.save(r);
        return r;
    }

    @PutMapping("/Reserva")
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva update(@RequestBody Reserva r) {
        service.save(r);
        return r;
    }

    @DeleteMapping("/Reserva/eliminar/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
    
}
