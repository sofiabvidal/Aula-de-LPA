//Data da aula: 29/03/2022
/*
Faça um programa que receba o salário base de um funcionário.
Calcule e mostre o salário a receber, sabendo que esse funcionário tem 
gratificação de R$50,00 e paga imposto de 10% sobre o salário base.
 */
package Introducao_Ex_11;

import javax.swing.JOptionPane;
public class PrincipalSalario {
    
    public static void main(String[] args) {
        double sal;
        Salario salario = new Salario ();
        
        sal = Double.parseDouble(
        JOptionPane.showInputDialog("Informe o salário do funcionário: "));
        
        JOptionPane.showMessageDialog(null, "O novo salário é: " + salario.calcularSalario(sal));
    }//fecha main
}//fecha classe
