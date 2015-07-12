/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficar;

/**
 *
 * @author Edson Al
 */
public class Trivial {
    private Punto punto;
    private int color;
    private boolean delet;
    private boolean moribundo;
    
    public Trivial(Punto punto, int color) {
        this.punto = punto;
        this.color = color;
        this.delet = false;
        this.moribundo=false;
    }

    public Punto getPunto() {
        return this.punto;
    }

    public int getColor() {
        return this.color;
    }
    public void Delet()
    {
        this.delet=true;
    }

    public boolean isDelet() {
        return this.delet;
    }

    public boolean isMoribundo() {
        return moribundo;
    }

    public void setMoribundo(boolean moribundo) {
        this.moribundo = moribundo;
    }
    
    
}
