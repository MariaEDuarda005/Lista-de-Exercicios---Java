package Comandos_Repeticao;
import java.util.Scanner;

// Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles.

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int quantidade = 5;
        int maior = 0, menor = 1999999999, valor;

        for (int i = 1; i <= quantidade; i++) {
            System.out.printf("Digite o %d° valor: ", i);
            valor = leia.nextInt();

            if(valor > maior){
                maior = valor;
            }

            if(valor < menor){
                menor = valor;
            }
        }

        System.out.println("O maior valor digitado é: " + maior);
        System.out.println("O menor valor digitado é: " + menor);

        leia.close();
    }
}
