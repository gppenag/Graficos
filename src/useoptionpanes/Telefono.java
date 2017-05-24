/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class Telefono {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(250, 200));
        frame.setTitle("telefono");
        frame.setLayout(new BorderLayout());

 
        JPanel centerPanel = new JPanel(new GridLayout(4,3));
        for(int i =1; i<= 9; i++){
             JButton boton =new JButton(" "+i);
             centerPanel.add(boton); 
           //  boton.addActionListener(new MessageListener());
         }
        
        centerPanel.add(new JButton("*"));
        centerPanel.add(new JButton("0"));
        centerPanel.add(new JButton("#"));
        frame.add(centerPanel, BorderLayout.CENTER);
        
        
        JPanel southPanel = new JPanel(new FlowLayout());
        southPanel.add(new JLabel("numero: "));
        southPanel.add(new JTextField(10));
        frame.add(southPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }

}
