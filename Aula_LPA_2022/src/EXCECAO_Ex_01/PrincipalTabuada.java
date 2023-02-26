//Data da Aula: 31/02/2022
/*
Exemplo Exceção.
*/
package EXCECAO_Ex_01;
import javax.swing.JOptionPane;
public class PrincipalTabuada {
    public static void main(String[] args) {
        try {
            Tabuada tabuada = new Tabuada();
            JOptionPane.showMessageDialog(null, tabuada.calcular(
            Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "))));
        }
        
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Você tentou digitar uma letra onde deveria "
            + "ser somente um número inteiro\n" + e.getMessage());
            System.out.println("Erro: " + e.getMessage());
        }
        
        finally{
            JOptionPane.showMessageDialog(null, "Fim do Sistema");
        }
    }
}
