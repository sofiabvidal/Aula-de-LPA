package Introducao_Ex_15;

public class Racao {
    private double resto, racao2, gato3, gato4;
    
    public String CalcularRacao(double gato1, double gato2, double racao1){
        
        this.racao2 = racao1 * 1000;
        this.gato3 = gato1 * 5;
        this.gato4 = gato2 * 5;
        this.resto = (racao2 - (gato3 + gato4)) / 1000;
        
        return "\nA quantidade de comida do primeiro gato é: " + this.gato3 + 
                "\nA quantidade de comida do segundo gato é: " + this.gato4 +
                "\nA quantidade da ração em gramas é: " + this.racao2 +
                "\nO restante no fim de cinco dias é: " + this.resto;
    }//Fecha Método 
}//Fecha classe


