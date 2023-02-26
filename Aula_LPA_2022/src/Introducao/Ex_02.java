//Data da Aula: 15/03/2022
/*
Construa um Programa que receba duas notas e faça sua média.
Mostrando a mesma na tela.
*/

package Introducao;

import javax.swing.JOptionPane;
public class Ex_02 {
    
    public static void main(String[] args) {
        double nota1, nota2, media;
        
        nota1 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite a primeira nota: "));
        nota2 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite a segunda nota: "));
        
        media = (nota1 + nota2) / 2;
        
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }//fecha main
}//fecha classe
