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
public class Estante {
    private int numEst;
    private int capacidad;

    public Estante(int numEst, int capacidad) {
        this.numEst = numEst;
        this.capacidad = capacidad;
    }

    public int getNumEst() {
        return numEst;
    }

    public void setNumEst(int numEst) {
        this.numEst = numEst;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
}
