//Data da Aula: 19/04/2022
/*
Faça um algoritmo que receba a altura e o peso de uma pessoa.
De acordo com a tabela a seguir verifique e mostre qual a classificação dessa 
pessoa.
(Tabela na foto)
 */
package IF_Ex_04;

import javax.swing.JOptionPane;
        
public class PrincipalClassificacao {
    public static void main(String[] args) {
        double peso, altura;
        classificacao classificacao = new classificacao ();
        
        JOptionPane.showMessageDialog(null, "A classificação da pessoa é: " + classificacao.calcular(
                Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "))
        ));//Fecha null e media
    }//Fecha main
}//Fecha classe

