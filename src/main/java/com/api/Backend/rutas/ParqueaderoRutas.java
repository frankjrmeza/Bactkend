/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.rutas;

import com.api.Backend.modelos.Parqueadero;
import com.api.Backend.servicio.ParqueaderoServicios;
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
public class ParqueaderoRutas {
    
    @Autowired
    ParqueaderoServicios service;

    @GetMapping("/Parqueadero")
    public List<Parqueadero> getAdministradores() {
        return service.getParqueaderos();
    }

    @GetMapping("/Administrador/{Id}")
    public Parqueadero getAdministrador(@PathVariable String Id) {
        Parqueadero p = service.getParqueadero(Id);
        return p;
    }

    @PostMapping("/Parqueadero")
    @ResponseStatus(HttpStatus.CREATED)
    public Parqueadero save(@RequestBody Parqueadero p) {
        p.setId("");
        service.save(p);
        return p;
    }

    @PutMapping("/Parqueadero")
    @ResponseStatus(HttpStatus.CREATED)
    public Parqueadero update(@RequestBody Parqueadero p) {
        service.save(p);
        return p;
    }

    @DeleteMapping("/Parqueadero/eliminar/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
    
}
