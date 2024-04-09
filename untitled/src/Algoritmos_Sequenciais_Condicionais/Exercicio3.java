package Algoritmos_Sequenciais_Condicionais;

import java.util.InputMismatchException;
import java.util.Scanner;

//3. Faça um algoritmo que leia a idade de uma pessoa expressa em
// anos, meses e dias e mostre-a expressa apenas em dias.
//4. Faça um algoritmo que leia a idade de uma pessoa expressa em dias
// e mostre-a expressa em anos, meses e dias.

public class Exercicio3 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int dia,mes,ano, total=0, totalMes=0, totalDia=0, totalAno=0;
        int escolha;

        while(true){
            System.out.println("Escolha uma alternativa:" +
                    "\n1 - Sua idade expressa em anos, meses e dias e mostre-a expressa apenas em dias." +
                    "\n2 - Sua idade expressa em dias e mostre-a expressa em anos, meses e dias.");
            escolha = leia.nextInt();
            switch (escolha){
                case 1:{

                    try{
                        System.out.println("Insira sua idade em anos, meses e dias (Ex: 18 anos, 2 meses e 20 dias) ");
                        System.out.println("Ano:  ");
                        ano = leia.nextInt();
                        System.out.println("Meses: ");
                        mes = leia.nextInt();
                        System.out.println("Dia: ");
                        dia = leia.nextInt();

                        totalAno = ano * 365;
                        totalMes = mes * 30;
                        total = totalAno + totalMes + dia;

                    } catch (InputMismatchException e){
                        System.out.println("Erro");
                        leia.nextLine();
                    }

                    System.out.println("Sua idade em dias é: " + total);
                }
                case 2:{
                    try{
                        System.out.println("Insira sua idade em dias (Ex: 180 dias) ");
                        System.out.println("Dia: ");
                        dia = leia.nextInt();


                        totalAno = dia / 365;
                        totalMes = (dia % 365) / 30;
                        totalDia = (dia % 365) % 30;

                    } catch (InputMismatchException e){
                        System.out.println("Erro");
                    }

                    System.out.println(totalAno + " anos, " + totalMes + " meses e " + totalDia + " dias");
                }
            }
        }


    }
}

