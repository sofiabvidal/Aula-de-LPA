//Data da Aula: 05/04/2022 
/*
Pedro comprou um saco de ração com peso em quilos. 
Pedro possui dois gatos para os quais fornece a quantidade de ração em gramas.
Faça um programa que receba o peso do saco de ração e a quantidade de ração 
fornecida para cada gato.
Calcule e mostre quanto restará de ração em quilos no saco após cinco dias.
 */

package Introducao_Ex_15;

import javax.swing.JOptionPane;

public class PrincipalRacao {
    public static void main(String[] args) {
        double racao1, gato1, gato2;
        Racao racao = new Racao ();
        
        racao1 = Double.parseDouble(
        JOptionPane.showInputDialog("Informe o peso do saco de ração em quilos: "));
        
        gato1 = Double.parseDouble(
        JOptionPane.showInputDialog
        ("Informe a quantidade de ração que você fornece ao primeiro gato em gramas: "));
        
        gato2 = Double.parseDouble(
        JOptionPane.showInputDialog
        ("Informe a quantidade de ração que você fornece ao segundo em gramas: "));
         
        JOptionPane.showMessageDialog(null, "Seus valores são: " + racao.CalcularRacao(gato1, gato2, racao1));
    }//fecha main
}//fecha classe

