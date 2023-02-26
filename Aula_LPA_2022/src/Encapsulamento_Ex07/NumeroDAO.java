package Encapsulamento_Ex07;

public class NumeroDAO {
     private String resposta = "";
   
   public String classificarNumero(NumeroDTO numeroDTO) {
       
       if(numeroDTO.getNum3() <= numeroDTO.getNum2()) {
           this.resposta = "A ordem crescente é: " +
                   numeroDTO.getNum3() + " , " +
                   numeroDTO.getNum2() + " , " +
                   numeroDTO.getNum1();        
       }
       else{
           if((numeroDTO.getNum3() <= numeroDTO.getNum1()) && 
              (numeroDTO.getNum3() > numeroDTO.getNum2())) {
               this.resposta = "A ordem decrescente é: " +
                       numeroDTO.getNum2() + " , " +
                       numeroDTO.getNum3() + " , " + 
                       numeroDTO.getNum1();
           }
       }
       return this.resposta;
    }
}

