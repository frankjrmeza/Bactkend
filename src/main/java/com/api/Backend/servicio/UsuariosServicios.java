/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.servicio;

import com.api.Backend.modelos.Usuario;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface UsuariosServicios {
    public List<Usuario> getUsuarios();
    public void save(Usuario u);
    public Usuario getUsuario(String id);
    public void delete(String id);
}
