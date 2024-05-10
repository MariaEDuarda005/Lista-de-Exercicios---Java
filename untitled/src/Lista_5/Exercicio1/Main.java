package Lista_5.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Gostaria de fazer: \n1 - Media Ponderada \n2 - Media Aritmetica");
        int escolha = leia.nextInt();

        if(escolha == 1){
            var mediaPonderada = EntradaSaida.calcularResultadoPonderada();
            System.out.println(mediaPonderada);
            Resultado.mostrarResultado(mediaPonderada);
        } else if (escolha == 2) {
            var mediaAritmetica = EntradaSaida.calcularResultadoAritmetica();
            System.out.println(mediaAritmetica);
            Resultado.mostrarResultado(mediaAritmetica);
        } else {
            System.out.println("Opção invalida");
        }


    }
}
