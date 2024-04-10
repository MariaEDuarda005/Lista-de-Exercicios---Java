package Comandos_Repeticao;
import java.util.Scanner;

// leia um número n que indica quantos valores devem ser lidos a seguir. Para cada número
// lido, mostre uma tabela contendo o valor lido e o fatorial deste valor.

public class Exercicio13 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int num,fatorial,n;

        System.out.println("Insira o número de valores a serem lidos: ");
        num = leia.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Insira o valor do número que será fatorado: ");
            n = leia.nextInt();
            fatorial = 1;

            for (int j = 1; j <= n; j++) {
                fatorial *= j;
            }

            System.out.println("Valor: " + n + ", Fatorial: " + fatorial);
        }
    }
}
