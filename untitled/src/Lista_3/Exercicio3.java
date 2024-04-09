package Lista_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int bom=0,ruim=0,otimo=0, opcao, total, continuar;
        double PorcentoBom, PorcentoRuim, PorcentoOtimo, media;

        while (true){
            System.out.println("Deseja inserir quantas avaliações? ");
            total = leia.nextInt();

            // sem o i <= total o loop será executado exatamente total vezes, conforme o esperado.
            for (int i = 0; i < total; i++){
                try{
                    System.out.printf("\nSua avalição do %d° filme:\n" +
                            "1 - Otimo\n2 - Bom\n3 - Ruim\n", i+1);
                    opcao = leia.nextInt();

                    switch (opcao){
                        case 1: {
                            otimo = otimo + 1;
                            continue;
                        }
                        case 2:{
                            bom = bom + 1;
                            continue;
                        }
                        case 3: {
                            ruim = ruim + 1;
                            continue;
                        }
                        default:{
                            System.out.println("Opção Invalida!");
                            i = i - 1;
                            continue;
                        }
                    }
                } catch (InputMismatchException e){
                    System.out.println("Erro!");
                    i = i - 1;
                }
                leia.nextLine();
            }

            PorcentoOtimo = (otimo * 100.0) / total;
            PorcentoBom = (bom * 100.0) / total;
            PorcentoRuim = (ruim * 100.0) / total;
            //  informar a média de notas do filme
            media = (double) (otimo + (2 * bom) + (3 * ruim)) / total;

            System.out.println("Porcentagem de avaliações:");
            System.out.println("Ótimo: " + PorcentoOtimo + "%");
            System.out.println("Bom: " + PorcentoBom + "%");
            System.out.println("Ruim: " + PorcentoRuim + "%");
            System.out.println("Media: " + media);
            System.out.printf("Número total de avaliações: %d \n", total);

            System.out.println("Deseja continuar?\n1 - Sim\n2 - Não");
            continuar = leia.nextInt();

            if (continuar ==1){
                continue;
            }else{
                System.out.println("saindo");
                break;
            }
        }
    }
}
