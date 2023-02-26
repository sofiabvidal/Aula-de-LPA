
package Encapsulamento_Ex05;


public class TrianguloDAO {
    private boolean verificarTriangulo(TrianguloDTO trianguloDTO) {
        if(((trianguloDTO.getLadoA() + trianguloDTO.getLadoB()) > trianguloDTO.getLadoC()) &&
          ((trianguloDTO.getLadoA() + trianguloDTO.getLadoC()) > trianguloDTO.getLadoB()) &&
          ((trianguloDTO.getLadoB() + trianguloDTO.getLadoC()) > trianguloDTO.getLadoA())){
                return true;
        }
        else{
            return false;
        }
    }
    public String classificarTriangulo(TrianguloDTO trianguloDTO) {
        if(verificarTriangulo(trianguloDTO)){
            if ((trianguloDTO.getLadoA() == trianguloDTO.getLadoB())&&
                    (trianguloDTO.getLadoB() == trianguloDTO.getLadoC())){
                return "O triângulo é Equilátero";
            }
            else{
                if((trianguloDTO.getLadoA() == trianguloDTO.getLadoB()) ||
                    (trianguloDTO.getLadoA() == trianguloDTO.getLadoC()) ||
                    (trianguloDTO.getLadoB() == trianguloDTO.getLadoC ())){
                    return "O triângulo é isósceles";
                }
                else{
                    return "O triângulo é Escaleno";
                }
            }
        }
        else{
            return "Os lados informados não formam um triângulo";
        }
    }
}
