package Lista_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome, maiorNome = null;
        double altura, peso, maiorPeso = 0, maiorAltura = 0;

        for(int i = 1; i <= 6; i++){
            try {
                System.out.printf("Insira o nome da %d° pessoa: ", i);
                nome = leia.nextLine();

                System.out.printf("Insira a peso da %d° pessoa: ", i);
                peso = leia.nextDouble();

                System.out.printf("Insira a altura da %d° pessoa: ", i);
                altura = leia.nextDouble();

                if(peso > maiorPeso){
                    maiorPeso = peso;
                    maiorNome = nome;
                }
                if(altura > maiorAltura){
                    maiorAltura = altura;
                    maiorNome = nome;
                }
            }catch (InputMismatchException e){
                System.out.println("Erro.");
            }
            leia.nextLine();
        }


        System.out.println("Pessoa mais alta:");
        System.out.println("Nome: " + maiorNome);
        System.out.println("Altura: " + maiorAltura + " m");

        System.out.println("\nPessoa mais pesada:");
        System.out.println("Nome: " + maiorNome);
        System.out.println("Peso: " + maiorPeso + " kg");

    }
}
