//Data da aula: 29/03/2022
/*
Faça um programa que receba uma medida em pés.
Faça as conversões a seguir e mostre os resultados.
a) polegadas
b) jardas
c) milhas
Sabe-se que:
1 pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1760 jardas
 */
package Introducao_Ex_12;

import javax.swing.JOptionPane;

public class PrincipalConversao {
    public static void main(String[] args) {
        double pe;
        Conversao conversao = new Conversao ();
        
        pe = Double.parseDouble(
        JOptionPane.showInputDialog("Fale uma medida em pés: "));
        
        JOptionPane.showMessageDialog(null, "As suas medidas são: " + conversao.ConverterMedida(pe));
    }//fecha main
}//fecha classe
