/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficar;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Edson Al
 */
public class Linea {
    private ArrayList<Point> puntos=new ArrayList <Point>();
    private int color;

    public Linea(int color) {
        this.color = color;
    }

    public ArrayList<Point> getPuntos() {
        return puntos;
    }

    public void setPunto(Point punto) {
        this.puntos.add(punto);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    

   
    
    
}
