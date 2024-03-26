package Lista_1;

import java.util.Scanner;
public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        while (true) {
            String nome, sobrenome, dataNascimento, grauInstrucao, cargoPretendido, habilitacao;
            double pretensaoSalarial;
            int escolha;
            System.out.println("Preencha os dados para a vaga na Bosch");

            System.out.println("Informe seu nome: ");
            nome = leia.nextLine();
            System.out.println("Informe seu sobrenome: ");
            sobrenome = leia.nextLine();
            System.out.println("Informe sua data de nascimento: ");
            dataNascimento = leia.nextLine();
            System.out.println("Qual seu grau de instrução? (ensino médio, ensino técnico ou ensino superior) ");
            grauInstrucao = leia.nextLine();
            System.out.println("Qual seu cargo pretendido dentro da empresa? ");
            cargoPretendido = leia.nextLine();
            System.out.println("Possui CNH do tipo B? (Sim ou não)");
            habilitacao = leia.nextLine();
            System.out.println("Qual é sua pretensão salarial? ");
            pretensaoSalarial = leia.nextDouble();

            System.out.printf("Confirme seus dados:\n" +
                    "Nome: %s \nSobrenome: %s \nData de Nascimento: %s \nPretensão Salarial: R$ %.2f \nGrau de Instrução: %s" +
                    "\nCargo Pretendido: %s \nSe possui habilitação do tipo B: %s\n", nome, sobrenome, dataNascimento, pretensaoSalarial, grauInstrucao, cargoPretendido, habilitacao);

            System.out.println("Os dados estão corretos? \n1 - sim\n2 - não  ");
            escolha = leia.nextInt();
            leia.nextLine(); // Consumir a nova linha deixada pelo nextInt()
            if (escolha == 1) {
                System.out.println("Cadastro da vaga realizado!");
                break; // Sai do loop
            } else if (escolha == 2) {
                System.out.println("Por favor, preencha os dados novamente:");
            } else {
                System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
    }
}
