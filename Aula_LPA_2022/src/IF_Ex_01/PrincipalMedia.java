//Data da Aula: 12/04/2022
package IF_Ex_01;

import javax.swing.JOptionPane;

public class PrincipalMedia {
    public static void main(String[] args) {
        double nota1, nota2, mediaf;
        Media media = new Media ();
        
        JOptionPane.showMessageDialog(null, "A situação do aluno é: " + media.calcular(
                Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "))
        ));//Fecha null e media
    }//Fecha main
}//Fecha classe