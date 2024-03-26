package Lista_2;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int destino, refeicao;
        double valorBase = 3000.00, calculo;

        System.out.println("----- ESCOLHA DAS FERIAS -----");

        System.out.println("Qual será seu destino: " +
                "\n1 - Maceió \n2 - Porto de Galinhas");
        destino = leia.nextInt();

        switch (destino) {
            case 1:
                System.out.println("Gostaria de almoço e janta incluso? (1 - sim | 2 - não)");
                refeicao = leia.nextInt();

                if (refeicao == 1) {
                    calculo = valorBase * 2;
                } else if (refeicao == 2) {
                    calculo = valorBase * 0.85;
                } else {
                    System.out.println("Opção inválida.");
                    return;
                }
                break;
            case 2:
                System.out.println("Gostaria de almoço e janta incluso? (1 - sim | 2 - não)");
                refeicao = leia.nextInt();

                if (refeicao == 1) {
                    calculo = valorBase * 0.60;
                } else if (refeicao == 2) {
                    calculo = valorBase * 0.45;
                } else {
                    System.out.println("Opção inválida.");
                    return;
                }
                break;
            default:
                System.out.println("Destino não encontrado.");
                return;
        }

        System.out.println("Dados da viagem:" +
                "\nDestino: " + (destino == 1 ? "Maceió" : "Porto de Galinhas") +
                "\nRefeições inclusas: " + (refeicao == 1 ? "Sim" : "Não") +
                "\nValor total: R$ " + calculo);
    }
}
