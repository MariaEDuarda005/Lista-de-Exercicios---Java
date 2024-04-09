package Lista_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double saldo, saldoPositivo = 0, saldoNegativo = 0;
        int contador = 1, escolha;

        while (true) {
            try {
                System.out.printf("Insira o saldo da %dª pessoa: ", contador);
                saldo = leia.nextDouble();

                if (saldo > 0) {
                    saldoPositivo++;
                } else {
                    saldoNegativo++;
                }
                contador++;

            } catch (InputMismatchException e) {
                System.out.println("Erro! Entrada inválida.");
                leia.nextLine(); // Limpa o buffer de entrada
                continue; // Continua para a próxima iteração do loop
            }

            System.out.println("Deseja continuar adicionando saldos?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            escolha = leia.nextInt();

            if (escolha != 1) {
                break;
            }
        }

        // Calcula a porcentagem de pessoas com saldo positivo
        double porcentagemPositivo = (saldoPositivo / (saldoPositivo + saldoNegativo)) * 100;

        if (porcentagemPositivo >= 50) {
            System.out.println("Nenhum risco!");
        } else {
            System.out.println("Risco ao banco!");
        }
    }
}
