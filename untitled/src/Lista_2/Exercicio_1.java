package Lista_2;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade;
        String nome;

        System.out.print("Informe seu nome: ");
        nome = leia.nextLine();

        System.out.printf("%s informe sua idade: ", nome);
        idade = leia.nextInt();

        if (idade >= 0 && idade <= 14){
            System.out.println("Você é considerado 'Criança'");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Você é considerado 'Adolescente'");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Você é considerado 'Adulto jovem'");
        } else {
            System.out.println("Você é considerado 'Adulto'");
        }
    }
}
