//Data da Aula: 26/04/2022
/*
Segundo Exemplo de FOR, faça um algoritmo que solicite dois números inteiros e 
mostre todos os números do intervalo.
 */

package FOR_Ex_02;

import javax.swing.JOptionPane;

    public class PrincipalEX_FOR_02 {
        public static void main(String args[]) {
            Ex_FOR_02 ex_FOR_02 = new Ex_FOR_02();
            
            JOptionPane.showMessageDialog(null,
                    ex_FOR_02.calcular_Ex_FOR_02
        (Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: ")),
        (Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: ")))));
       
        }
        
    }
