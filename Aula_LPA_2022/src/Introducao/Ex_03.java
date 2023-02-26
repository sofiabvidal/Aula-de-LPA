//Data da Aula: 15/03/2022
/*
Faça um programa que receba três notas e seus respectivos pesos.
Calcule e mostre a média ponderada dessas notas.
 */
package Introducao;

import javax.swing.JOptionPane;
public class Ex_03 {
    
    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        int peso1, peso2, peso3;
        
        nota1 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite a primeira nota: "));
        peso1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da nota 1: "));;
                
        nota2 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite a segunda nota: "));
        peso2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da nota 2: "));
        
        nota3 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite a terceira nota: "));
        peso3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o peso da nota 3: "));
        
        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    
    }//fecha main
}//fecha classe
