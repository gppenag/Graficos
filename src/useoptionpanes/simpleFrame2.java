/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Estudiante
 */
public class simpleFrame2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Image Icon = Toolkit.getDefaultToolkit().getImage("icon.gif");
        frame.setIconImage(Icon);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setBackground(Color.red);
        frame.setSize(new Dimension(300,120));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, 
                dim.height/2-frame.getSize().height/2);
        
        frame.setTitle("A frame");
        frame.setVisible(true);
        
        JButton button1 = new JButton();
        button1.setText("yo soy un boton");
        button1.setBackground(Color.BLUE);
        frame.add(button1);
        
        
        
         JButton button2 = new JButton();
        button2.setText("seleccioname");
        button2.setBackground(Color.BLUE);
        frame.add(button2);
      //  button2.addActionListener(new MessageListener());
        
        frame.setVisible(true);
        
    }
}
