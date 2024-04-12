package Comandos_Repeticao;
import java.util.Scanner;
import java.util.InputMismatchException;

// leia uma quantidade desconhecida de números e conte quantos deles estão nos
// seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de dados
// deve terminar quando for lido um número negativo.

public class Exercicio15 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int numero, de0a25=0, de26a50=0, de51a75=0, de76a100=0;

        while(true){
            try {
                System.out.println("insira um numero positivo ou um numero negativo para sair do programa: ");
                numero = leia.nextInt();

                if(numero >= 0 && numero <= 25){
                    de0a25 += 1;
                } else if (numero >= 26 && numero <= 50) {
                    de26a50 += 1;
                } else if (numero >= 51 && numero <= 75) {
                    de51a75 += 1;
                } else if (numero >= 76 && numero <= 100) {
                    de76a100 += 1;
                }

                if(numero < 0){
                    break;
                }
            } catch(InputMismatchException e){
                System.out.println("Voce inseriu um valor errado");
            }
        }

        int soma = de0a25 + de26a50 + de51a75 + de76a100;

        System.out.printf("Quantidade dos seguintes intervalos:" +
                "\nDe 0 a 25: %d \nDe 26 a 50: %d \nDe 51 a 75: %d" +
                "\nDe 76 a 100: %d \nSoma de todos os valores: %d", de0a25, de26a50, de51a75, de76a100, soma);
    }
}
