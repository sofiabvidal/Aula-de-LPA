package Introducao_Ex_14;

public class Salario {
    private double salarioFim, imposto, salarioBruto, hora1, salarioMin1, horac;
    
    public String CalcularSalario(double salarioMin, double hora){
        
        this.salarioMin1 = salarioMin;
        this.hora1 = hora; 
        
        horac = this.salarioMin1 / 2;
        salarioBruto = horac * this.hora1;
        imposto = 0.03 * salarioBruto;
        salarioFim = salarioBruto - imposto;
        
        return "\nO valor das horas trabalhadas é: " + horac + 
                "\nO valor do imposto é: " + imposto +
                "\nO valor do salário bruto é: " + salarioBruto +
                "\nO Salário Final é: " + salarioFim;
    }//Fecha Método 
}//Fecha classe

