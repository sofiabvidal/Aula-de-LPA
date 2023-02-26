 package Encapsulamento_Ex01;
public class ClienteDAO {

    public String mostrarNomeRG(ClienteDTO clienteDTO) {
        return "O nome informado foi: "
                + clienteDTO.getNome() + "\n O RG informado foi: "
                + clienteDTO.getRg();
    }
        
    public String mostrarNomeIdade(ClienteDTO clienteDTO) {
        return "O nome informado foi: "
                + clienteDTO.getNome()
                + "\n a idade informada foi: " + clienteDTO.getIdade(); 
    }
}
