//Data da Aula: 26/04/2022
/*
Faça um algoritmo que receba 10 números inteiros e ao final mostre a soma dos 
mesmos. 
OBS: Deve ser criado um método para somar os números e outro para mostrar o
resultado.
 */
package FOR_Ex_03;

import javax.swing.JOptionPane;

    public class PrincipalSoma {
        public static void main(String args[]) {
            
            Soma soma = new Soma();
            for(int cont = 1; cont <= 10; cont ++) {
                soma.calcular_Soma (
                Integer.parseInt(
                JOptionPane.showInputDialog("Informe um número: ")));
            }
            
            JOptionPane.showMessageDialog(null,
                    "A Soma dos números é: " + soma.mostra_Soma ());
            
       
        }
        
    }
    