package WHILE_Ex_01;

public class Exemplo2 {
    private int soma, numero;
    
    public void somar(int numero) {
        this.numero = numero; 
        this.soma += this.numero;
    }
    
    public int mostra() {
        return this.soma;
    }
    
}
