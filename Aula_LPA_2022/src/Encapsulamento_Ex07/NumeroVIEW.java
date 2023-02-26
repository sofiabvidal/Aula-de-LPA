/*
Faça um algoritmo que receba três números inteiros e mostre em ordem crescente.
 */

package Encapsulamento_Ex07;
import javax.swing.JOptionPane;

public class NumeroVIEW {
     public static void main (String args[]) {
        try{
            NumeroDTO numeroDTO = new NumeroDTO();
            NumeroCTR numeroCTR = new NumeroCTR();
            
            numeroDTO.setNum1(
            Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número 1: ")));
            
            numeroDTO.setNum2(
            Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número 2: ")));
            
            numeroDTO.setNum3(
            Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número 3: ")));
            
            JOptionPane.showMessageDialog(null,
                    numeroCTR.classificarNumero(numeroDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: "+ e.getMessage());
        }
    }
}
    

