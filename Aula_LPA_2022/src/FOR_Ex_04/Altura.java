package FOR_Ex_04;

public class Altura {
    private int altura_2metros;
    private double altura, altura_soma, altura_media;
    
    public void computar_Dados(double altura) {
        this.altura =  altura;
        this.altura_soma += altura;
        
        if(this.altura_soma > 2){
            //this.altura_2metros = this.altura_2metros + 1;
            //this.altura_2metros += 1;
            this.altura_2metros++;
        }
    }
    
    public double mostrar_altura_Media () {
        //this.altura_media = this.altura_soma/ 20;
        //return this.altura_media;
        return this.altura_soma / 20;
    }
    public int mostrar_altura_2metros() {
        return this.altura_2metros;
    } 
    
}
