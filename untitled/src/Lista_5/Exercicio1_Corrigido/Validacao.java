package Lista_5.Exercicio1_Corrigido;

public class Validacao {

    // atalho alt insert
    EntradaSaida entradaSaida;
    boolean valido = false;

    public Validacao(EntradaSaida entradaSaida) {
        this.entradaSaida = entradaSaida;
    }

    // verificra se é um numero e se esta entre 0 e 10

    private boolean validar(String par){
        try {
            // faz a verificação se o numero que está digitando esta entre 0 e 10
            // depois retorna uma expressão boolean
            double number = Double.parseDouble(par);
            return (number < 0) || number > 10;

        } catch (NumberFormatException numberFormatException){
            return true;
        }
    }

    public void validarTipoMedia(){
        // valueOf - converte string para enum
        try{
            // só set o enum depois que confirma que é valido
            // pega a string e converte para um enum, depois que deu certo set se é aritmetica ou ponderada
            entradaSaida.setTipoMedia(TipoMedia.valueOf(entradaSaida.getTipoMediaString()));
        } catch (IllegalArgumentException e){
            entradaSaida.setTipoMediaString(); // para o usuario digitar de novo
            validarTipoMedia(); // uma função recursiva, ou seja, chama a si mesma até ser resolvida, como um while
        }
    }

    public boolean validarValores(){
        // enquanto os dados forem falsos ele faz a validação
        while (!valido){
            // validando os 4 atributos numericos
            if (validar(entradaSaida.getNota1())){
                System.out.println("Nota 1 foi digitada incorretamente: ");
                entradaSaida.setNota1(); // essa linha já chama o scanner denovo
                continue; // sempre reinicia o laço
            }

            if (validar(entradaSaida.getNota2())){
                System.out.println("Nota 2 foi digitada incorretamente: ");
                entradaSaida.setNota2();
                continue;
            }

            if (validar(entradaSaida.getPeso1())){
                System.out.println("Peso 1 foi digitada incorretamente: ");
                entradaSaida.setPeso1();
                continue;
            }

            if (validar(entradaSaida.getPeso2())){
                System.out.println("Peso 2 foi digitada incorretamente: ");
                entradaSaida.setPeso2();
                continue;
            }
            validarTipoMedia();
            this.valido = true;
        }
        return true;
    }
}
