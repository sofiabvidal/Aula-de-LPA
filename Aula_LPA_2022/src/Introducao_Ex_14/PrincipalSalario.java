//Data da Aula: 05/04/2022
/*
 Faça um programa que receba o número de horas trabalhadas e o valor do salário 
mínimo.
Calcule e mostre o salário a receber seguindo as regras abaixo:
    a) a hora trabalhada vale a metade do salário mínimo;
    b) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo 
valor da hora trabalhada;
    c) o imposto equivale a 3% do salário bruto;
    d) o salário a receber equivale ao salário bruto menos o imposto.
 */
package Introducao_Ex_14;

import javax.swing.JOptionPane;

public class PrincipalSalario {
    public static void main(String[] args) {
        double horas, salarioMin;
        Salario salario = new Salario ();
        
        horas = Double.parseDouble(
        JOptionPane.showInputDialog("Fale suas horas trabalhadas: "));
        
        salarioMin = Double.parseDouble(
        JOptionPane.showInputDialog("Fale o valor do salário mínimo: "));
         
        JOptionPane.showMessageDialog(null, "Seus valores são: " + salario.CalcularSalario(horas, salarioMin));
    }//fecha main
}//fecha classe
