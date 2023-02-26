package EXCECAO_Ex_01;
public class Tabuada {
     private int numero;
    private String resp="";
    public String calcular(int numero) {
        try {
            this.numero = numero;
            for(int cont = 1; cont <=10; cont++) {
                this.resp += this.numero +" x "+cont+" = "+ this.numero * cont +
                        "\n";
            }
            
            return this.resp;
            
        }
        
        catch(Exception e) {
            return this.resp;
            
        }
    }
    
}

