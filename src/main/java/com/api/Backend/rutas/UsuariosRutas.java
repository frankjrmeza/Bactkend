/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.rutas;

import com.api.Backend.modelos.Usuario;
import com.api.Backend.servicio.UsuariosServicios;
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
public class UsuariosRutas {

    @Autowired
    UsuariosServicios service;

    @GetMapping("/Usuario")
    public List<Usuario> getUsuarios() {
        return service.getUsuarios();
    }

    @GetMapping("/Usuario/{Id}")
    public Usuario getUsuario(@PathVariable String Id) {
        Usuario p = service.getUsuario(Id);
        return p;
    }

    @PostMapping("/Usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario p) {
        p.setId("");
        service.save(p);
        return p;
    }

    @PutMapping("/Usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario update(@RequestBody Usuario p) {
        service.save(p);
        return p;
    }

    @DeleteMapping("/Usuario/eliminar/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
