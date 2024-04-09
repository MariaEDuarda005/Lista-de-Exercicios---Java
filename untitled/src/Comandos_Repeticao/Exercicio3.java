package Comandos_Repeticao;

import java.util.Scanner;

// A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e número de filhos.
// A prefeitura deseja saber alguns dados. O final da leitura de dados se dará com a entrada de um salário negativo.
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int salario, numeroFilhos;
        int totalSalario = 0, totalFilhos = 0, contadorPessoas = 0, maiorSalario = 0, contadorSalarioAte100 = 0;

        System.out.print("Digite o salário da pessoa (ou um valor negativo para encerrar): ");
        salario = leia.nextInt();

        // Enquanto o salário não for negativo, continuar a leitura
        while (salario >= 0) {
            // Adicionar o salário ao total e aumentar o contador de pessoas
            totalSalario += salario;
            contadorPessoas += 1;

            System.out.print("Digite o número de filhos da pessoa: ");
            numeroFilhos = leia.nextInt();

            totalFilhos += numeroFilhos;

            // Verificar se o salário é o maior encontrado até agora
            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            // Verificar se o salário é até R$100,00
            if (salario <= 100) {
                contadorSalarioAte100++;
            }

            // Ler o próximo salário
            System.out.print("Digite o salário da próxima pessoa (ou um valor negativo para encerrar): ");
            salario = leia.nextInt();
        }

        leia.close();

        // Calcular média do salário
        double mediaSalario = (double) totalSalario / contadorPessoas;

        // Calcular média do número de filhos
        double mediaFilhos = (double) totalFilhos / contadorPessoas;

        // Exibir os resultados
        System.out.println("a) A média do salário da população é: " + mediaSalario);
        System.out.println("b) A média do número de filhos é: " + mediaFilhos);
        System.out.println("c) O maior salário é: " + maiorSalario);
        double percentualSalarioAte100 = (double) contadorSalarioAte100 / contadorPessoas * 100;
        System.out.println("d) O percentual de pessoas com salário até R$100,00 é: " + percentualSalarioAte100 + "%");
    }
}
