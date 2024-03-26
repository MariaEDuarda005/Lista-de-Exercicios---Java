package Lista_1;

import java.util.Scanner;
import java.util.InputMismatchException;
import static java.lang.Math.pow;

public class Exercicio_2 {
    public static void main(String[] args) {
        double numero1 = 0, numero2 = 0, soma, subtracao, multiplicacao, divisao, elevado, resto;
        int escolha;

        Scanner leia = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Informe o valor do primeiro número: ");
                numero1 = leia.nextDouble();

                System.out.println("Informe o valor do segundo número: ");
                numero2 = leia.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
                // Limpar o buffer do scanner para evitar loops infinitos
                leia.nextLine();
            }

            System.out.println("Você deseja ver: " +
                    "\n1 - Soma dos dois números \n2 - Subtração do primeiro pelo segundo \n3 - Multiplicação dos dois números" +
                    "\n4 - Divisão do primeiro número pelo segundo \n5 - O primeiro número elevado ao segundo número" +
                    "\n6 - O resto da divisão do primeiro número pelo segundo \n7 - Sair");
            escolha = leia.nextInt();

            switch (escolha){
                case 1:
                    soma = numero1 + numero2;
                    System.out.printf("A soma dos números é %.2f%n", soma);
                    break;
                case 2:
                    subtracao = numero1 - numero2;
                    System.out.printf("A subtração do primeiro número com o segundo é %.2f%n", subtracao);
                    break;
                case 3:
                    multiplicacao = numero1 * numero2;
                    System.out.printf("A multiplicação entre os números é %.2f%n", multiplicacao);
                    break;
                case 4:
                    divisao = numero1 / numero2;
                    System.out.printf("A divisão dos números é %.2f%n", divisao);
                    break;
                case 5:
                    elevado = pow(numero1,numero2);
                    System.out.printf("O primeiro número elevado ao segundo número é %.2f%n", elevado);
                    break;
                case 6:
                    resto = numero1 % numero2;
                    System.out.printf("O resto da divisão do primeiro número pelo segundo é %.2f%n", resto);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Opção errada!!");
            }
        }
    }
}
