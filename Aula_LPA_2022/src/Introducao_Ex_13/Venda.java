package Introducao_Ex_13;

public class Venda {
    private double imposto2, precoFim, lucro2;
    
    public String CalcularPreco(double precoFab, double lucro1, double imposto1){
        
        this.lucro2 = (lucro1/100) * precoFab;
        this.imposto2 = (imposto1/100) * precoFab;
        this.precoFim = this.lucro2 + this.imposto2 + precoFab;
        
        return "\nO valor do lucro é: " + this.lucro2 + 
                "\nO valor do imposto é: " + this.imposto2 +
                "\nO preço final do veículo é: " + this.precoFim;
    }//Fecha Método 
}//Fecha classe

