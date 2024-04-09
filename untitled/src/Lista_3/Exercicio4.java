package Lista_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero, incremento;

        while (true){
            try {
                System.out.println("Insira o ultimo numero da sequencia: ");
                numero = leia.nextInt();

                System.out.println("Insira o incremento da sequencia: ");
                incremento = leia.nextInt();

                break;
            } catch (InputMismatchException e){
                System.out.println("Eror!");
            }
            leia.nextLine();
        }

        for (int i = 0; i <= numero; i += incremento ){
            System.out.println(i);
        }
    }
}
