package com.api.Backend.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "parqueadero")
public class Parqueadero {

    @Id
    @Column(name = "idParqueadero")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String idParqueadero;

    @Column(name = "nombreP")
    private String nombreP;

    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "cupos")
    private String cupos;

    @Column(name = "precio")
    private String precio;

    /**
     * @return the nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * @param nombreP the nombreP to set
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cupos
     */
    public String getCupos() {
        return cupos;
    }

    /**
     * @param cupos the cupos to set
     */
    public void setCupos(String cupos) {
        this.cupos = cupos;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the idParqueadero
     */
    public String getIdParqueadero() {
        return idParqueadero;
    }

    /**
     * @param idParqueadero the idParqueadero to set
     */
    public void setIdParqueadero(String idParqueadero) {
        this.idParqueadero = idParqueadero;
    }

    

}
