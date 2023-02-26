package Encapsulamento_Ex04;

public class SoloDAO {
    private String resposta;
    public String calcular_Solo(SoloDTO soloDTO) {
        if(soloDTO.getAgua() <= 10) {
            this.resposta = "O solo é rochoso";
        }
        else {
            if ((soloDTO.getAgua() > 10) && (soloDTO.getAgua() <= 40)) {
                this.resposta = "O solo é firme";
            }
            else {
                if ((soloDTO.getAgua() > 40) && (soloDTO.getAgua() <= 80)) {
                    this.resposta = "O solo é pantanoso";
                }
                else {
                    this.resposta = "Quantidade de água inválida";
                }
            }
        }
        return this.resposta;
    } 
}
