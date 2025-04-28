package Candidatura;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MARCIA","MARCOS","IVI","SKOL","FLOKI"};

        //FOR TRADICIONAL
        System.out.println("imprimindo a lista de candidatos e informando seus indices");
        for(int indice=0; (indice)< candidatos.length;indice++) {
//                                                      PARA COMEÇAR COM 1 E N 0
            System.out.println("o candidato de nº" + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("forma abreviada(for each)");
        for(String candidato: candidatos) {
            System.out.println("o candidato selecionado foi " + candidato );
        }
    }



    static void SelecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","MARCOS","IVI","SKOL","FLOKI","LUIZA","GABRIEL","PEDRO","MARIA"};


        int candidatosSelecionados =0;
        int candidatosAtual=0;
        double salarioBase=2000.00;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato " + candidato + " solicitou o valor de salario  " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("o candidato " + candidato + " foi escolhido");
                candidatosSelecionados++;
            }
            candidatosAtual++;
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