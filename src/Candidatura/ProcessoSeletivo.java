package Candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {

    }

    static void SelecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","MARCOS","IVI","SKOL","FLOKI","LUIZA","GABRIEL","PEDRO","MARIA"};


        int candidatosSelecionados =0;
        int candidatosAtual=0;
        double salarioBase=2000.00;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato " + candidato + " solicitou o valor de salario  " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("o candidato " + candidato + "foi escolhido");
                candidatosSelecionados++;
            }
        }
    // sdadsadsad
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }



    //criar um metodo
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR AGORA");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("ligar com contra");
        } else {
            System.out.println("aguardar");
        }

    }
}