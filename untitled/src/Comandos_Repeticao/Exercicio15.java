package Comandos_Repeticao;
import java.util.Scanner;
import java.util.InputMismatchException;

// leia uma quantidade desconhecida de números e conte quantos deles estão nos
// seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de dados
// deve terminar quando for lido um número negativo.

public class Exercicio15 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int numero, de0a25, de26a50, de51a75, de76a100;

        while(true){
            try {
                System.out.println("insira o valor do numero ou qualquer letra para " +
                        "sair do programa: ");
                numero = leia.nextInt();


                
                if(numero < 0){
                    break;
                }
            } catch(InputMismatchException e){
                System.out.pritnln("Voce inseriu um valor errado");
            }
        }
    }
}
