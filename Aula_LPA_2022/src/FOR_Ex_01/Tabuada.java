package FOR_Ex_01;

public class Tabuada {
    private int numero;
    private String imprimir = "";
    public String calcular_Tabuada(int numero) {
        this.numero = numero;
        
        for(int cont = 1; cont <= 10; cont++) {
            this.imprimir = this.imprimir + "\n" 
                    + cont + " X " + 
                    this.numero + " = " + cont * this.numero;
                  
        }
        
        return this.imprimir;
    }
    
}
