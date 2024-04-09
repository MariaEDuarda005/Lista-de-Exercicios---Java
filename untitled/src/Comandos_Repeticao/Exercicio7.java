package Comandos_Repeticao;
import java.util.InputMismatchException;
import java.util.Scanner;

//calcule a média aritmética das 3 notas dos alunos de uma classe. O algoritmo deverá ler,
// além das notas, o código do aluno e deverá ser encerrado quando o código for igual a zero

public class Exercicio7 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        double nota, totalNotas = 0, mediaNotas;
        int codigoAluno = 0;

        do{
            totalNotas = 0; // reiniciar a cada volta

            try {
                System.out.print("Informe o código do aluno (ou digite 0 para encerrar): ");
                codigoAluno = leia.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Você inseriu um caractere inválido!");
                leia.nextLine();
                continue;
            }

            if (codigoAluno == 0)
                break;

            for (int i = 1; i <= 3; i++) {
                try {
                    System.out.printf("Informe a %d° nota: ", i);
                    nota = leia.nextDouble();

                    if(nota > 10 || nota < 0){
                        System.out.println("Insira uma nota entre 0 a 10");
                        i--; // Permite que o usuário insira a nota novamente
                        continue;
                    }

                    totalNotas += nota;

                } catch (InputMismatchException e){
                    System.out.println("Voce inseriu um caractere invalido!");
                    leia.nextLine();
                    i--; // Permite que o usuário insira a nota novamente
                    continue;
                }
            }

            mediaNotas = totalNotas / 3;
            System.out.printf("A media das notas do aluno %d é: %.2f\n", codigoAluno, mediaNotas);

        } while (codigoAluno != 0);
    }
}
