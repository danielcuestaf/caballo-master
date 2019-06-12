/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.carreradecaballos.interfaz.logica;

import co.carreradecaballos.interfaz.ICarrera;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class Caballos extends Thread{
    
    private JLabel etiqueta;
    private ICarrera p;

    public Caballos(JLabel etiqueta, ICarrera p) throws IOException{
        
        this.etiqueta = etiqueta;
        this.p = p;
    }
    
    @Override
    public void run(){
        FileWriter texto = null;
        try {
            texto = new FileWriter("hola.txt");
            texto.write("hola");
        } catch (IOException ex) {
            Logger.getLogger(Caballos.class.getName()).log(Level.SEVERE, null, ex);
        }
        int C1 =0, C2=0,C3=0,C4=0,C5=0,C6=0,C7=0,C8=0,C9=0,C10=0;
        while (true){
            try {
                sleep((int)(Math.random()*1000));
                C1 = p.getlbl1().getLocation().x;
                C2 = p.getlbl2().getLocation().x;
                C3 = p.getlbl3().getLocation().x;
                C4 = p.getlbl4().getLocation().x;
                C5 = p.getlbl5().getLocation().x;
                C6 = p.getlbl6().getLocation().x;
                C7 = p.getlbl7().getLocation().x;
                C8 = p.getlbl8().getLocation().x;
                C9 = p.getlbl9().getLocation().x;
                C10 = p.getlbl10().getLocation().x;
                
                if (C1<p.getlblBarrera().getLocation().x-30  && 
                    C2<p.getlblBarrera().getLocation().x-30  &&
                    C3<p.getlblBarrera().getLocation().x-30  &&
                    C4<p.getlblBarrera().getLocation().x-30  &&
                    C5<p.getlblBarrera().getLocation().x-30  &&
                    C6<p.getlblBarrera().getLocation().x-30  &&
                    C7<p.getlblBarrera().getLocation().x-30  &&
                    C8<p.getlblBarrera().getLocation().x-30  &&
                    C9<p.getlblBarrera().getLocation().x-30  &&
                    C10<p.getlblBarrera().getLocation().x-30){
                    etiqueta.setLocation(etiqueta.getLocation().x+30, etiqueta.getLocation().y);
                }else{
                    break;
                }
            } catch (InterruptedException e) {
            } 
            if(etiqueta.getLocation().x >= p.getlblBarrera().getLocation().x-20){
                if (C1>C2 && C1>C3 && C1>C4 && C1>C5 && C1>C6 && C1>C7 && C1>C8 && C1>C9 && C1>C10){
                    JOptionPane.showMessageDialog(null,"Gana 1"); 
                }else {
                    if (C2>C1 && C2>C3 && C2>C4 && C2>C5 && C2>C6 && C2>C7 && C2>C8 && C2>C9 && C2>C10){
                        JOptionPane.showMessageDialog(null,"Gana 2");
                    }else {
                    if (C3>C1 && C3>C2 && C3>C4 && C3>C5 && C3>C6 && C3>C7 && C3>C8 && C3>C9 && C3>C10){
                        JOptionPane.showMessageDialog(null,"Gana 3");
                    }else {
                    if (C4>C1 && C4>C2 && C4>C3 && C4>C5 && C4>C6 && C4>C7 && C4>C8 && C4>C9 && C4>C10){
                        JOptionPane.showMessageDialog(null,"Gana 4");
                    }else {
                    if (C5>C1 && C5>C2 && C5>C3 && C5>C4 && C5>C6 && C5>C7 && C5>C8 && C5>C9 && C5>C10){
                        JOptionPane.showMessageDialog(null,"Gana 5");
                    }else {
                    if (C6>C1 && C6>C3 && C6>C4 && C6>C5 && C6>C2 && C6>C7 && C6>C8 && C6>C9 && C6>C10){
                        JOptionPane.showMessageDialog(null,"Gana 6");
                    }else {
                    if (C7>C1 && C7>C3 && C7>C4 && C7>C5 && C7>C6 && C7>C2 && C7>C8 && C7>C9 && C7>C10){
                        JOptionPane.showMessageDialog(null,"Gana 7");
                    }else {
                    if (C8>C1 && C8>C3 && C8>C4 && C8>C5 && C8>C6 && C8>C7 && C8>C2 && C8>C9 && C8>C10){
                        JOptionPane.showMessageDialog(null,"Gana 8");
                    }else {
                    if (C9>C1 && C9>C3 && C9>C4 && C9>C5 && C9>C6 && C9>C7 && C9>C8 && C9>C2 && C9>C10){
                        JOptionPane.showMessageDialog(null,"Gana 9");
                    }else {
                    if (C10>C1 && C10>C3 && C10>C4 && C10>C5 && C10>C6 && C10>C7 && C10>C8 && C10>C9 && C10>C2){
                        JOptionPane.showMessageDialog(null,"Gana 10");
                    }else{
                        JOptionPane.showMessageDialog(null,"Empate");
                    }
                  }
                } 
              }
            }
          }
        }
      }
    }
  }
}
}
}
}

