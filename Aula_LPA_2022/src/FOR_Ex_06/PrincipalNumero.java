//Data da Aula: 17/05/2022
/*
Faça um algoritmo que solicite 10 números inteiros. Ao final o algoritmo deve 
informar o maior e o menor número digitado.
OBS: Deve ser criado um método para verificar os números e outro somente para 
mostrar o resultado.
 */

package FOR_Ex_06;

import javax.swing.JOptionPane;

public class PrincipalNumero {
    public static void main(String args[]) {
        Numero numero = new Numero ();
        
        
        for (int cont = 1; cont <= 10; cont++) {
        numero.computar_Dados(Integer.parseInt(JOptionPane.showInputDialog("Digite um número: ")));
        }
        
        JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + numero.mostra_Numeros());
        JOptionPane.showMessageDialog(null, "O menor número digitado foi: " + numero.mostra_Numeros());
       
    }
}
