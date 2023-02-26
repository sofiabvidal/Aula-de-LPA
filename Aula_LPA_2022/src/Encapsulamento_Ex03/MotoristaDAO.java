
package Encapsulamento_Ex03;

public class MotoristaDAO {
    private String resposta;
    public String imprimir(MotoristaDTO motoristaDTO) {
        if(motoristaDTO.getIdade() >= 18) {
            this.resposta = "Pode tirar habilitação.";
        }
        else {
            if ((motoristaDTO.getIdade() < 18)) {
                this.resposta = "Não pode tirar habilitação.";
            }
        }
        return this.resposta;
    } 
}
