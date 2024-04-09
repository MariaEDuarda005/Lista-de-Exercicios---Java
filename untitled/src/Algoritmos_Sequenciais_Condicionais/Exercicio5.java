package Algoritmos_Sequenciais_Condicionais;
import java.util.InputMismatchException;
import java.util.Scanner;

// Faça um algoritmo que leia o tempo de duração de um evento em uma fábrica expressa
// em segundos e mostre-o expresso em horas, minutos e segundos.

public class Exercicio5 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int horas, minutos, segundos,total=0, totalH, totalM;

        while(true){
            try{

                System.out.println("Calcular a duração de um evento. Ex (2 horas, 30 minutos e 50 segundos)");
                System.out.println("Informe a quantidade de horas que durou o evento: ");
                horas = leia.nextInt();
                System.out.println("Informe a quantidade de minutos que durou o evento: ");
                minutos = leia.nextInt();
                System.out.println("Informe a quantidade de segundos que durou o evento");
                segundos = leia.nextInt();

                totalH = horas * 3600;
                totalM = minutos * 60;
                total = segundos + totalH + totalM;

            }catch(InputMismatchException e){
                System.out.println("Erro. Valor invalido");
                leia.nextLine();
                continue;
            }

            System.out.printf("No total o evento durou %d segundos\n", total);
            break;
        }

    }
}
