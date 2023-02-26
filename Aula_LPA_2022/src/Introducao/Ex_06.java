//Data: 22/03/2022
/*
Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas.
Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas, calcule e mostre a comissão e o salário final do funcionário.
 */
package Introducao;

import javax.swing.JOptionPane;
public class Ex_06 {
    
    public static void main(String[] args) {
        double salfixo, comissao, salfinal;
        
        salfixo = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o seu salário: "));
        
        comissao = Double.parseDouble(
        JOptionPane.showInputDialog("Digite sua comissao: "));
        
        salfinal = (salfixo + (salfixo * (comissao / 100)));
        
        JOptionPane.showMessageDialog(null, "O seu salário é: " + salfinal);
    
    }//fecha main
}//fecha classe
    
