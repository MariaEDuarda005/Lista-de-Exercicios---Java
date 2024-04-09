package Comandos_Repeticao;
import java.util.Scanner;

// Escreva um algoritmo que leia o código de um aluno e suas três notas.
// Repita a operação até que o código lido seja negativo.

public class Exercicio10 {
    public static void main(String[] args){
        Scanner leia =  new Scanner(System.in);

        int codigo;
        double nota1, nota2, nota3;

        while(true) {
            System.out.println("Digite o código do aluno (ou um número negativo para sair):");
            codigo = leia.nextInt();

            if (codigo >= 0) {
                System.out.println("Digite as três notas do aluno:");
                nota1 = leia.nextDouble();
                nota2 = leia.nextDouble();
                nota3 = leia.nextDouble();

                double media = ((nota1 * 4) + (nota2 * 3) + (nota3 * 3)) / (4+3+3);

                System.out.println("Código do aluno: " + codigo);
                System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
                System.out.println("Média: " + media);

                if (media >= 5) {
                    System.out.println("APROVADO");
                } else {
                    System.out.println("REPROVADO");
                }
            } else {
                break;
            }
        }

        leia.close();
    }
}
