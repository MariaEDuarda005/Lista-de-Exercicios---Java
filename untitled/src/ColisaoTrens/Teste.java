package ColisaoTrens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        // para mostrar que se dividir errado da Infinity
        double a,b;
        a=15;
        b=0;
        System.out.println(a/b);

        Scanner leia = new Scanner(System.in);
        double horas, minutos, segundos;
        String horario;
        double posicaoA, posicaoB, velocidadeTremA, velocidadeTremB;
        double tempo, Sa, Sb;
        int escolha;

        while (true){
            try {
                System.out.println("\nEscolha uma opção: \n1- Fazer o cálculo da colisão dos trens \n2- Sair");
                escolha = leia.nextInt();

                switch (escolha) {
                    case 1 -> {
                        System.out.println("Insira a posição do trem A: ");
                        posicaoA = leia.nextDouble();
                        System.out.println("Insira a posição do trem B: ");
                        posicaoB = leia.nextDouble();

                        if ((posicaoA < 0 || posicaoA > 10000) || (posicaoB < 0 || posicaoB > 10000)) {
                            System.out.println("O número deve ser maior ou igual a zero e menor que 10000.");
                            continue;
                        }

                        System.out.println("Insira a velocidade do trem A (em km/h): ");
                        velocidadeTremA = leia.nextDouble();
                        System.out.println("Insira a velocidade do trem B (em km/h): ");
                        velocidadeTremB = leia.nextDouble();
                        velocidadeTremB = - velocidadeTremB;

                        if ((velocidadeTremA <= 0 || velocidadeTremA >= 300)) {
                            System.out.println("A velocidade do trem A sempre será positiva e deve ser ate 300 km/h. " +
                                    "\nPor favor, digite novamente: ");
                            continue;
                        } if ((velocidadeTremB >= 0 || velocidadeTremB <= -300)) {
                            System.out.println("A velocidade do trem B sempre será negativa e deve ser ate - 300 km/h. " +
                                    "\nPor favor, digite novamente:");
                            continue;
                        }

                        tempo = (posicaoA - posicaoB) / (velocidadeTremB - velocidadeTremA);

                        Sa = posicaoA + (velocidadeTremA * tempo);
                        Sb = posicaoB - (velocidadeTremB * tempo);


                        // transformar hora em segundo
                        tempo = tempo * 3600;

                        while (true){

                            horas = 17 + (tempo/3600);
                            // %60 é o resto da divisão por 60
                            minutos = (tempo/60) %60;
                            segundos = tempo %60;

                            if (segundos >= 60){
                                minutos += 1;
                            }
                            if (minutos >= 60){
                                horas += 1;
                            }
                            horario = String.format("%1.0f : %2.0f : %2.0f", horas, minutos, segundos);
                            break;
                        }

                        System.out.printf("Tempo: %.2f segundos\nEquação do trem A: %.2f km\nEquação do trem B: %.2f km\n",
                                tempo, Sa, Sb );

                        if (posicaoA == posicaoB){
                            System.out.println("Os três não vão se colidir");
                        }else {
                            System.out.printf("\nKM %1.0f, %1.0f segundos, %s\n", Sa, tempo, horario);

                            //System.out.printf("Horario: %s", horario);
                        }

                    }
                    case 2 -> System.out.println("Encerrado");

                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Você digitou um caractere inválido. Por favor, digite novamente:");
                leia.nextLine();
            }
        }

    }

}

