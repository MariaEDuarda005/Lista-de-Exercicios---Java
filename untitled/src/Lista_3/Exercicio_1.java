package Lista_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<Double> Listanumeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double numero = leia.nextDouble();
            Listanumeros.add(numero);
        }

        System.out.println(Listanumeros);
    }
}
