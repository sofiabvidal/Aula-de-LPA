
package Encapsulamento_Ex02;
public class FuncionarioCTR {
    FuncionarioDAO FuncionarioDAO = new FuncionarioDAO();
    
    public String imprimir(FuncionarioDTO funcionarioDTO) {
        return FuncionarioDAO.imprimir(funcionarioDTO);
    }
}
