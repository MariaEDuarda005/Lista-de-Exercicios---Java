package Lista_2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main (String[] args) {
        Scanner leia = new Scanner(System.in);

        int escolha;
        String pergunta1, pergunta2;
        boolean resposta = true;

        while (resposta){
            System.out.println("Qual pergunta você deseja responder? " +
                    "(1 - Pergunta 1 | 2 - Pergunta 2)");
            escolha = leia.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Pergunta 1:" +
                            "\nQuantos estados existem no Brasil? " +
                            "\nAlternativas:" +
                            "\na)27 estados \nb)26 estados + Distrito Federal \nc)5 estados");
                    pergunta1 = leia.next().toLowerCase();
                    if (pergunta1.equals("b")){
                        System.out.println("Alternatica correta!");
                        resposta = false;
                    } else {
                        System.out.println("Alternativa errada!");
                    }
                    break;

                case 2:
                    System.out.println("Pergunta 2:" +
                            "\nO trecho “Já raiou a liberdade no horizonte do " +
                            "Brasil” foi retirado de qual hino? " +
                            "Alternativas:" +
                            "\na)Hino Nacional \nb)Hino à Bandeira Nacional \nc)Hino da Independência" +
                            "\nQual é a alternativa correta? ");
                    pergunta2 = leia.next().toLowerCase();

                    if (pergunta2.equals("c")){
                        System.out.println("Alternatica correta!");
                        resposta = false;
                    } else {
                        System.out.println("Alternativa errada!");
                    }
                    break;

                default:
                    System.out.println("Essa pergunta não existe.");
            }
        }
    }
}
