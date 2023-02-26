//Data da Aula: 26/04/2022
/*
Exemplo de For, realizar a tabuada do número solicitado.
 */
package FOR_Ex_01;

import javax.swing.JOptionPane;

    public class PrincipalTabuada {
        public static void main(String args[]) {
            Tabuada tabuada = new Tabuada();
            JOptionPane.showMessageDialog(null,
                    tabuada.calcular_Tabuada(Integer.parseInt(
                    JOptionPane.showInputDialog("Informe o número para calcular a tabuada: "))));
       
        }
        
    }
    
