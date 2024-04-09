package Comandos_Repeticao;
import java.util.InputMismatchException;
import java.util.Scanner;

// Escrever um algoritmo que lê 5 valores para a, um de cada vez, e conta quantos destes valores são negativos, escrevendo esta informação.

public class Exercicio1 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int num, contador=1, negativos=0, positivos=0;

        do{
            try {
                System.out.printf("Insira o %d° número: ", contador);
                num = leia.nextInt();

                if(num >= 0){
                    positivos = positivos + 1;
                }else {
                    negativos = negativos + 1;
                }

                contador += 1;
            }catch(InputMismatchException e){
                System.out.println("Erro. Valor invalido.");
                leia.nextLine();
            }

        }while (contador <= 5);

        System.out.printf("Nessa sequencia tem %d números positivos e %d números negativos\n", positivos, negativos);
    }
}
