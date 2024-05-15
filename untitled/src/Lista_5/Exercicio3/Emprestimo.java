package Lista_5.Exercicio3;

public class Emprestimo {
    double emprestimo;

    public Emprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double totalAPagar(){
        double taxaJuros = this.emprestimo * 0.35;
        return this.emprestimo + taxaJuros;
    }

    public double valorParcelas(){
        return totalAPagar() + this.emprestimo;
    }
}
