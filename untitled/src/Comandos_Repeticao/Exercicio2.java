package Comandos_Repeticao;
import java.util.InputMismatchException;
import java.util.Scanner;

// Escrever um algoritmo que lê um valor N inteiro e positivo e que calcula e escreve o valor de E.
// E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int N = 0;
        double E = 1; // Inicializar E com 1

        while(true){
            try{
                System.out.println("Digite um valor inteiro e positivo para N:");
                N = leia.nextInt();

                if (N <= 0) {
                    System.out.println("N deve ser um valor inteiro e positivo.");
                    continue;
                }
            } catch (InputMismatchException e){
                System.out.println("Erro. Valor inválido");
                leia.nextLine();
                continue;
            }

            // Calcular E
            for (int i = 1; i <= N; i++) {
                E += 1.0 / fatorial(i);
            }

            System.out.println("O valor de E é: " + E);
            break;
        }
    }

    // Método para calcular o fatorial de um número inteiro
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }
}
