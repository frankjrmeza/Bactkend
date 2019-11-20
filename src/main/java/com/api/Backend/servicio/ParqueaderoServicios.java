/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.api.Backend.servicio;

import com.api.Backend.modelos.Parqueadero;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ParqueaderoServicios {
    public List<Parqueadero> getParqueaderos();
    public void save(Parqueadero p);
    public Parqueadero getParqueadero(String id);
    public void delete(String id);
    
}
