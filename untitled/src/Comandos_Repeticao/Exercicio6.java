package Comandos_Repeticao;

import java.util.Scanner;

// Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos.
public class Exercicio6 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int escolha, candidato1 = 0 , candidato2 = 0, candidato3 = 0, candidato4 = 0, nulo = 0, branco = 0;

        while(true){
            System.out.println("Números dos candidatos para as eleições: \n1 - Cadidato 1 \n2 - Candidato 2" +
                    "\n3 - Candidato 3 \n4 - Candidato 4 \n5 - Nulo \n6 - Branco \n0 - Finalizar");
            System.out.println("Escolha uma das opções: ");
            escolha = leia.nextInt();

            if(escolha == 0) {
                break;
            }

            switch(escolha){
                case 1 ->
                        candidato1 += 1;
                case 2 ->
                        candidato2 += 1;
                case 3 ->
                        candidato3 += 1;
                case 4 ->
                        candidato4 += 1;
                case 5 ->
                        nulo += 1;
                case 6 ->
                        branco += 1;
                default ->
                        System.out.println("Opção errada!");
            }
        }

        leia.close(); // Fecha o Scanner

        // Determinando quem ganhou a eleição
        int maiorVoto = Math.max(candidato1, Math.max(candidato2, Math.max(candidato3, candidato4)));
        String vencedor = "";

        if (maiorVoto == candidato1) {
            vencedor = "Candidato 1";
        } else if (maiorVoto == candidato2) {
            vencedor = "Candidato 2";
        } else if (maiorVoto == candidato3) {
            vencedor = "Candidato 3";
        } else if (maiorVoto == candidato4) {
            vencedor = "Candidato 4";
        }

        System.out.printf("Número de votos de cada Candidato: " +
                "\nCandidato 1: %d" +
                "\nCandidato 2: %d" +
                "\nCandidato 3: %d" +
                "\nCandidato 4: %d" +
                "\nNulo: %d" +
                "\nBranco: %d", candidato1, candidato2, candidato3, candidato4, nulo, branco);

        System.out.print("\nO vencedor das eleições foi: " + vencedor);
    }
}

