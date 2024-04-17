package Comandos_Repeticao;

import java.util.Scanner;

// Faça um algoritmo que leia vários números inteiros e calcule o somatório dos números negativos.
// O fim da leitura será indicado pelo número 0.

public class Exercicio20 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int num=0, somaNeg=0, contador=0;

        while (true){
            System.out.println("Valor de N: ");
            num = leia.nextInt();

            if (num == 0){
                break;
            }

            if(num % 2 != 0){
                contador +=1;
                somaNeg += num;
            }

        }

        System.out.println("Quantidade dos números negatvos: " + contador);
        System.out.println("Soma dos números negatvos: " + somaNeg);
    }
}
