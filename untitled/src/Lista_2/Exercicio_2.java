package Lista_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double valorProduto = 0, total;
        int quant = 0;

        try {
            System.out.println("Qual o valor do produto que você deseja comprar? ");
            valorProduto = leia.nextDouble();

            if (valorProduto <= 0){
                System.out.println("Você inseriu um número negativo");
                return; // Encerra o programa se o valor for negativo
            }

            System.out.println("Informe quantidade do produto: ");
            quant = leia.nextInt();

            if (quant <= 0){
                System.out.println("Você inseriu um número negativo");
                return; // Encerra o programa se a quantidade for negativa
            }

            if (quant >= 12){
                total = quant * valorProduto;
            } else {
                total = (valorProduto - ((valorProduto *10)/100)) * quant;
            }

            System.out.printf("Dados da sua compra: " +
                    "\nValor unitário: R$ %.2f" +
                    "\nQuantidade de Produto: %d" +
                    "\nTotal da compra: R$ %.2f", valorProduto, quant, total);
        } catch (InputMismatchException e){
            System.out.println("Você inseriu caracteres, por favor tente novamente utilizando números decimais");
        }
    }
}
