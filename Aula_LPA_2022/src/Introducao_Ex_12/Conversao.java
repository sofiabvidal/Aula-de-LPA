
package Introducao_Ex_12;

public class Conversao {

private double polegada, jarda, milha, pe;
    
    public String ConverterMedida(double pe){
        this.pe = pe;
        
        this.polegada = this.pe * 12;
        this.jarda = this.pe / 3;
        this.milha = this.jarda / 1760;
        
        return "O número de pés é: " + this.pe + 
                "\nO número de polegadas é: " + this.polegada +
                "\nO número de jardas é: " + this.jarda +
                "\nO número de milhas é: " + this.milha;
    }//Fecha Método 
}//Fecha classe
