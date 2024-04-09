package Lista_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        int numero, pares = 0, impares = 0, negativos = 0, positivos = 0;
        int contador = 1, opcaoUsuario;

        Scanner leia = new Scanner(System.in);

        do{

            while (true){
                try {
                    System.out.printf("\nInsira o %d° numero: ", contador);
                    numero = leia.nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("ERRO");
                }
                leia.nextLine();
            }

            if(numero %2 == 0){
                pares = pares +1;

            }
            else{
                impares = impares + 1;
            }

            if(numero < 0){
                negativos = negativos + 1;
            }
            else{
                positivos = positivos + 1;
            }

            contador = contador + 1;

        }while (contador <= 10);



        while (true){
            try {
                System.out.println("\nO que você deseja ver:\n" +
                        "1. Quantos números pares?\n" +
                        "2. Quantos números ímpares?\n" +
                        "3. Quantos negativos?\n" +
                        "4. Quantos positivos?\n" +
                        "5. Sair do programa");
                opcaoUsuario = leia.nextInt();

                switch (opcaoUsuario){
                    case 1: {
                        System.out.printf("\nPares: %d", pares);
                        continue;
                    }
                    case 2: {
                        System.out.printf("\nÍmpares: %d", impares);
                        continue;
                    }
                    case 3: {
                        System.out.printf("\nNegativos: %d", negativos);
                        continue;
                    }
                    case 4: {
                        System.out.printf("\nPositivos: %d", positivos);
                        continue;
                    }
                    case 5:{
                        System.out.print("\nObrigada por usar nosso programa! Até logo =)");
                        System.exit(0);
                    }
                    default:{
                        System.out.println("\nOpção inválida, tente novamente");
                        continue;
                    }
                }
            }catch (InputMismatchException e){
                System.out.println("ERRO");
            }
            leia.nextLine();
        }

    }
}