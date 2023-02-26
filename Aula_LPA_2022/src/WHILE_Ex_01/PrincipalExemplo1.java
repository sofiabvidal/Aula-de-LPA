//Data da Aula: 24/05/2022
/*
Exemplo do comando WHILE.
*/

package WHILE_Ex_01;

import javax.swing.JOptionPane;
public class PrincipalExemplo1 {
    public static void main(String[] args) {
        String letra;
        Exemplo1 exemplo1 = new Exemplo1();
        letra = JOptionPane.showInputDialog("Informe a letra: ");
        
        while(letra.equalsIgnoreCase("x")) {
            exemplo1.verificar(letra);
            letra = JOptionPane.showInputDialog("Informe a letra: ");
        }
        
        JOptionPane.showMessageDialog(null, exemplo1.mostra());  
    }
    
}
