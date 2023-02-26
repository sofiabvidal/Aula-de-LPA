//Data da aula: 15/03/2022
package Introducao;

import javax.swing.JOptionPane;

public class Ex_01 {
    public static void main(String[] arga) {
        String nome;
        int idade;
        
        nome = JOptionPane.showInputDialog("Informe seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome + "\nSua idade é: " + idade);
    }//Fecha Método   
}//Fecha Classe
