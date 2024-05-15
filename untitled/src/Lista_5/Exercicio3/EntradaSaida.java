package Lista_5.Exercicio3;

import java.util.Scanner;

public class EntradaSaida {
    Scanner leia = new Scanner(System.in);
    Validacao validacao = new Validacao();


    public void executar() {
        while (true){
            System.out.println("Informe seu salário atual: ");
            double salario = leia.nextDouble();

            System.out.println("Informe o valor que deseja emprestar: ");
            double valorEmprestimo = leia.nextDouble();

            if (!validacao.validarValorEmprestimo(valorEmprestimo)) {
                System.out.println("Valor do empréstimo inválido. Deve ser entre 0 e 200.000 reais.");
                continue;
            }

            Emprestimo emprestimo = new Emprestimo(valorEmprestimo);
            double valorParcelas = emprestimo.valorParcelas();
            double totalAPagar = emprestimo.totalAPagar();

            if (!validacao.validarParcela(salario, valorParcelas)) {
                System.out.println("Empréstimo não aprovado. A parcela excede 15% do seu salário.");
            } else {
                System.out.println("Empréstimo aprovado!");
                System.out.println("Valor de cada parcela: R$ " + valorParcelas);
                System.out.println("Valor total a pagar: R$ " + totalAPagar);
            }
            break;
        }
    }

}
