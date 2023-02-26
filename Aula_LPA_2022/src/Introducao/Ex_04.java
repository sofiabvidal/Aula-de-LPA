//Data da Aula: 15/03/2022
/*
Faça um programa que receba o salário de um funcionário e a porcentagem de aumento.
Calcule e mostre o salário final.
 */
package Introducao;

import javax.swing.JOptionPane;
public class Ex_04 {
    
    public static void main(String[] args) {
        double salario, aumento, salfinal;
        
        salario = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o seu salário: "));
        
        aumento = Double.parseDouble(
        JOptionPane.showInputDialog("Digite a porcentagem do seu aumento: "));
        
        salfinal = (salario + (salario * (aumento / 100)));
        
        JOptionPane.showMessageDialog(null, "O seu novo salário é: " + salfinal);
    
    }//fecha main
}//fecha classe
