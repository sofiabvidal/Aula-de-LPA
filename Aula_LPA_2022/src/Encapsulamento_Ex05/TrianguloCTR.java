/*
Dados 3 valores ladoA, ladoB, ladoC.
Estes valores representam lados de um triângulo.
Com base nisso verificar:
    a) Se formam um triângulo;
    b) Se formar um triângulo, determine qual: equilátero, isósceles ou escaleno.
OBS1: Deve ser desenvolvido um método para verificar qual é o triângulo.
OBS2: Só pode ser mostrado o tipo do triângulo se os lados informados formarem um.
Caso contrário deve ser mostrado uma mensagem que os lados informados não formam 
um triângulo.
 */

package Encapsulamento_Ex05;

public class TrianguloCTR {
    TrianguloDAO trianguloDAO = new TrianguloDAO();
    public String classificarTriangulo(TrianguloDTO trianguloDTO) {
        return trianguloDAO.classificarTriangulo(trianguloDTO);
    }
}

  
