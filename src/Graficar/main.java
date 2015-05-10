/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficar;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;


/**
 *
 * @author Edson Al
 */
public class main extends javax.swing.JFrame {
    Point ant=null;
    int colant=0;
    Graphics g=null;
    Graphics g2=null;
    BufferedImage image=null;
    float a=1,b=63,c=0;
    int coun=0;
    boolean valid=true;
    int esp=0;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        canvas1.setBackground(new java.awt.Color(255, 255, 255));
        canvas1.setPreferredSize(new java.awt.Dimension(500, 500));
        canvas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                canvas1MousePressed(evt);
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

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(151, 151, 151)
                        .addComponent(jButton2)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButton1)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void canvas1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MousePressed
    
        
        g.setColor(Color.getHSBColor(a, b, c));
        g2.setColor(Color.getHSBColor(a, b, c));
        
        colant=Color.getHSBColor(a, b, c).getRGB();
        ant=evt.getPoint();
        checar((int)ant.getX(),(int)ant.getY(),false,0,0);
            
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
        canvas1.repaint();
        image.createGraphics().setBackground(Color.WHITE);
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            
           
            
                            if(punto.getX()==ant.getX())
                            {
                                inc=(int)ant.getY();
                                s=dify/Math.abs(dify);
                                while(inc!=punto.getY())
                                {
                                    
                                    
                                    inc+=s;
                                    checar((int)punto.getX(),(int)inc,false,0,0);
                       
                                }
                                
                               
                
                            }
                            else if(punto.getY()==ant.getY())
                            {
                                
                                s=difx/Math.abs(difx);
                                while(inc!=punto.getX())
                                {
                                    
                                    
                                    inc+=s;
                                    checar((int)inc,(int)punto.getY(),false,0,0);
                       
                                }
                                
                               
                
                            }
                            
                            else if(difx==-1 || difx==1)
                            {
                                
                                s=(difx)/Math.abs(difx);
                                s2=dify/Math.abs(dify);
                                inc+=s;
                                if(dify>1||dify<-1)
                                {
                                
                                 while(dy2!=dy)
                                 {
                                   if(s!=s2)
                                            {
                                                dy2-=s;
                                            }
                                            else
                                            {
                                                dy2+=s;
                                            } 
                                    
                                    checar((int)inc,dy2,true,s,s2);
                                    
                       
                                }
                                }
                                checar((int)punto.getX(),(int)punto.getY(),true,s,s2);
                            }
                            
                            
                           
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
                                                checar((int)inc,(int)dy2,true,s,s2);
                                            
                                    
                                    
                                            }
                                        
                                       
                                        }
                                        dy2=dy;     
                                        checar((int)inc,dy,true,s,s2);
                                    
                                }
                                
                                
                                
                            }
                            
                            
                           
                                    
                           
                
                           
          
            
            
        
       
      
     Graphics2D _g2= (Graphics2D) g2; 
     Graphics2D _g= (Graphics2D) g;
     //_g.setStroke(new BasicStroke(1));
     //_g.drawLine((int)ant.getX(), (int)ant.getY(), (int)punto.getX(), (int)punto.getY());
     //g2.drawOval((int)punto.getX(), (int)punto.getY(), 2, 2);
     
     //g2.drawOval((int)punto.getX(), (int)punto.getY(), 2, 2);
   _g2.setStroke(new BasicStroke(2));
   _g2.drawLine((int)ant.getX(), (int)ant.getY(), (int)punto.getX(), (int)punto.getY());
   
    
  }
    void checar(int x,int y,boolean pen,int sx,int sy)
    {
        
        int col=image.getRGB(x,y);
        
        int col1=image.getRGB(x,y-1);
        int col2=image.getRGB(x-1,y);
        int col3=image.getRGB(x,y+1);
        int col4=image.getRGB(x+1,y);
        //g2.drawOval((int)x , (int)y, 1, 1);
        if(pen==false)
        {
            if((col!=0   && col!=colant && valid==true))
            {
                valid=false;
                coun++;
                jLabel1.setText( Integer.toString(coun)); 
                         
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
        
        else
        {
            
            if(sx==1 && sy==-1)
            {
                validar(col,col1,col4,col2,col3);
                
                
            }
            else if(sx==-1 && sy==1)
            {
                validar(col,col2,col3,col1,col4);
                
                
            }
            else if(sx==-1 && sy==-1)
            {
                validar(col,col1,col2,col3,col4);
                
                
            }
            else  if(sx==1 && sy==1)
            {
               validar(col,col3,col4,col1,col2);
                
            }
            
           
        }
                                    
        
       
        //g2.drawOval(x, y, 1, 1);
        
        image.setRGB(x, y, colant);
        //int a=0;
        
    }
    void validar(int col,int col1,int col2,int col3,int col4)
    {
        if((col1!=0 && col1!=colant && col1==col2 && valid==true)||(col3!=0 && col3!=colant && col3==col4 && valid==true)||(col!=0  && col!=colant && valid==true))
        {
            valid=false;
            coun++;
            jLabel1.setText( Integer.toString(coun));
                    
                    
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
