/*
Faça um programa que receba a altura e o sexo de uma pessoa e que calcule e mostre o seu peso ideal, utilizando as seguintes fórmulas:
- para homens: (72,7*h)-58
- para mulheres: (62.1*h)-44.7.
 */


package Trabalho;

import javax.swing.JOptionPane;
public class Principal_Ex01 {
    public static void main (String args[]){
    Ex01 ex01 = new Ex01();
    String sexo;
    double altura;
    
    sexo = JOptionPane.showInputDialog("Informe o seu sexo: ");
    altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: "));
    JOptionPane.showMessageDialog(null, "O peso ideal é: " + ex01.calcularPeso(sexo, altura));        
    
    }     
}

