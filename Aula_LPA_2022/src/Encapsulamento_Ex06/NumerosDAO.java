package Encapsulamento_Ex06;
public class NumerosDAO {
    
   private String resposta = "";
   
   public String classificarNumeros(NumerosDTO numerosDTO) {
       
       if(numerosDTO.getNum4() >= numerosDTO.getNum3()) {
           this.resposta = "A ordem decrescente é: " +
                   numerosDTO.getNum4() + " , " +
                   numerosDTO.getNum3() + " , " +
                   numerosDTO.getNum2() + " , " +
                   numerosDTO.getNum1();        
       }
       else{
           if((numerosDTO.getNum4() >= numerosDTO.getNum2()) && 
              (numerosDTO.getNum4() < numerosDTO.getNum3())) {
               this.resposta = "A ordem decrescente é: " +
                       numerosDTO.getNum3() + " , " +
                       numerosDTO.getNum4() + " , " + 
                       numerosDTO.getNum2() + " , " +
                       numerosDTO.getNum1();
           }
           else{
               if((numerosDTO.getNum4() >= numerosDTO.getNum1()) &&
                  (numerosDTO.getNum4() < numerosDTO.getNum2())) {
                   this.resposta = "A ordem decrescente é: " +
                       numerosDTO.getNum3() + " , " +
                       numerosDTO.getNum2() + " , " + 
                       numerosDTO.getNum1() + " , " +
                       numerosDTO.getNum4();
               }
           }
       }
       return this.resposta;
    }
}
