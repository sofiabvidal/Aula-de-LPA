package Encapsulamento_Ex06;
public class NumerosCTR {
    NumerosDAO numerosDAO = new NumerosDAO();
    public String classificarNumeros(NumerosDTO numerosDTO) {
        return numerosDAO.classificarNumeros(numerosDTO);
    }
}
    
