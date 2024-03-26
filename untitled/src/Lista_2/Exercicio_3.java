package Lista_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int golsTimeA, golsTimeB;
        boolean continuar = true;

        while (continuar) {
            try {
                while (true) {
                    System.out.println("Quantidade de gols do time A");
                    golsTimeA = leia.nextInt();

                    if (golsTimeA < 0) {
                        System.out.println("Você inseriu um número negativo. Por favor, insira um número positivo.");
                    } else {
                        break;
                    }
                }

                while (true) {
                    System.out.println("Quantidade de gols do time B");
                    golsTimeB = leia.nextInt();

                    if (golsTimeB < 0) {
                        System.out.println("Você inseriu um número negativo. Por favor, insira um número positivo.");
                    } else {
                        break;
                    }
                }

                if (golsTimeA > golsTimeB) {
                    System.out.println("O vencedor foi o time A");
                } else if (golsTimeA < golsTimeB) {
                    System.out.println("O vencedor foi o time B");
                } else {
                    System.out.println("Houve um empate");
                }

                System.out.println("Deseja tentar novamente? (1 - sim | 2 - não)");
                int deseja = leia.nextInt();

                if (deseja == 2) {
                    continuar = false;
                }

            } catch (InputMismatchException e) {
                System.out.println("ERRO: Você inseriu caracteres ou um número double. Por favor, insira um número inteiro.");
                leia.next();
            }
        }
    }
}
