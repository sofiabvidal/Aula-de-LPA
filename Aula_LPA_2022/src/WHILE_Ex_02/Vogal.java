package WHILE_Ex_02;

public class Vogal {
    private String letra, resp;
    private int vogal, consoante;
    
    public void verificar(String letra) {
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("a")) {
           this.vogal++;
        }
        
        else{
            if(this.letra.equalsIgnoreCase("e")) {
             this.vogal++;
            }
             
            else{
                if(this.letra.equalsIgnoreCase("i")) {
                 this.vogal++;          
                }
             
                
              else{
                  if(this.letra.equalsIgnoreCase("o")) {
                   this.vogal++;          
                  }
           
               else{
                   if(this.letra.equalsIgnoreCase("u")) {
                    this.vogal++;          
                   }
                      
                else{
                    if(!this.letra.equalsIgnoreCase("0")) {
                     this.consoante++;          
                    }
                    
                }
            }       
        }
    }
  }
}
    
    public String mostra() {
        this.resp = "O número de vogal A é: " + this.vogal + 
                "\nO número de vogal E é: " + this.vogal +
                "\nO número de vogal I é: " + this.vogal +
                "\nO número de vogal O é: " + this.vogal + 
                "\nO número de vogal U é: " + this.vogal +
                "\nO número de consoantes é: " + this.consoante;
        return this.resp;
    }
    
}
    

