package com.api.Backend.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Reserva")
public class Reserva {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombreP")
    private String nombreP;
    
    @Column(name = "placaVehiculo")
    private String placaVehiculo;
    
    @Column(name = "tiempoReserva")
    private String tiempoReserva;
    
    
}
