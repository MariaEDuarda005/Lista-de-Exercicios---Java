package Comandos_Repeticao;
import java.util.InputMismatchException;
import java.util.Scanner;

//leia um número não determinado de valores e calcule a média aritmética dos valores
//lidos, a quantidade de valores positivos, a quantidade de valores negativos e o
// percentual de valores negativos e positivos. Mostre os resultados.

public class Exercicio14 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int n, positivo=0, negativo=0, contador=0, porcentagemP, porcentagemN;

        while(true){
            try{
                System.out.println("insira o valor de N ou qualquer letra para " +
                        "sair do programa: ");
                n = leia.nextInt();

                if(n >= 0){
                    positivo += 1;
                } else {
                    negativo += 1;
                }

                contador ++;
//                System.out.println(contador);
            } catch (InputMismatchException e){
                break;
            }
        }

        porcentagemP = (positivo * 100) / contador;
        porcentagemN = (negativo * 100) / contador;

        System.out.println("Resultado:" +
                "Positivos: " + positivo +
                "\nNegativos: " + negativo +
                "\nPorcentagem dos positivos: " + porcentagemP + "%"+
                "\nPorcentagem dos negativos: " + porcentagemN + "%");
    }
}
