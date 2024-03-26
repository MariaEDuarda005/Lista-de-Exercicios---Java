package Lista_1;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double nota1, nota2, mediaPonderada;

        System.out.println("Informe a primeira nota: ");
        nota1 = leia.nextDouble();

        System.out.println("Informe a segunda nota: ");
        nota2 = leia.nextDouble();

        //  nota + peso / soma dos pesos
        mediaPonderada = ((nota1 * 0.4) + (nota2 * 0.6)) / (0.4 + 0.6);

        System.out.println("A média ponderada das notas é: " + mediaPonderada);
    }
}
