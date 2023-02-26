package FOR_Ex_05;

public class Salario {
    private int Ano_Atual;
    private double Salario_Atual;
    
    public void Computar_Dados(int Ano_Atual){
        this.Ano_Atual = Ano_Atual;
        
        if (this.Ano_Atual == 1996){
            this.Salario_Atual = 1000 + (1000 * 0.015);
        } else {
            double porcentagem = 0;
            int max = this.Ano_Atual - 1996;
            
            for (int cont = 1; cont <= (max + 1); cont++){
                porcentagem = 1.5 * cont;
            }
            
            this.Salario_Atual = 1000 + (1000 * (porcentagem/100));
        }
    }
    
    public double Salario_Atual(){
        return this.Salario_Atual;
    }
}
