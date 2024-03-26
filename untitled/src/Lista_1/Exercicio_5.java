package Lista_1;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int horas, minutos, segundos, horaSegundo, minutoSegundo, totalSegundos;

        System.out.println("Informe um horário, solicitando, separadamente: a quantidade de horas, a quantidade de minutos e a quantidade de segundos.");

        System.out.println("Informe as horas: ");
        horas = leia.nextInt();

        System.out.println("Informe os minutos: ");
        minutos = leia.nextInt();

        System.out.println("Informe os segundos: ");
        segundos = leia.nextInt();

        minutoSegundo = minutos * 60;
        horaSegundo = horas * 60 * 60;

        totalSegundos = horaSegundo + minutoSegundo + segundos;

        System.out.printf("O horário em segundos é " + totalSegundos);

    }
}
