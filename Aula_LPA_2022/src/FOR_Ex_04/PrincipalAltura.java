//Data: 10/05/2022
/*
Construir um algoritmo que leia a altura de 20 pessoas. O algoritmo deve
calcular e imprimir quantas pessoas possuem altura maior que 2 metros e a média 
das alturas.
OBS: Deve ser criado um método para fazer os cálculos, um para mostrar a média 
das alturas e outro para mostrar a quantidade de pessoas com mais de 2 metros.
 */

package FOR_Ex_04;

import javax.swing.JOptionPane;

public class PrincipalAltura {
    public static void main(String args[]) {
        Altura altura = new Altura ();
        
        for(int cont = 1; cont <= 20; cont++) {
            altura.computar_Dados(
            Double.parseDouble(
                JOptionPane.showInputDialog("Digite a altura")));
        }
     
        JOptionPane.showMessageDialog(null, "A média das alturas é: " + altura.mostrar_altura_Media()); 
        JOptionPane.showMessageDialog(null,
                "A quantidade de pessoas com mais de 2 metros é: " + altura.mostrar_altura_2metros());
    }
}
