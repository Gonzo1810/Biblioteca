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
public class Socio {
    private String rut;
    private String nombre;
    private String direccion;
    private int cantlibsemp;
    private boolean estadosocio;

    public Socio(String rut, String nombre, String direccion, int cantlibsemp, boolean estadosocio) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantlibsemp = cantlibsemp;
        this.estadosocio = estadosocio;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantlibsemp() {
        return cantlibsemp;
    }

    public void setCantlibsemp(int cantlibsemp) {
        this.cantlibsemp = cantlibsemp;
    }

    public boolean isEstadosocio() {
        return estadosocio;
    }

    public void setEstadosocio(boolean estadosocio) {
        this.estadosocio = estadosocio;
    }
    

}
