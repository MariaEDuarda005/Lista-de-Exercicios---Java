package Algoritmos_Sequenciais_Condicionais;

import java.util.Scanner;

// dados de entrada dois pontos quaisquer no plano,
// P(x1,y1) e P(x2,y2), escreva a distância entre eles.

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int x1, y1, x2, y2;

        System.out.println("Inserindo o valor do Ponto A: ");
        System.out.println("Insira o valor de x1: ");
        x1 = leia.nextInt();

        System.out.println("Insira o valor de y1: ");
        y1 = leia.nextInt();

        System.out.println("Insira o valor de x2: ");
        x2 = leia.nextInt();

        System.out.println("Insira o valor de y2: ");
        y2 = leia.nextInt();

        double distancia = calcularDistancia(x1, y1, x2, y2);
        System.out.println("A distancia entre os pontos do plano é " + calcularDistancia(x1,y1,x2,y2));
        // System.out.println("A distancia entre os pontos do plano é " + distancia);
    }

    public static double calcularDistancia(int x1, int y1, int x2, int y2) {
        // Math.sqrt calcula a raiz quadrada
        // Math.pow calcula a potencia
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // outro modo é criando uma variavel
        // double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        // return distancia;

    }
}
