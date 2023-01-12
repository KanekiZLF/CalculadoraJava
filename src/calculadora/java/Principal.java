/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.java;

import calculadora.java.layout.JFrTela;

/**
 *
 * @author Vanilson
 */
public class Principal {     
    
    public static void main(String[] args) {
                   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrTela().setVisible(true);
            }
        });
    }
    
}
