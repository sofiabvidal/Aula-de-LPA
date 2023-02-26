package IF_Ex_02;

public class solo {
    private double amostra;
    private String resposta;
    public String calcular(double amostra) {
        this.amostra = amostra;
        
        if(this.amostra <= 10) {
            this.resposta = "Rochosa";
        }//Fecha if
        
        else {
            if((this.amostra > 10) && (this.amostra <= 40)) {
                this.resposta = "Firme";
            }//Fecha if
            
            else {
                if((this.amostra > 40) && (this.amostra <= 80)) {
                 this.resposta = "Pantanosa";
                }//Fecha if
                
                else {
                   this.resposta = "Quantidade de água inválida"; 
                }//Fecha else
                
            }//Fecha else
            
        }//Fecha else
        
        return this.resposta;
        
    }//Fecha método
    
}//Fecha classe
