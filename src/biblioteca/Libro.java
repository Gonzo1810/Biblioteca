/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author gonro
 */
public class Libro {
    private int codigoL;
    private String titulo;
    private String tematica;
    private String autor;
    private String disponibilidad;
    private String localizacion;

    public Libro(int codigoL, String titulo, String tematica, String autor, String disponibilidad, String localizacion) {
        this.codigoL = codigoL;
        this.titulo = titulo;
        this.tematica = tematica;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
        this.localizacion = localizacion;
    }

    public int getCodigoL() {
        return codigoL;
    }

    public void setCodigoL(int codigoL) {
        this.codigoL = codigoL;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    
    
    
}
