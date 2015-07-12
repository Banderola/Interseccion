/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficar;


import java.awt.Point;
import java.util.*;

/**
 *
 * @author Edson Al
 */
public class Punto implements Comparable<Punto> {
    private Point punto;
    private Linea linea_ant;
    private Linea linea_sig;
    private double orden;
    private int marca;
    @Override
        public int compareTo(Punto o) {
            if (orden < o.orden) {
                return -1;
            }
            if (orden > o.orden) {
                return 1;
            }
            return 0;
        }

    public Punto(Linea linea1,Linea linea2,int x,int y) {
        this.punto = new Point(x,y);
        this.linea_ant = linea1;
        this.linea_sig = linea2;
        this.marca=0;
    }

    public void setOrden(double orden) {
        this.orden = orden;
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

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }
    public Punto clone()  {
        Punto clon = new Punto(this.linea_ant,this.linea_sig,(int)this.punto.getX(),(int)this.punto.getY());
        clon.orden=this.orden;
        
        return clon;
    }
    
    
    
}
