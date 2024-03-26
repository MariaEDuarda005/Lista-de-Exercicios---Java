package Lista_2;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int quantAtual, quantMin, quantMax;

        while (true) {
            System.out.println("Informe a quantidade atual do produto em estoque: ");
            quantAtual = leia.nextInt();

            System.out.println("Informe a quantidade mínima em estoque do produto: ");
            quantMin = leia.nextInt();

            System.out.println("Informe a quantidade máxima em estoque do produto: ");
            quantMax = leia.nextInt();

            if (quantMax < quantMin) {
                System.out.println("A quantidade máxima não pode ser menor que a quantidade mínima.");
            } else {
                break; // Saia do loop se as entradas forem válidas
            }
        }

        double media = (quantMax + quantMin) / 2.0;

        if (quantAtual <= media) {
            System.out.printf("A média é %.1f então efetuar a compra\n", media);
        } else {
            System.out.printf("A média é %.1f então não efetuar a compra\n", media);
        }
    }
}
