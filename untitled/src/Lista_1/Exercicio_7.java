package Lista_1;

import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        int mes, carrosVendidos, totalVendas;
        double salarioFixo = 1500.00, comissaoPorCarro = 350.00, total;

        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();

        System.out.println("Qual mês você quer consultar? " +
                "1 - Janeiro\n2 - Fevereiro\n3 - Março\n4 - Abril \n5 - Maio" +
                "\n6 - Junho\n7 - Julho\n8 - Agosto\n9 - Setembro\n10 - Outubro" +
                "\n11 - Novembro \n12 - Dezembro");
        mes = leia.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Informe o número do mês (1 a 12): ");
            mes = leia.nextInt();
        }

        System.out.println("Número de carros vendidos por você: ");
        carrosVendidos = leia.nextInt();
        while (carrosVendidos < 0) {
            System.out.println("Por favor, informe um número válido de carros vendidos: ");
            carrosVendidos = leia.nextInt();
        }

        System.out.println("O valor total das vendas desse mês: ");
        totalVendas = leia.nextInt();
        while (totalVendas < 0) {
            System.out.println("Por favor, informe um valor total de vendas válido: ");
            totalVendas = leia.nextInt();
        }

        total = salarioFixo + (comissaoPorCarro * carrosVendidos) + (totalVendas * 0.001);

        System.out.println("Vendedor: " + nome);
        System.out.println("Mês: " + mes);
        System.out.println("Carros vendidos: " + carrosVendidos);
        System.out.println("Valor total das vendas: R$" + totalVendas);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Salário total: R$" + total);

    }
}
