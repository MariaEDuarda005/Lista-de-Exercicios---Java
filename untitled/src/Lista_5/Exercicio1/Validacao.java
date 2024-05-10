package Lista_5.Exercicio1;

public class Validacao {
    public boolean validarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            return true;
        }
        return false;
    }

}
