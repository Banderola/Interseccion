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
    private ArrayList<Punto> puntos=new ArrayList <Punto>();
    private ArrayList<Point> dibujo=new ArrayList <Point>();
    private int color;

    public Linea(int color) {
        this.color = color;
    }

    public ArrayList<Punto> getPuntos() {
        return puntos;
    }

    public void setPunto(Punto punto) {
        this.puntos.add(punto);
    }
    public void Trazar(Point punto) {
        this.dibujo.add(punto);
    }
    public ArrayList<Point> getTrazo() {
        return dibujo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    public void Borrar(int index) {
        puntos.remove(index);
    }
    

   
    
    
}
