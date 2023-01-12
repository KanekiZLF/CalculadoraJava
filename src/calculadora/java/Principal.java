/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.java;

import calculadora.java.layout.JFrTela;
import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Vanilson
 */
public class Principal {     
    
    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        /* Create and display the form */
    } catch (UnsupportedLookAndFeelException e) {
}             
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrTela().setVisible(true);
            }
        });
    }
    
}
