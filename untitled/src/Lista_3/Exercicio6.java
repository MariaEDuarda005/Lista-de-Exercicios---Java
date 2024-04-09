package Lista_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);

            int multiplicar, num;

            System.out.println("Insira o numero que sera multiplicado");
            num = leia.nextInt();

            for(int i = 1; i <= 10; i++){
                multiplicar = num * i;
                System.out.printf("%d X %d = %d\n", num, i, multiplicar);
            }

    }
}
