package Comandos_Repeticao;
import java.util.InputMismatchException;
import java.util.Scanner;

// Escreva um algoritmo que calcule a média dos números digitados pelo usuário,
// se eles forem pares. Termine a leitura se o usuário digitar zero (0).

public class Exercicio8 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int num, numTotal=0 ,contador=0;
        double media;

        while(true){
            try{
                System.out.println("Informe o valor do número: ");
                num = leia.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Inseriu um caractere invalido!");
                leia.nextLine();
                continue;
            }

            if(num == 0){
                break;
            }

            if(num % 2 == 0){
                numTotal += num;

                contador ++;
            }
        }

        media = (double) numTotal / contador;

        System.out.println("A média dos números inseridos é: " + media);
    }
}
