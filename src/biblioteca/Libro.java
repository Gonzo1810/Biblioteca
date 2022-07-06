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
    private int numero_estante;

    public Libro(int codigoL, String titulo, String tematica, String autor, String disponibilidad, String localizacion, int numero_estante) {
        this.codigoL = codigoL;
        this.titulo = titulo;
        this.tematica = tematica;
        this.autor = autor;
        this.disponibilidad = disponibilidad;
        this.localizacion = localizacion;
        this.numero_estante = numero_estante;
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

    public int getNumero_estante() {
        return numero_estante;
    }

    public void setNumero_estante(int numero_estante) {
        this.numero_estante = numero_estante;
    }

  
    
    
}
