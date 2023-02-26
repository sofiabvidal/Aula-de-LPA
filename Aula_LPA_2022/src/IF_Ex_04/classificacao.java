package IF_Ex_04;

public class classificacao {
    private double peso, altura;
    private String resposta;
    public String calcular(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        
        if((this.altura <= 1.20) && (this.peso < 60)) {
            this.resposta = "A";
        }//Fecha if
        
        else {
            if((this.altura <= 1.20) && (this.peso <= 90)) {
                this.resposta = "D";
            }//Fecha if
            
            else {
                if((this.altura <= 1.20) && (this.peso > 90)) {
                    this.resposta = "G";
                }//Fecha if
            
                else {
                    if((this.altura < 1.70) && (this.peso < 60)) {
                        this.resposta = "B";
                    }//Fecha if
                
                    else {
                        if((this.altura < 1.70) && (this.peso <= 90)) {
                            this.resposta = "E";  
                        }//Fecha if
                            
                        else {
                            if((this.altura < 1.70) && (this.peso <= 90)){
                                this.resposta = "H";
                            }//Fecha if
                
                            else {
                                if((this.altura > 1.70) && (this.peso < 60)) {
                                   this.resposta = "C";
                                }//Fecha if
                                
                                else {
                                    if((this.altura > 1.70) && (this.peso <= 90)) {
                                        this.resposta = "F"; 
                                    }//Fecha if
                
                                    else {
                                        if((this.altura > 1.70) && (this.peso > 90)) {
                                           this.resposta = "I";
                                    }//Fecha if
                
                                }//Fecha else
                
                            }//Fecha else
                
                        }//Fecha else
                
                    }//Fecha else
                
                }//Fecha else
                
            }//Fecha else
            
        }//Fecha else
                   
    }//Fecha else
        
return this.resposta;
    
}//Fecha método
    
}//Fecha classe
