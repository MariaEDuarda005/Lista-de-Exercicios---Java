package Lista_5.Exercicio3;

public class Validacao {
    public boolean validarValorEmprestimo(double emprestimo) {
        if (emprestimo >= 0 && emprestimo <= 200000){
            return true;
        }
        return false;
    }

    public boolean validarParcela(double salario, double valorParcela) {
        if (valorParcela <= 0.15 * salario){
            return true;
        }
        return false;
    }

}
