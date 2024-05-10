package Lista_5.Exercicio1;

import java.util.List;

public class Calculo {

    //  .get - usado para acessar o elemento em uma determinada posição na lista. O método get() recebe um índice
    //  como argumento e retorna o elemento correspondente na lista.

    public static double mediaPonderada(List<Double> notas, List<Double> pesos) {
        double somaNotas = 0;
        double somaPesos = 0;

        // Itera sobre as notas e pesos fornecidos nas listas. Para cada índice i, ele adiciona o valor da nota e o valor do peso às variáveis de soma.
        for (int i = 0; i < notas.size(); i++) {
            somaNotas += (notas.get(i) * pesos.get(i));
            somaPesos += pesos.get(i);
        }

        return somaNotas / somaPesos;
    }

    public static double mediaAritmetica(List<Double> notas) {
        double soma = 0;

        // Itera sobre as notas fornecidas na lista e adiciona cada nota à variável de soma.
        // size - retorna o número de elementos na lista.
        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }

        return soma / notas.size();
    }
}

