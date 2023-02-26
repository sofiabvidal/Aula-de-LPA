/*
Faça um algoritmo que receba três números obrigatoriamente em ordem crescente (do
menor para o maior) e um quarto número (número qualquer) que não siga a regra dos
três primeiros. Ao final o algoritmo deve imprimir os quatro números em ordem 
decrescente (do maior para o menor). Os números devem ser do tipo inteiro.
 */

package Encapsulamento_Ex06;
import javax.swing.JOptionPane;

public class NumerosVIEW {
    public static void main (String args[]) {
        try{
            NumerosDTO numerosDTO = new NumerosDTO();
            NumerosCTR numerosCTR = new NumerosCTR();
            
            numerosDTO.setNum1(
            Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número 1: ")));
            
            numerosDTO.setNum2(
            Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número 2: ")));
            
            numerosDTO.setNum3(
            Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número 3: ")));
            
             numerosDTO.setNum4(
            Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número 4: ")));
            
            JOptionPane.showMessageDialog(null,
                    numerosCTR.classificarNumeros(numerosDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: "+ e.getMessage());
        }
    }
}

