//Data: 22/03/2022
/*
Faça um programa que calcule e mostre a área de um trapézio. 
Sabe-se que A = ((base maior + base menor) * altura)/2
 */
package Introducao;

import javax.swing.JOptionPane;
public class Ex_07 {
    
    public static void main(String[] args) {
        double basemaior, basemenor, altura, resultfinal;
        
        basemaior = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor da base maior: "));
        
        basemenor = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor da base menor: "));
        
        altura = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor da altura: "));
        
        resultfinal = ((basemaior + basemenor) * altura)/2;
        
        JOptionPane.showMessageDialog(null, "A área é: " + resultfinal);
        
    }//fecha main
}//fecha classe

