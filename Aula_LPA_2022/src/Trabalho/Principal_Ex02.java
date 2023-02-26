/*
Faça um programa que receba dois números e execute as operações listadas a seguir.
a) Média entre os dois números;
b) Diferença do maior pelo menor;
c) O produto entre os dois números.
 */

package Trabalho;
        
import javax.swing.JOptionPane;        
public class Principal_Ex02 {
    public static void main (String args[]){
    Ex02 ex02 = new Ex02();
    int numero1, numero2;
    
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
    JOptionPane.showMessageDialog(null, ex02.calcularNumero(numero1, numero2));        
    
    }     
}

