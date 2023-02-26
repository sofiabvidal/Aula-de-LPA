package Trabalho;
public class Ex02 {
    private int numero1, numero2, produto, maior, menor, diferenca;
    private double media;
    public String calcularNumero(int numero1, int numero2){
        this.numero1 = numero1;   
        this.numero2 = numero2;
        this.media = (this.numero1 + this.numero2) / 2;
        
    if(this.numero1 > this.numero2) {
        this.maior = this.numero1;
        this.menor = this.numero2;
        this.diferenca = this.numero1 - this.numero2;
        }   
    
    else{
        if(this.numero2 > this.numero1) {
            this.maior = this.numero2;
            this.menor = this.numero1;
            this.diferenca = this.numero2 - this.numero1;
        }                                                   
    }
    
    this.produto = this.numero1 * this.numero2;
    
     return "A média é: " + this.media + "\nA diferença é: " + this.diferenca + "\nO maior número é: " 
             + this.maior + "\nO menor número é: " + this.menor + "\nO produto dos números é: " 
             + this.produto;
  
    }
}

 
