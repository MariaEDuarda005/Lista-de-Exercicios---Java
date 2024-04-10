package Comandos_Repeticao;
import java.util.Scanner;

// NÃO ENTENDI NADA DESSE EXERCICIO
// algoritmo que leia 20 valores para uma variável n e, para cada um deles,
// calcule a tabuada de 1 até n. Mostre a tabuada na forma:
//1 x n = n
//2 x n = 2n
//3 x n = 3n
// ---------
//n x n = n2

public class Exercicio12 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

//        int numero, multiplicar;
//
//        System.out.println("Insira o numero");
//        numero = leia.nextInt();
//
//        for(int i = 0; i <= 10; i ++){
//            multiplicar = i * numero;
//
//            System.out.printf("%d X %d = %d\n", numero,i, multiplicar);
//        }

        int n, mult;
        // Leitura do valor de n
        System.out.print("Digite o valor de n: ");
        n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nTabuada de " + i + ":");
            for (int j = 1; j <= n; j++) {
                mult = i * j;
                System.out.println(i + " x " + j + " = " + mult );
            }
        }
    }
}
