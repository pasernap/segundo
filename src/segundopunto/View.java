/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundopunto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/**
 *
 * @author fabian.giraldo
 */
public class View  extends JFrame{
    //Cada vista tiene su controlador.
    Controller controller;
    Controller2 controller2;
    
    //Variables de la vista.
    private JTextField field ;
    
    private  JButton button;
    private  JButton button2;

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton2() {
        return button2;
    }
    
    public View(Controller controller,Controller2 controller2){
        
       this.controller = controller;
       this.controller.setView(this);
       this.controller2 = controller2;
       this.controller2.setView(this);
       
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       setSize(new Dimension(200, 200));
       
       setTitle("Lock");
   
       this.field = new JTextField(20);    

       this.button = new JButton("Change Combination");
        setLayout(new FlowLayout());
        button.addActionListener(controller);
      
        this.button2 = new JButton("Open/Close");
        setLayout(new FlowLayout());
        button2.addActionListener(controller2);
        button2.setIcon(new ImageIcon("rojo_1.jpg"));

       
       BoxLayout boxLayout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS); // top to bottom
       setLayout(boxLayout);
      

       add(this.field);
       add(this.button); 
       add(this.button2);
      
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

       // Determine the new location of the window
       int w = this.getSize().width;
       int h = this.getSize().height;
       int x = (dim.width-w)/2;
       int y = (dim.height-h)/2;

        // Move the window
       this.setLocation(x, y);
        
       pack();
       setVisible(true);
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public JTextField getField() {
        return field;
    }

    public void setField(JTextField field) {
        this.field = field;
    }   
    
}
