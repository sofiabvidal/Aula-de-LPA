package FOR_Ex_06;

public class Numero {
    private int numero, cont, maior, menor;
    
    public void computar_Dados(int numero, int cont) {
        this.numero = numero;
        this.cont = cont;
        
        if(this.cont == 1){
            this.maior = this.numero;
            this.menor = numero;
        }
        else{
            if(this.numero >= this.maior) {
               this.maior = this.numero;
            }
            
            if(this.numero <= this.menor) {
               this.menor = this.numero;
            }
        }
    }
    
    public String mostra_Numeros() {
        return "O maior número é: " + this.maior + 
                "\nO menor número é: " + this.menor;
    }

    void computar_Dados(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

        
