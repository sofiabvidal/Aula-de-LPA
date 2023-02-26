//Data da Aula: 24/05/2022
/*
Exemplo do comando WHILE.
 */

package WHILE_Ex_01;

import javax.swing.JOptionPane;
public class PrincipalExemplo2 {
    public static void main(String[] args) {
        int numero = 1;
        Exemplo2 exemplo2 = new Exemplo2();
        while(numero <= 10) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            exemplo2.somar(numero);
            numero++;
        }
        
        JOptionPane.showMessageDialog(null, exemplo2.mostra());
    }
    
}
