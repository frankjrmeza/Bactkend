/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.rutas;

import com.api.Backend.modelos.Administrador;
import com.api.Backend.servicio.AdministradorServicios;
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
public class AdministradorRutas {

    @Autowired
    AdministradorServicios service;

    @GetMapping("/Administrador")
    public List<Administrador> getAdministradores() {
        return service.getAdministrador();
    }

    @GetMapping("/Administrador/{Id}")
    public Administrador getAdministrador(@PathVariable String Id) {
        Administrador a = service.getAdministrador(Id);
        return a;
    }

    @PostMapping("/Administrador")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador save(@RequestBody Administrador a) {
        a.setId("");
        service.save(a);
        return a;
    }

    @PutMapping("/Administrador")
    @ResponseStatus(HttpStatus.CREATED)
    public Administrador update(@RequestBody Administrador a) {
        service.save(a);
        return a;
    }

    @DeleteMapping("/Administrador/eliminar/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }

}
