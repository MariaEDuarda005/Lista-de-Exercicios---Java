package Comandos_Repeticao;
import java.util.Scanner;
import java.util.InputMismatchException;

// lê um número não determinado de pares de valores m,n, todos inteiros e positivos,
// um par de cada vez, e calcula e escreve a soma dos n inteiros consecutivos a partir de m inclusive.
public class Exercicio17 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int soma = 0;

        while (true) {
            try{
                System.out.println("Informe o valor de n: ");
                int n = leia.nextInt();

                if(n < 0){
                    System.out.print("Insira um valor maior de 0");
                    continue;
                }

                System.out.println("Informe o valor de m: ");
                int m = leia.nextInt();

                if(m < 0){
                    System.out.print("Insira um valor maior de 0");
                    continue;
                }

                for (int i = m; i < m + n; i++) {
                    soma += i;
                }

                System.out.println("A soma dos " + n + " inteiros consecutivos a partir de " + m + " é: " + soma);

            }catch(InputMismatchException e){
                System.out.println("Erro, voce inseriu um valor errado.");
                leia.nextLine();
            }
        }
    }
}
