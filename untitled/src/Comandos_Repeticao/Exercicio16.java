package Comandos_Repeticao;
import java.util.Scanner;

// lê um conjunto não determinado de valores, um de cada vez, e escreve uma tabela com cabeçalho,
// que deve ser repetido a cada 20 linhas. A tabela conterá o valor lido, seu quadrado, seu cubo e sua raiz quadrada.
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int contadorLinhas = 0;

        while (true) {

            System.out.println("Informe o valor do número (ou digite um número negativo para sair): ");
            int numero = leia.nextInt();

            if (numero < 0) {
                break;
            }

            double quadrado = Math.pow(numero, 2);
            double cubo = Math.pow(numero, 3);
            double raizQuadrada = Math.sqrt(numero);

            System.out.printf("Número: %d, Quadrado: %.2f, Cubo: %.2f, Raiz Quadrada: %.2f\n", numero, quadrado, cubo, raizQuadrada);

            contadorLinhas++;

            // Verifica se o contador atingiu 20 e reinicia o contador e imprime o cabeçalho
            if (contadorLinhas % 20 == 0) {
                System.out.println("\n--- Cabeçalho ---");
                System.out.println("Número | Quadrado | Cubo | Raiz Quadrada");
            }

        }
    }
}