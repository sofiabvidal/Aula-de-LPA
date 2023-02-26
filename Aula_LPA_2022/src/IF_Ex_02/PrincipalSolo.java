//Data da Aula: 12/04/2022
/* Você está fazendo um trabalho de classificação de solo.
Após colher uma amostra e verificar a pontuação de água presente nela,
classificou a amostra em:
    Rochosa: se menos ou igual a 10 pontos de água;
    Firme: se mais de 10 pontos e menos ou igual a 40 pontos;
    Pantanosa: se mais de 40 pontos e menos ou igual a 80 pontos.
Caso seja maior que 80 pontos escrever a mensagem:
    "Quantidade de água inválida".
*/
package IF_Ex_02;

import javax.swing.JOptionPane;
        
public class PrincipalSolo {
    public static void main(String[] args) {
        double amostra;
        solo solo = new solo ();
        
        JOptionPane.showMessageDialog(null, "A classificação da amostra é: " + solo.calcular(
                Double.parseDouble(JOptionPane.showInputDialog("Digite os pontos de água da amostra: "))
        ));//Fecha null e media
    }//Fecha main
}//Fecha classe
