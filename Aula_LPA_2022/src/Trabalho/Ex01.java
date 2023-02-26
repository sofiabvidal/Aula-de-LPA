package Trabalho;
public class Ex01 {
    private double altura, peso;
    private String sexo;
    public double calcularPeso(String sexo, double altura){
        this.altura = altura;   
        this.sexo = sexo;
        
    if(this.sexo.equalsIgnoreCase("Feminino")){
        this.peso = ((62.1*this.altura)-44.7);
        }   
    
    else{
        this.peso = ((72.7*this.altura)-58);                                                      
        }
    
      return this.peso;
      
    }
}
