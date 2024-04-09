package Lista_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int idade, acima50 = 0, acima160 = 0, abaixo80 = 0, contador=1, opcao;
        double peso, altura;

        Scanner leia = new Scanner(System.in);

        do{
            while (true){
                try {
                    System.out.printf("Insira a idade da %d pessoa: ", contador);
                    idade = leia.nextInt();
                    System.out.printf("Insira o peso da %d pessoa: ", contador);
                    peso = leia.nextDouble();
                    System.out.printf("Insira a altura da %d pessoa: ", contador);
                    altura = leia.nextDouble();

                    break;
                } catch (InputMismatchException e){
                    System.out.println("Erro");
                }
                leia.nextLine();
            }

            if(idade > 50){
                acima50 = acima50 +1;

            }

            if(peso < 80){
                abaixo80 = abaixo80 +1;
            }

            if(altura > 1.60){
                acima160 = acima160 +1;
            }

            contador = contador +1;

        }while (contador <= 10);

        while (true){
            try {
                System.out.println("\nO que você deseja ver:\n" +
                        "1. Quantas tem idade acima de 50 anos\n" +
                        "2. Quantas tem altura acima de 1.60m\n" +
                        "3. Quantas tem peso abaixo de 80kg\n" +
                        "4. Sair do programa");
                opcao = leia.nextInt();

                switch (opcao){
                    case 1: {
                        System.out.printf("\nPessoas com idade acima de 50 anos: %d\n", acima50);
                        continue;
                    }
                    case 2: {
                        System.out.printf("\nPessoas com altura acima de 1.60m: %d\n", acima160);
                        continue;
                    }
                    case 3: {
                        System.out.printf("\nPessoas com peso abaixo de 80kg: %d\n", abaixo80);
                        continue;
                    }
                    case 4:{
                        System.exit(0);
                    }
                    default:{
                        System.out.println("Opção invalida!");
                    }
            }
        }catch (InputMismatchException e){
            System.out.println("Erro!");
        }
            leia.nextLine();
        }
    }
}
