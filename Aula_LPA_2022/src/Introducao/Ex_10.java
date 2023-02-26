//Data da aula: 22/03/2022
/*
Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, 
calcule e mostre:
a) A idade dessa pessoa em anos;
b) A idade dessa pessoa em meses;
c) A idade dessa pessoa em dias;
d) A idade dessa pessoa em semanas.
 */
package Introducao;

import javax.swing.JOptionPane;

public class Ex_10 {
    public static void main(String[] args) {
        int anoNasc, anoAtual, idadeAnos, idadeDias, idadeMeses, idadeSemanas;
        
        anoNasc = Integer.parseInt(
        JOptionPane.showInputDialog("Digite o ano que você nasceu: "));
        
        anoAtual = Integer.parseInt(
        JOptionPane.showInputDialog("Digite o ano que você está: "));
        
        idadeAnos = anoAtual - anoNasc;
        
        idadeDias = anoNasc * 365;
        
        idadeMeses = anoNasc * 12;
        
        idadeSemanas = anoNasc * 7;
        
        JOptionPane.showMessageDialog(null, "A idade em anos é: " + idadeAnos + "\nA idade em meses é: " + idadeMeses + "\nA idade em dias é: " + idadeDias + "\nA idade em semanas é: " + idadeSemanas);
    }//fecha main
}//fecha classe
