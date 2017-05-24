/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class GUI {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(new Dimension(250, 200));
        frame.setTitle("telefono");
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel("Type tu xip: ");
        JTextField field = new JTextField(5);
        JButton boton = new JButton("Submit");
        boton.setIcon(new ImageIcon("icon.gif"));
        boton.addActionListener(new MessageListener(field));
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(field);
        frame.add(boton);
        frame.pack();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, 
                dim.height/2-frame.getSize().height/2);
        
        frame.setVisible(true);
        
    }
}
