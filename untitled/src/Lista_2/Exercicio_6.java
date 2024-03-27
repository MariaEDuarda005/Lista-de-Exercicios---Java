package Lista_2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        int min = 1, max = 100, escolha, tentativas = 3;

        Random numerosAleatorios = new Random();
        // int valor = numerosAleatorios.nextInt(100) + 1;
        int valor = numerosAleatorios.nextInt(max - min + 1) + min;

        while (tentativas > 0){
            try {
                System.out.println(valor);
                System.out.println("tente adivinhar o número sorteado de 1 a 100: ");
                escolha = leia.nextInt();

                if(escolha <1 || escolha >100){
                    System.out.println("ERRO: Insira números apenas entre 1 e 100, por favor tente novamente.");
                    continue;
                }
                else if (escolha == valor){
                    System.out.println("Parabéns, você acertou!!");
                    break;
                }
                else{
                    tentativas = tentativas - 1;
                    System.out.printf("Você tem %d tentativas.\n", tentativas);
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Você inseriu um caracteres invalido. Por favor, insira um número inteiro.");
                leia.next();
            }
        }

        if (tentativas == 0){
            System.out.println("Você perdeu, o número era " + valor);
        }
    }
}
