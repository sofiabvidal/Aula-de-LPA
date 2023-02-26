package Encapsulamento_Ex01;
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String  mostrarNomeRg(ClienteDTO clienteDTO) {
        return clienteDAO.mostrarNomeIdade(clienteDTO);
    }
    
    public String mostrarNomeIdade (ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeIdade(clienteDTO);
    }
}
