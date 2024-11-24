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
public class CalculoIdade 
{//inicio
    
    public static void main(String[] args) {
        int idade;
        idade = Integer.valueOf(JOptionPane.showInputDialog("Digite sua idade e tecle enter:"));
        JOptionPane.showMessageDialog(null,"Idade daqui a 20 anos = " + (idade+20));
    }
}//fim
