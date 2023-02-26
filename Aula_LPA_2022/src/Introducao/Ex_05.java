//Data da aula: 15/03/2022
/*
Faça um programa que receba o preço de um produto, calcule e mostre o novo preço, sabendo-se que este sofreu um desconto de 10%.
 */
package Introducao;

import javax.swing.JOptionPane;
public class Ex_05 {
    
    public static void main(String[] args) {
        double preco, desconto, prfinal;
        
        preco = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o preço do produto: "));
        
        desconto = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o desconto do produto: "));
        
        prfinal = (preco - (preco * (desconto / 100)));
        
        JOptionPane.showMessageDialog(null, "O novo preço do produto é: " + prfinal);
    
    }//fecha main
}//fecha classe
