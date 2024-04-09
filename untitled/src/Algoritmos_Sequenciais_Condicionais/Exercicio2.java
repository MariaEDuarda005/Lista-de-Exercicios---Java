package Algoritmos_Sequenciais_Condicionais;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        int numA, numB, numC, numD, D = 0, R = 0, S = 0;

        Scanner leia = new Scanner(System.in);

        try{
            System.out.println("Insira o valor do número A: ");
            numA = leia.nextInt();
            System.out.println("Insira o valor de número B: ");
            numB = leia.nextInt();
            System.out.println("Insira o valor do número C: ");
            numC = leia.nextInt();
            System.out.println("Insira o valor de número D: ");
            numD = leia.nextInt();

            R = (int) Math.pow((numA + numB), 2);
            S = (int) Math.pow((numC + numD), 2);
            D = (R + S)/2;
        }catch (InputMismatchException e){
            System.out.println("Erro");
        }
        leia.nextLine();


        System.out.println("O valor de R é " + R);
        System.out.println("O valor de S é " + S);
        System.out.println("O valor da expressão D é " + D);
    }
}
