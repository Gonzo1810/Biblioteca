/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Date;

/**
 *
 * @author gonro
 */
public class Prestamo {
    private int codigoP;
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private int idSocio;
    private String rutsocio;
    private Date fechadevolucion;

    public Prestamo(int codigoP, Date fechaPrestamo, Date fechaEntrega, int idSocio, String rutsocio, Date fechadevolucion) {
        this.codigoP = codigoP;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.idSocio = idSocio;
        this.rutsocio = rutsocio;
        this.fechadevolucion = fechadevolucion;
    }

    public int getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(int codigoP) {
        this.codigoP = codigoP;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getRutsocio() {
        return rutsocio;
    }

    public void setRutsocio(String rutsocio) {
        this.rutsocio = rutsocio;
    }

    public Date getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
    
    

  
}
