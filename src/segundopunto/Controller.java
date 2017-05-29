/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundopunto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 * Clase que simula una clase Controlador
 * @author fabian.giraldo
 */
public class Controller implements ActionListener{
    private View view;
    private Model model;
    private String clave="";
    private boolean vfalso=false;

    public void setModel(Model model) {
        this.model = model;
    }

    public View getView() {
        return view;
    }

    public Model getModel() {
        return model;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setVfalso(boolean vfalso) {
        this.vfalso = vfalso;
    }

    public String getClave() {
        return clave;
    }

    public boolean isVfalso() {
        return vfalso;
    }
    
    public Controller (){
       //El controlador conoce su modelo 
      this.model = new Model();
    }    
    
    public void setView(View view ){
      this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

             String text = this.view.getField().getText();
            
            if(clave.equals(text)){
            vfalso=true;
            }else 
                vfalso=false;   
        
            if(vfalso==true){
            System.out.println("Clave correcta");
             view.setBackground(Color.GREEN);
             view.getButton2().setIcon(new ImageIcon("verde_1.jpg"));
            }
         
            if(view.getBackground()==Color.GREEN){
             
                clave= this.view.getField().getText();
             
             System.out.println("nueva Clave: "+clave);
             
             }
             
            this.model.setText(text);
  
        
    }
    
}
