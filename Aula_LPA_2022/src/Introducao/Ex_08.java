//Data: 22/03/2022
/*
Faça um programa que receba o valor do salário mínimo e o valor do salário de um
funcionário, calcule e mostre a quantidade de salários mínimos que ganha esse 
funcionário.
 */
package Introducao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ex_08 {
    public static void main(String[] args) {
        double salmin, salfunc, resultfinal;
        DecimalFormat decimalformat = new DecimalFormat("#,###.##");
        
        salmin = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor do salário mínimo: "));
        
        salfunc = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor que você ganha: "));
        
        resultfinal = salfunc / salmin;
        
        JOptionPane.showMessageDialog(null, "A quantidade de salários mínimos é: " + decimalformat.format(resultfinal));
        
    }//fecha main
}//fecha classe

