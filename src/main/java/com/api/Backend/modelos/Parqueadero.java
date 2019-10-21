package com.api.Backend.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parqueadero")
public class Parqueadero {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombreP")
    private String nombreP;
    
    @Column(name = "direccion")
    private  String direccion;
    
    @Column(name = "cupos")
    private String cupos;

    @Column(name = "precio")
    private String precio;
    
}
