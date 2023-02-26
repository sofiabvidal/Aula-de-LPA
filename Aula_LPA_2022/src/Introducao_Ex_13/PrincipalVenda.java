//Data da aula: 29/03/2022
/*
O custo ao cosumidor de um carro novo é a soma do preço de fábrica com o 
percentual de lucro do distribuidor e dos impostos ao preço de fábrica. Faça um 
programa que receba o preço de fábrica de um veículo, o percentual de lucro do
distribuidor e o percentual de impostos.
Calcule e mostre:
    a) o valor correspondente ao lucro do distribuidor;
    b) o valor correspondente ao imposto;
    c) o preço final de veículo.
 */
package Introducao_Ex_13;

import javax.swing.JOptionPane;

public class PrincipalVenda {
    public static void main(String[] args) {
        double precoFab, lucro1, imposto1;
        Venda venda = new Venda ();
        
        precoFab = Double.parseDouble(
        JOptionPane.showInputDialog("Fale o preço de fábrica: "));
        
        lucro1 = Double.parseDouble(
        JOptionPane.showInputDialog("Fale o percentual de lucro da fábrica: "));
        
        imposto1 = Double.parseDouble(
        JOptionPane.showInputDialog("Fale o percentual de imposto da fábrica: "));
         
        JOptionPane.showMessageDialog(null, "Seus valores são: " + venda.CalcularPreco(precoFab, lucro1, imposto1));
    }//fecha main
}//fecha classe

