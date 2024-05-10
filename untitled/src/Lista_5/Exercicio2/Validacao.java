package Lista_5.Exercicio2;

public class Validacao {
    public boolean validarSalario(double salario) {
        if (salario >= 500 && salario <= 30000) {
            return true;
        }
        return false;
    }
}
