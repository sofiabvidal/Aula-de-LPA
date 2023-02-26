/*
 */
package Introducao_Ex_11;

public class Salario {
    private double sal, sal_f, desc;
    
    public double calcularSalario(double sal){
        this.sal = sal;
        
        this.desc = this.sal * 0.10;
        this.sal_f = this.sal + 50 - desc;
        
        return this.sal_f;
    }//Fecha Método calcularSalario
}//Fecha classe
