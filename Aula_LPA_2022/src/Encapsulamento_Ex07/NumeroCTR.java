package Encapsulamento_Ex07;

public class NumeroCTR {
    NumeroDAO numeroDAO = new NumeroDAO();
    public String classificarNumero(NumeroDTO numeroDTO) {
        return numeroDAO.classificarNumero(numeroDTO);
    }
}
    
    

