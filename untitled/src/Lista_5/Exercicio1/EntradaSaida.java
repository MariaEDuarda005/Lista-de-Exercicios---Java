package Lista_5.Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaSaida {
    static Scanner leia = new Scanner(System.in);
    static Calculo calculo = new Calculo();
    static Validacao validacao = new Validacao();

    public static List<Double> obterNotas(int quantidade) {
        while (true){
            List<Double> notas = new ArrayList<>();
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Digite a nota " + (i + 1) + ":");
                double nota = leia.nextDouble();

                if(!validacao.validarNota(nota)) {
                    System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
                    continue;
                }
                notas.add(nota);
            }
            return notas;
        }
    }

    public static List<Double> obterPesos(int quantidade) {
        List<Double> pesos = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o peso " + (i + 1) + ":");
            double peso = leia.nextDouble();
            pesos.add(peso);
        }
        return pesos;
    }

    public static Double calcularResultadoAritmetica() {
        List<Double> notas = obterNotas(4);

        // Calcula a média aritmética
        double mediaAritmetica = calculo.mediaAritmetica(notas);


        // Retorna a média aritmetica como resultado
        return mediaAritmetica;
    }

    public static Double calcularResultadoPonderada() {
        List<Double> notas = obterNotas(4);
        List<Double> pesos = obterPesos(4);

        // Calcula a média ponderada
        double mediaPonderada = calculo.mediaPonderada(notas, pesos);

        // Retorna a média ponderada como resultado
        return mediaPonderada;
    }
}


