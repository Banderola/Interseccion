/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficar;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edson Al
 */
public class Marcas {
    private List<Trivial> marcas;
    
    public Marcas() {
        marcas=new ArrayList <Trivial>();
        
    }
    

    public boolean Add(Punto punto,int color) {
        
        if(Busqueda(punto,color)==false)
        {
            if(marcas.size()>0 && marcas.get(ObtenerIndex()).isMoribundo()==true)
            {
                marcas.add((ObtenerIndex()),new Trivial(punto,color));
                
            }
            else
            {
                marcas.add((ObtenerIndex()+1),new Trivial(punto,color));
            }
            
            
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public void Del() {
        if(marcas.size()!=0)
        {
            marcas.get(ObtenerIndex()).Delet();
        }
    }
    public int ObtenerIndex()
    {
        int in=-10;
        
            for (int j=0;j<marcas.size();j++) { 
              if(marcas.get(j).isDelet()==true)
              {
                  in=j-1;
                  break;
              }
                
            }
            if(in==-10)
            {
                in=marcas.size()-1;
            }
        
        
        return in;
        
    }
    public Point ObtenerPoint()
    {
        if(marcas.size()>0 && ObtenerIndex()>=0)
        {
            return marcas.get(ObtenerIndex()).getPunto().getPunto();
        }
        else
        {
            return new Point(0,0);
        }
            
        
        
    }
    
    
    private boolean Busqueda(Punto punto, int color)
    {
        boolean encontrado=false;
        for (Trivial temp : marcas) { 
              if(temp.getColor()==color && temp.getPunto().getPunto().distance(punto.getPunto())==0)
              {
                  encontrado=true;
              }
              
                
        }
        return encontrado;
    }
    
    public Punto ObtenerValor()
    {
            Punto punto= marcas.get(ObtenerIndex()).getPunto().clone();
          
               //Del();
            
            
            return punto;
        
        
    }
    public int ObtenerColor()
    {
        return marcas.get(ObtenerIndex()).getColor();
    }
    public int size()
    {
        return marcas.size();
    }
    
    public Boolean elementos()
    {
        int index=0;
        for (int j=0;j<marcas.size();j++) { 
              if(marcas.get(j).isDelet()==false)
              {
                  index++;
                  //break;
              }
                
            }
        if(marcas.size()>1 && index==1)
        {
           
            return true;
        }
        else
        {
           return false; 
        }
        
        
    }
     public void Clear()
    {
        marcas.clear();
    }
    public void SetMarcar()
    {
        for (Trivial temp : marcas) { 
              temp.setMoribundo(false);    
        }
        marcas.get(ObtenerIndex()).setMoribundo(true);
        
    }

    public int getNumerror() {// corregir
        if(ObtenerIndex()>0)
        {
            return marcas.get(ObtenerIndex()+1).getNumerror();
        }
        else if(marcas.size()>1)
        {
            return marcas.get(1).getNumerror();
        }
        else
        {
             return marcas.get(0).getNumerror();
        }
            
        
    }

    public void setNumerror(int numerror) {
        
        if(marcas.size()!=0)
        {
            marcas.get(ObtenerIndex()).setNumerror(numerror);
        }
       
    }
    public int getError(int index)
    {
        return marcas.get(index).getNumerror();
    }
    
    public Punto Valor(int index) {
       return marcas.get(index).getPunto();
    }
    public int Color(int index) {
        return marcas.get(index).getColor();
    }
    
    
     
}
