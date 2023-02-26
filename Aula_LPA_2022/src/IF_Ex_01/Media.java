package IF_Ex_01;

public class Media {
    private double nota1, nota2, mediaf;
    private String resposta;
    public String calcular(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.mediaf = (this.nota1 + this.nota2) / 2;
        
        if(this.mediaf >= 6) {
            this.resposta = "Aprovado";
        }//Fecha if
        
        else {
            if((this.mediaf >= 4) && (this.mediaf < 6)) {
                this.resposta = "Recuperação";
            }//Fecha if
            
            else {
                this.resposta = "Reprovado";
            }//Fecha else
            
        }//Fecha else
        
        return this.resposta;
        
    }//Fecha método
    
}//Fecha classe
