/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JButton;

/**
 *
 * @author danpu
 */
public class Proceso {
    private int tiempo;
    private int tiempoUsado;
    private int posicionX;
    private int posicionY;
    
    public Proceso(int posicionX, int posicionY){
        this.tiempo = 0;
        this.tiempoUsado = 0;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    /**
     * @return the tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the tiempoUsado
     */
    public int getTiempoUsado() {
        return tiempoUsado;
    }

    /**
     * @param tiempoUsado the tiempoUsado to set
     */
    public void setTiempoUsado(int tiempoUsado) {
        this.tiempoUsado = tiempoUsado;
    }

    /**
     * @return the posicionX
     */
    public int getPosicionX() {
        return posicionX;
    }

    /**
     * @param posicionX the posicionX to set
     */
    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    /**
     * @return the posicionY
     */
    public int getPosicionY() {
        return posicionY;
    }

    /**
     * @param posicionY the posicionY to set
     */
    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }    
}
