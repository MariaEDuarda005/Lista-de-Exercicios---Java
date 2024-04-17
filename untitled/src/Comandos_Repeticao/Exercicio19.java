package Comandos_Repeticao;
import java.util.InputMismatchException;
import java.util.Scanner;

// Faça um algoritmo que leia uma quantidade não determinada de números positivos.
// Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral
// dos números lidos. O número que encerrará a leitura será zero.

public class Exercicio19 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int numero=0, contador = 0;
        int pares = 0, impares = 0;
        double somaPares = 0, somaTotal = 0, mediaPar, media;

        while (true){
            try{
                System.out.println("Informe o valor do número, ou 0 para encerrar o programa:");
                numero = leia.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Erro");
            }

            if (numero == 0){
                break;
            }

            if (numero % 2 == 0){
                pares+=1;
                somaPares += numero;
            } else {
                impares+=1;
            }

            contador+=1;
        }

        // não dividir por 0
        if (pares > 0) {
            mediaPar = somaPares / pares;
        } else {
            mediaPar = 0;
        }
        if (contador < 0) {
            media = somaTotal / contador;
        } else {
            media = 0;
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
        System.out.println("Média dos valores pares: " + mediaPar);
        System.out.println("Média geral dos valores: " + media);
    }
}
