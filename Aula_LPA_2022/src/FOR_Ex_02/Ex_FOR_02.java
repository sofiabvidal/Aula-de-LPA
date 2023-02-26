package FOR_Ex_02;

public class Ex_FOR_02 {
    private int numero1, numero2;
    private String resposta = "";
    public String calcular_Ex_FOR_02(int n1, int n2) {
        this.numero1 = n1;
        this.numero2 = n2;
        
        for(int cont = this.numero1; cont <= this.numero2; cont++) {
            this.resposta += cont + " -- " ;
                  
        }
        
        return this.resposta;
    }

}
   
