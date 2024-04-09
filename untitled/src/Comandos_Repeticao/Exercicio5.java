package Comandos_Repeticao;
import java.util.Scanner;

// Construir um algoritmo que calcule a média aritmética de vários valores inteiros positivos, lidos externamente.
// O final da leitura acontecerá quando for lido um valor negativo.
public class Exercicio5 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int valores, contadorPessoas=0, totalValores=0;

        System.out.println("Digite um número inteiro positivo (ou um valor negativo para encerrar): ");
        valores = leia.nextInt();

        // Enquanto o salário não for negativo, continuar a leitura
        while (valores >= 0) {
            contadorPessoas += 1;

            totalValores += valores;

            System.out.println("Digite um número inteiro positivo (ou um valor negativo para encerrar): ");
            valores = leia.nextInt();

        }

        leia.close();

        int media = totalValores / contadorPessoas;

        System.out.printf("A media dos valores será: %d", media);
    }
}
