package Comandos_Repeticao;
import java.util.Scanner;

// Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano.
// Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.
public class Exercicio4 {
    public static void main(String[] args){
        //Scanner leia = new Scanner(System.in);

        double alturaChico=1.50, alturaZe=1.10;
        int anos=0;

        do{

            alturaZe += 0.03;
            alturaChico += 0.02;

            anos ++;

        }while (alturaZe <= alturaChico);

        System.out.println("Serão necessários " + anos + " anos para que Zé seja maior que Chico." +
                "\n Altura de Zé: " + alturaZe + "\n Altura Chico: " + alturaChico);
    }
}
