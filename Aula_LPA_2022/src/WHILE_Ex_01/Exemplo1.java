package WHILE_Ex_01;

public class Exemplo1 {
    private String letra;
    private int qtd;
    
    public void verificar(String letra) {
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("x")) {
            this.qtd++;
        }
        
    }
    
    public int mostra() {
        return this.qtd;
    }
    
}
