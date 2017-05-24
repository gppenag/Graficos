/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package useoptionpanes;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class UseOptionPanes {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Cual es tù nombre?");
        int seleccionar = JOptionPane.showConfirmDialog(null,"Te gusta el pastel?"+ nombre+"?");
        if(seleccionar == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Por supuesto, a quien no ?");
        }else{
            JOptionPane.showMessageDialog(null, "Tenomos que ponernos de acuerdo o en desacuerdo");
        }
        
    }
    
}
