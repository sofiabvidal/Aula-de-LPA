//Data da Aula: 24/05/2022
/*
Construa um algoritmo que solicite uma letra até que o número 0 (zero) seja
digitado. Ao final o algoritmo deve informar a quantidade de cada vogal digitada
e o número total de consoantes que foram digitadas.
OBS: o número 0 (zero) não pode ser computado.
 */

package WHILE_Ex_02;

import javax.swing.JOptionPane;
public class PrincipalVogal {
    public static void main(String[] args) {
        String letra = "";
        Vogal vogal = new Vogal();
        
        while(!letra.equalsIgnoreCase("0")) {
            letra = JOptionPane.showInputDialog("Informe a letra: ");
            vogal.verificar(letra);
        }
        
        JOptionPane.showMessageDialog(null, vogal.mostra());  
    }
    
}
    




