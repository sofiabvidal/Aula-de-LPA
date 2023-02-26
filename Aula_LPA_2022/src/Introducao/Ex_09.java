//Data: 22/03/2022
/*
Um trabalhador recebeu o seu salário e o depositou em sua conta corrente bancária.
Esse trabalhador emitiu dois cheques e agora deseja saber seu saldo atual.
Sabe-se que cada operação bancária de retirada paga um imposto de 0.38% e o saldo inicial da conta está zerado.
 */
package Introducao;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ex_09 {
    public static void main(String[] args) {
        double salario, cheque1, cheque2, imposto1, imposto2, resultfinal;
        DecimalFormat decimalformat = new DecimalFormat("#,###.##");
        
        salario = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor do seu salário: "));
        
        cheque1 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor do cheque 1: "));
        
        cheque2 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor do cheque 2: "));
        
        imposto1 = cheque1 * 0.38;
        
        imposto2 = cheque2 * 0.38;
        
        resultfinal = salario - (imposto1 + imposto2);
        
        JOptionPane.showMessageDialog(null, "Seu saldo é de: " + decimalformat.format(resultfinal));
        
    }//fecha main
}//fecha classe

