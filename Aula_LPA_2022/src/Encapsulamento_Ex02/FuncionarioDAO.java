package Encapsulamento_Ex02;
public class FuncionarioDAO {
    
    public String imprimir(FuncionarioDTO funcionarioDTO){
        return "O código informado foi: " +
                funcionarioDTO.getCodigo()
                + "\n O telefone informado foi: " +
                funcionarioDTO.getTelefone();
    }
}
