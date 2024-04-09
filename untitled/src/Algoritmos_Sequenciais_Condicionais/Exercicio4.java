package Algoritmos_Sequenciais_Condicionais;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        double nota1=0, nota2=0, nota3=0, media=0;

        while(true){
            try {
                System.out.println("Insira o valor da primeira nota: ");
                nota1 = leia.nextDouble();
                System.out.println("Insira o valor da segunda nota: ");
                nota2 = leia.nextDouble();
                System.out.println("Informe o valor da terceira nota: ");
                nota3 = leia.nextDouble();

                if(nota1 >= 0 && nota1 < 10 && nota2 >= 0 && nota2 < 10 && nota3 >= 0 && nota3 < 10){
                    media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4)) / (2+3+4);
                } else {
                    System.out.println("Você inseriu algum número menor que 0 ou maior que 10. Tente novamente!");
                    continue;
                }

            } catch(InputMismatchException e){
                System.out.println("Erro");
                leia.nextLine();
                continue;
            }

            System.out.printf("Suas notas %.2f, %.2f e %.2f têm a média de %.2f\n" ,nota1,nota2,nota3,media);
            break;
        }

    }
}
