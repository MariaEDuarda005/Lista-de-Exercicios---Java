package Comandos_Repeticao;
import java.util.Scanner;

//  Escreva um algoritmo que leia um número n
//  (número de termos de uma progressão aritmética),
//  a1 ( o primeiro termo da progressão) e r (a razão da progressão)
//  e escreva os n termos desta progressão, bem como a soma dos elementos.

public class Exercicio11 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int num, a1, r, n, soma;

        System.out.println("Informe um número: ");
        n = leia.nextInt();

        System.out.println("Informe o valor de A1: ");
        a1 = leia.nextInt();

        System.out.println("Informe a razão: ");
        r = leia.nextInt();

        // Escrever os n termos da progressão aritmética
        System.out.println("Os " + n + " termos da progressão aritmética são:");
        for (int i = 0; i < n; i++) {
            num = a1 + i * r;
            System.out.print(num + ", ");
        }

        // Calcular a soma dos elementos
        soma = (n * (2 * a1 + (n - 1) * r)) / 2;

        // Exibir a soma
        System.out.println("\nA soma dos " + n + " termos da progressão aritmética é: " + soma);

        leia.close();
    }
}
