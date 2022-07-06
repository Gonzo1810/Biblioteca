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
public class Multa {
    
   private int multa;
   private String rutSocio;
   private String cantdiamulta;
   private String cantdiapag;

    public Multa(int multa, String rutSocio, String cantdiamulta, String cantdiapag) {
        this.multa = multa;
        this.rutSocio = rutSocio;
        this.cantdiamulta = cantdiamulta;
        this.cantdiapag = cantdiapag;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    public String getRutSocio() {
        return rutSocio;
    }

    public void setRutSocio(String rutSocio) {
        this.rutSocio = rutSocio;
    }

    public String getCantdiamulta() {
        return cantdiamulta;
    }

    public void setCantdiamulta(String cantdiamulta) {
        this.cantdiamulta = cantdiamulta;
    }

    public String getCantdiapag() {
        return cantdiapag;
    }

    public void setCantdiapag(String cantdiapag) {
        this.cantdiapag = cantdiapag;
    }
   
   
   
   
    
}
