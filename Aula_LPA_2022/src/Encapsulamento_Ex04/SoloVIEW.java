package Encapsulamento_Ex04;
import javax.swing.JOptionPane;

public class SoloVIEW {
    public static void main (String args[]) {
        try{
            SoloDTO soloDTO = new SoloDTO();
            SoloCTR soloCTR = new SoloCTR();
            
            soloDTO.setAgua(
            Integer.parseInt(
                    JOptionPane.showInputDialog("Informe a quantidade de água no solo: ")));
            
            JOptionPane.showMessageDialog(null,
                    soloCTR.calcular_Solo(soloDTO));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Erro no sistema: "+ e.getMessage());
        }
    }
}
    
