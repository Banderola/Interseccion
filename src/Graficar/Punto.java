/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficar;


import java.awt.Point;

/**
 *
 * @author Edson Al
 */
public class Punto {
    private Point punto;
    private Linea linea_ant;
    private Linea linea_sig;

    public Punto(Linea linea1,Linea linea2,int x,int y) {
        this.punto = new Point(x,y);
        this.linea_ant = linea1;
        this.linea_sig = linea2;
    }

    public Point getPunto() {
        return punto;
    }

    public Linea getLinea_ant() {
        return linea_ant;
    }

    public Linea getLinea_sig() {
        return linea_sig;
    }
    
    
}