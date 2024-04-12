package Comandos_Repeticao;
import java.util.Scanner;
import java.util.InputMismatchException;

//lê um número não determinado de valores para m, todos inteiros e positivos, um de cada vez. Se m for par,
//verificar quantos divisores possui e escrever esta informação. Se m for ímpar e menor do que 10 calcular
//e escrever o fatorial de m. Se m for ímpar e maior ou igual a 10 calcular e escrever a soma dos inteiros de 1 até m.
public class Exercicio18 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int fatorial=1, soma=0;

        while(true){
            try{
                System.out.print("\nInforme o valor de m, ou insira um valor negativo para sair do loop: ");
                int n = leia.nextInt();

                if(n < 0){
                    System.out.println("Saindo do programa.");
                    break;
                }

                if(n % 2 == 0){
                    System.out.println("\nOs números pares e seus divisores: ");
                    for(int i = n; i > 0; i --){
                        if(n%i == 0){
                            System.out.print(i + " - ");
                        }
                    }
                }else{
                    if(n < 10){
                        System.out.println("\nFatorial do numero menor que 10: ");
                        for(int j = 1; j <= n; j ++){
                            fatorial *= j;
                        }
                        System.out.println(fatorial);
                    } else {
                        System.out.println("\nSoma do numero impar maior que 10:");
                        for(int b = 1; b <= n; b++){
                            soma += b;
                        }
                        System.out.println(soma);
                    }
                }

            }catch(InputMismatchException e){
                System.out.println("Erro, você inseriu um caractere invalido.");
                leia.nextLine();
            }
        }
    }
}
