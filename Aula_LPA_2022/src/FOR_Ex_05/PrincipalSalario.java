//Data da Aula: 10/05/2022
/*
Um funcionário de uma empresa recebe aumento salarial anualmente. Sabe-se que:
A) Esse funcionário foi contratado em 1995, com salário inicial de 1.000,00;
B) Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
C) A partir de 1997 (inclusive), os aumentos salariais sempre corresponderam ao
dobro do percentual do ano anterior.
Faça um programa que solicite o ano atual e determine o salário atual desse
funcionário.
 */
package FOR_Ex_05;

import javax.swing.JOptionPane;

public class PrincipalSalario {
    public static void main(String args[]) {
        int numero;
        Salario salario = new Salario ();
        
        salario.Computar_Dados(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: ")));
        
        
        JOptionPane.showMessageDialog(null, "O salário atual deste funcionário é: " + salario.Salario_Atual()); 
    }
}
