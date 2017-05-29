/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundopunto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Clase que simula una clase Controlador
 * @author fabian.giraldo
 */
public class Controller2 implements ActionListener{
    private Controller controler;
    private View view;
    private Model model;
    private String clave="lol";
    private boolean vfalso=false;

    public String getClave() {
        return clave;
    }

    public boolean isVfalso() {
        return vfalso;
    }
    
    public Controller2 (){
       //El controlador conoce su modelo 
      this.model = new Model();
    }    
    
    public void setView(View view ){
      this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

         
             if(view.getBackground()==Color.GREEN){
             
             view.setBackground(Color.RED);
             view.getButton2().setIcon(new ImageIcon("rojo_1.jpg"));
             }

    }
    
}
