package Lista_1;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valorCompra, valorRepresentante, valorImpostos, total;

        System.out.println("Informe do valor da compra: ");
        valorCompra = leia.nextDouble();

        valorRepresentante = valorCompra * 0.20;
        valorImpostos = valorCompra * 0.30;

        total = valorCompra + valorRepresentante + valorImpostos;

        System.out.print(valorRepresentante);
        System.out.print(valorImpostos);
        System.out.print(total);
    }
}
