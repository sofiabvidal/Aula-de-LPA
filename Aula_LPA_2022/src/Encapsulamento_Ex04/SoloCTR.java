package Encapsulamento_Ex04;

public class SoloCTR {
    SoloDAO soloDAO = new SoloDAO();
    public String calcular_Solo(SoloDTO soloDTO) {
        return soloDAO.calcular_Solo(soloDTO);
    }
}
