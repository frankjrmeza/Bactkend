/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.servicio;

import com.api.Backend.modelos.Administrador;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface AdministradorServicios {
    public List<Administrador> getAdministrador();
    public void save(Administrador a);
    public Administrador getAdministrador(String id);
    public void delete(String id);
}
