//Data da Aula: 12/04/2022
/* 
Faça um algoritmo que receba três números obrigatoriamente em ordem crescente
(do menor para o maior) e um quarto número (número qualquer) que não siga a 
regra dos três primeiros. 
Ao final o algoritmo deve imprimir os quatro números em
ordem decrescente (do maior para o menor).
Os números devem ser do tipo inteiro.
*/
package IF_Ex_03;

import javax.swing.JOptionPane;
        
public class PrincipalNumeros {
    public static void main(String[] args) {
        
        Crescente crescente = new Crescente ();
        
        JOptionPane.showMessageDialog(null, "A ordem decrescente dos números é: " + crescente.calcular(
                Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Digite o número 3: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Digite o número 4: "))
                ));//Fecha null e media
        
    }//Fecha main
    
}//Fecha classe