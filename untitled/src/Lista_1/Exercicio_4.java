package Lista_1;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double num, sucessor, antecessor;

        System.out.println("Informe um número: ");
        num = leia.nextDouble();

        sucessor = num + 1;
        antecessor = num - 1;

        System.out.printf("O número informado foi %.1f, o antecessor é %.1f e o sucessor é %.1f", num, antecessor, sucessor);
    }
}
