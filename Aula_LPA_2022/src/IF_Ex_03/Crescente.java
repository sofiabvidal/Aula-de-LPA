package IF_Ex_03;

public class Crescente {
    private int numero1, numero2, numero3, numero4;
    public String calcular(int numero1, int numero2, int numero3, int numero4) {
        
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.numero4 = numero4;
        
        int ordem = 0;
        String resposta;
        
        if (this.numero1 > this.numero2) {
            ordem = this.numero2;
            this.numero1 = this.numero2;
            this.numero2 = ordem;          
        }//Fecha if
        
        if (this.numero2 > this.numero3) {
            ordem = this.numero3;
            this.numero2 = this.numero3;
            this.numero3 =  ordem;
        }//Fecha if
        
        if (this.numero1 > this.numero2) {
            ordem = this.numero1;
            this.numero1 = this.numero2;
            this.numero2 = ordem;
        }//Fecha if
        
        resposta = "Ordem decrescente: " + this.numero4 +" "+ this.numero3 + " " + this.numero2 + " " + this.numero1;
        return resposta;
        
    }//Fecha método
    
}//Fecha classe
        
       
