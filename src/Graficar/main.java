/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficar;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Edson Al
 */
public class main extends javax.swing.JFrame {
    Point ant=null;
    boolean error=false;
    List<Linea> lineas = new ArrayList<Linea>();
    int colant=0;
    Graphics g=null;
    Graphics g2=null;
    BufferedImage image=null;
    float a=1,b=63,c=0;
    int coun=0;
    boolean valid=true;
    int esp=0;
    int count2=0;
    int count3=0;
    int contador=0;
    public main() {
        
        initComponents();
        image=new BufferedImage(canvas1.getWidth(), canvas1.getHeight(),BufferedImage.TYPE_4BYTE_ABGR_PRE);
        g = image.getGraphics();
        g2= canvas1.getGraphics();
        image.createGraphics().setBackground(Color.WHITE);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.setPreferredSize(new java.awt.Dimension(500, 500));
        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                canvas1MouseReleased(evt);
            }
        });
        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas1MouseDragged(evt);
            }
        });

        jToggleButton1.setText("Borrar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Checar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("0");

        jLabel2.setText("Estado");

        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Δ");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("□");

        jLabel6.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButton1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canvas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MousePressed
    
        jLabel2.setText( "Estado:Excelente");
        g.setColor(Color.getHSBColor(a, b, c));
        g2.setColor(Color.getHSBColor(a, b, c));
        
        colant=Color.getHSBColor(a, b, c).getRGB();
        ant=evt.getPoint();
        
     
        lineas.add(new Linea(colant));
        lineas.get(lineas.size()-1).Trazar(ant);
        checar((int)ant.getX(),(int)ant.getY(),0,0);
            a+=63;
            b+=33;
            c+=20;
       
        
    }//GEN-LAST:event_canvas1MousePressed

    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged
        
            curva(evt.getPoint());
            ant=evt.getPoint();
            
        
    }//GEN-LAST:event_canvas1MouseDragged

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        Borrar();
        jLabel2.setText( "Estado");
        lineas.clear();
        coun=0;
        count2=0;
        count3=0;
        jLabel1.setText( Integer.toString(0));
        jLabel3.setText( Integer.toString(0));
        jLabel6.setText( Integer.toString(0));
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                Ordenar();
                Marcas marcas=new Marcas();
                Marcas merror=new Marcas();
                Boolean cambio=false;
                Boolean error2=false;
                int contemp=0;
                boolean eliminar=false;
                int lcol=23456;
                Punto next=lineas.get(0).getPuntos().get(0);
                marcas.Add(next, lcol);
                Linea siguiente;
                
                do{
                //----------------------Localizar Linea-------------------------  
                    if(next.getLinea_ant().getColor()!=lcol)
                    {
                        siguiente=next.getLinea_ant();
                        
                    }
                    else 
                    {
                       siguiente=next.getLinea_sig(); 
                        
                    }
                     
                    int n=Buscar(siguiente,next.getPunto());
                //------------------------incrucijada---------------------------
                    if(n<siguiente.getPuntos().size()-1 && n>0 )
                    {
                               
                                //--Cambiar direccion a La izquierda--
                                if(cambio==true)
                                {
                                    cambio=false;
                                    if(error2==false)
                                    {
                                       eliminar=true;
                                       marcas.SetMarcar();
                                       contador=0;
                                       
                                    }
                                    else
                                    {
                                        contador=contemp;
                                    }
                                    error2=false;
                                    next=siguiente.getPuntos().get(n-1).clone();
                                    
                                }
                                
                                //--Cambiar direccion a La Derecha--
                                else
                                {
                                    if(marcas.Add(next, lcol)==true)
                                    {
                                        contador=0;
                                        if(eliminar==true)
                                        {
                                            contador++;
                                        }
                                    }
                                    else
                                    {

                                        merror.Add(next, lcol);
                                        error2=true;
                                        contemp=contador;
                                    }
                                    next=siguiente.getPuntos().get(n+1).clone();
                                }
                                
                                lcol=siguiente.getColor();
                                
                    }
                //-------------------Derecha libre------------------------------
                    else if(n<siguiente.getPuntos().size()-1)
                    {
                                next=siguiente.getPuntos().get(n+1).clone();
                                lcol=siguiente.getColor();
                                
                    }
                //-------------------Izquierda libre----------------------------
                    else if(n>0)
                    {
                                next=siguiente.getPuntos().get(n-1).clone();
                                lcol=siguiente.getColor();
                    }
                //--------------------Encontrar Marcas--------------------------   
                    if(marcas.ObtenerPoint().distance(next.getPunto())==0 )
                    {
                            if(error2==true)
                            {
                                merror.Clear();
                                error2=false;
                            }
                            //---Contar Triangulos---
                            if(contador==2)
                            {
                                count2++;
                                jLabel3.setText( Integer.toString(count2));
                            }
                             //---Contar Cuadrados--- 
                            else if(contador==3)
                            {
                                count3++;
                                jLabel6.setText( Integer.toString(count3));
                            }
                            
                            
                           //----Eliminar Marca-----
                           if(eliminar==true)
                           {
                               eliminar=false;
                               marcas.Del();
                           }
                           
                           lcol=marcas.ObtenerColor();
                           next=marcas.ObtenerValor();
                           cambio=true;
                           
                    }
                        
                        
            //--------------Encontrar Errores-----------------------------------
                    else if(merror.ObtenerPoint().distance(next.getPunto())==0 )
                    {
                            lcol=merror.ObtenerColor();
                            next=merror.ObtenerValor();
                            cambio=true;
                    }
                        
                    contador++;
                    
                }while(marcas.elementos()==false);
                
                       
            
       
 
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void canvas1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseReleased
        if(lineas.size()-2!=lineas.get(lineas.size()-1).getPuntos().size()-1||error==true)
        {
            if(error==false){
                jLabel2.setText( "Falto Interseccionar");
            }
            error=false;
            
            for (Punto temp : lineas.get(lineas.size()-1).getPuntos()) { 
                int n=0;
                    for (Punto temp2 : temp.getLinea_ant().getPuntos()) { 
                        if(temp.getPunto().getX()==temp2.getPunto().getX() && temp.getPunto().getY()==temp2.getPunto().getY())
                        {
                            temp2.getLinea_ant().Borrar(n);
                            coun--;
                            
                            break;
                        }
                        n++;
                
                    }
            }
            jLabel1.setText( Integer.toString(coun));
            lineas.remove(lineas.size()-1);
            Repintar();
            
        }
    }//GEN-LAST:event_canvas1MouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    public void curva(Point punto){
            int dify=((int)punto.getY()-(int)ant.getY());
            int difx=((int)punto.getX()-(int)ant.getX());
            int inc=(int)ant.getX();
            int s=0;
            int s2=0;
            int dy=(int)punto.getY();
            int dy2=(int)ant.getY();
            
           
                            //Horizontal
                            if(punto.getX()==ant.getX())
                            {
                                inc=(int)ant.getY();
                                s=dify/Math.abs(dify);
                                while(inc!=punto.getY())
                                {
                                    
                                    
                                    inc+=s;
                                    checar((int)punto.getX(),(int)inc,0,0);
                       
                                }
                                
                               
                
                            }
                            //Vertical
                            else if(punto.getY()==ant.getY())
                            {
                                
                                s=difx/Math.abs(difx);
                                while(inc!=punto.getX())
                                {
                                    
                                    
                                    inc+=s;
                                    checar((int)inc,(int)punto.getY(),0,0);
                       
                                }
                                
                               
                
                            }
                            
                            
                            
                            
                           //Pendiente
                            else 
                            {
                               
                                s=(difx)/Math.abs(difx);
                                s2=dify/Math.abs(dify);
                                while(inc!=punto.getX())
                                {
                                    
                                    inc+=s;
                                    dy=((((int)ant.getY()-(int)punto.getY())*((int)punto.getX()-inc))/((int)punto.getX()-(int)ant.getX()))+(int)punto.getY();
                                    
                                       if((dy-dy2)>1||(dy-dy2)<-1)
                                        {
                                            
                                            while(dy!=dy2)
                                            {
                                    
                                            
                                                if(s!=s2)
                                                {
                                                    dy2-=s;
                                                }
                                                else
                                                {
                                                    dy2+=s;
                                                }
                                                checar((int)inc,(int)dy2,s,s2);
                                            
                                    
                                    
                                            }
                                        
                                       
                                        }
                                        dy2=dy;     
                                        checar((int)inc,dy,s,s2);
                                    
                                }
                                
                                
                                
                            }
                            
                            
                           
                                    
                           
                
                           
          
            
            
        
       
   //Dibujar en el lienzo   
   //Graphics2D _g2= (Graphics2D) g2; 
   //_g2.setStroke(new BasicStroke(2));
   //_g2.drawLine((int)ant.getX(), (int)ant.getY(), (int)punto.getX(), (int)punto.getY());
   
    
  }
    void checar(int x,int y,int sx,int sy)
    {
        
        int col=image.getRGB(x,y);
        int col1=image.getRGB(x,y-1);
        int col2=image.getRGB(x-1,y);
        int col3=image.getRGB(x,y+1);
        int col4=image.getRGB(x+1,y);
        
        
            //Buscar puntos de Interseccion
        if(error==false)
        {
            if(sx !=sy)
            {
                validar(col,col1,col4,col2,col3,x,y);
                
            }
            
            else 
            {
                validar(col,col1,col2,col3,col4,x,y);
                
            }
            
        }
            
            
           
       
        
        //Dibujar puntos en el buffer
        //g2.drawOval(x, y, 2, 2); 
        g2.fillOval(x, y, 2, 2);
        image.setRGB(x, y, colant);
        
        
       lineas.get(lineas.size()-1).Trazar(new Point(x,y));
        
        
    }
    void validar(int col,int col1,int col2,int col3,int col4,int x,int y)
    {
        
        //Buscar Intersecciones 
        if((col1!=0 && col1!=colant && col1==col2 && valid==true)||(col3!=0 && col3!=colant && col3==col4 && valid==true)||(col!=0  && col!=colant && valid==true))
        {
            
            valid=false;
            coun++;
            jLabel1.setText( Integer.toString(coun));
            
            for (Linea ltemp : lineas) {
                if(col!=0 && ltemp.getColor()==col||col1!=0 && ltemp.getColor()==col1||col3!=0 && ltemp.getColor()==col3)
                {
                        
                        for (Punto punto : lineas.get(lineas.size()-1).getPuntos())
                        {
                            if(punto.getLinea_ant().getColor()==ltemp.getColor()){
                                jLabel2.setText( "Linea Ambigua");
                                error=true;
                                coun--;
                                break;
                            }
                        }
                        
                        if(error==false)
                        {
                            
                            for (Punto punto : ltemp.getPuntos()) {
                                if(punto.getPunto().distance(x, y)<=3){
                                    error=true;
                                    coun--;
                                    jLabel2.setText( "Interseccion Ambigua");
                                    break;
                                }
                            }
                            if(error==false)
                            {
                                lineas.get(lineas.size()-1).setPunto(new Punto(ltemp,lineas.get(lineas.size()-1),x,y));
                                ltemp.setPunto(new Punto(ltemp,lineas.get(lineas.size()-1),x,y));
                            }
                            
                            
                        }
                        
                    
                    break;
                    
                }
                
                
            }
            
            
                    
                    
        }
        
        else if(col==0)
        {
            esp++;
            if(esp==2)
            {
              esp=0; 
              valid=true;
            }
            
                
        }
        
        
    }
   
    void Repintar()
    {
        Borrar();
        for (Linea linea : lineas) {
            Color color=new Color(linea.getColor());
            g2.setColor(color);
            for (Point punto : linea.getTrazo()) {
                g2.fillOval((int)punto.getX(), (int)punto.getY(), 2, 2);
                image.setRGB((int)punto.getX(), (int)punto.getY(),color.getRGB());
            
            }
            
        }
    }
    void Borrar()
    {
        canvas1.update(g2);
        g2.setColor(Color.white);
        for(int i=0;i<canvas1.getWidth();i++)
        {
            for(int j=0;j<canvas1.getHeight();j++)
            {
                image.setRGB(i, j,0);
               
            }
            
        }
        
    }
    void Ordenar()
    {
        for (Linea ltemp : lineas) {
             for (Punto punto : ltemp.getPuntos()) {
                 double orden=ltemp.getTrazo().get(0).distance(punto.getPunto());
                 punto.setOrden(orden);
                 
             }
             Collections.sort(ltemp.getPuntos());
         }

    }
    int Buscar(Linea linea,Point punto)
    {
        int index=0;
        for (int i=0;i<linea.getPuntos().size();i++) {
           if(linea.getPuntos().get(i).getPunto().getX()==punto.getX()&& linea.getPuntos().get(i).getPunto().getY()==punto.getY()) 
           {
               index=i;
               break;
           }
        }
        return index;
    }
    
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
