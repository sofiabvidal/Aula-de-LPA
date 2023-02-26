
package Encapsulamento_Ex03;

public class MotoristaCTR {
    MotoristaDAO MotoristaDAO = new MotoristaDAO();
    
    public String imprimir(MotoristaDTO motoristaDTO) {
        return MotoristaDAO.imprimir(motoristaDTO);
    }
}