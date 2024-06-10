package Lista_5.Exercicio1_Corrigido;

public class Main {
    public static void main(String[] args){
        System.out.println("OI");

        EntradaSaida entradaSaida = new EntradaSaida();
        Validacao validacao = new Validacao(entradaSaida);
        validacao.validarValores();
    }
}
