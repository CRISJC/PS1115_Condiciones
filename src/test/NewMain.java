/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;

/**
 *
 * @author INTERNET3
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String y=JOptionPane.showInputDialog("Ingrese edad");
            int edad = Integer.parseInt(y);
            if (edad >= 18) {
                JOptionPane.showMessageDialog(null, "Mayor");
            } else {
                JOptionPane.showMessageDialog(null, "Menor");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debee ingresar su edad en años cumplidos");
        }
    }
    
}
