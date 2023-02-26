//Data da Aula: 24/05/2022
/*
Exemplo do comando WHILE.
 */

package WHILE_Ex_01;

import javax.swing.JOptionPane;
public class PrincipalExemplo {
    public static void main(String[] args) {
        int numero = 1;
        Exemplo exemplo = new Exemplo();
        while(numero != 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            exemplo.somar(numero);
        }
        
        JOptionPane.showMessageDialog(null, exemplo.mostra());
    }
    
}
