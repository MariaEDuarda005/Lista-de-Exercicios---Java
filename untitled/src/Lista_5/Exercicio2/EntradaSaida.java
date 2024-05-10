package Lista_5.Exercicio2;

import java.util.Scanner;

public class EntradaSaida {
    Scanner leia = new Scanner(System.in);

    Validacao validacao = new Validacao();

    double salario = 0, horasExtras = 0;

    public Double MostrarResultados(){
        while (true){
            System.out.println("Informe o Valor do seu salario");
            salario = leia.nextDouble();

            if(!validacao.validarSalario(salario)) {
                System.out.println("Salario inválida. A nota deve estar entre 500 e 30000.");
                continue;
            }

            System.out.println("Informe a quantidade de horas extras");
            horasExtras = leia.nextDouble();

            Calculo calculo = new Calculo(salario, horasExtras);

            System.out.println(calculo);

            return calculo.salarioLiquido();
        }
    }
}
