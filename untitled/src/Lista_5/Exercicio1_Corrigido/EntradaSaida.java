package Lista_5.Exercicio1_Corrigido;

import java.util.Scanner;

public class EntradaSaida {

    private String nota1;
    private String nota2;
    private String peso1;
    private String peso2;
    private String tipoMediaString;
    private TipoMedia tipoMedia;

    private Scanner scanner = new Scanner(System.in);

    public EntradaSaida(){
        setNota1();
        setNota2();
        setPeso1();
        setPeso2();
        setTipoMediaString();
    }

    public void setTipoMediaString(){
        System.out.println("Qual é o tipo da media: Aritmetica ou Ponderada");
        this.tipoMediaString = scanner.nextLine().toUpperCase();
    }

    public  String getTipoMediaString(){
        return tipoMediaString;
    }
    public void setTipoMedia(TipoMedia tipoMedia){
        this.tipoMedia = tipoMedia;
    }

    public void setNota1(){
        // criou dentro do metodo set o construtor, a entrada de dados vai ser via scanner
        // todos os sets vão seguir a mesma linha de pensamento
        System.out.print("Digite a nota 1: ");
        this.nota1 = scanner.nextLine();
    }


    public void setNota2(){
        System.out.print("Digite a nota 2: ");
        this.nota2 = scanner.nextLine();
    }

    public void setPeso1(){
        System.out.print("Digite o peso 1: ");
        this.peso1 = scanner.nextLine();
    }

    public void setPeso2(){
        System.out.print("Digite o peso 2: ");
        this.peso2 = scanner.nextLine();
    }

    // gets

    // não precisa de parametro por que não recebe no codigo
    public String getNota1(){
        return nota1;
    }

    public String getNota2(){
        return nota2;
    }

    public String getPeso1(){
        return peso1;
    }

    public String getPeso2(){
        return peso2;
    }


}
