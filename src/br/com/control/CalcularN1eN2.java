/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.control;

import javax.swing.JOptionPane;

/**
 *
 * @author Lari
 */
public class CalcularN1eN2 {
    public static void main(String[] args) {
        int n1,n2;
        n1= Integer.valueOf(JOptionPane.showInputDialog("Digite n1 ="));
        n2= Integer.valueOf(JOptionPane.showInputDialog("Digite n2 ="));
        JOptionPane.showMessageDialog(null, "n1 + n2 = "+ (n1+n2));
    }
}
