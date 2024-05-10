package Lista_5.Exercicio2;

public class Calculo {
    double salario, horasExtras;

    public Calculo(double salario, double horasExtras) {
        this.salario = salario;
        this.horasExtras = horasExtras;
    }

    double descontoINSS(){
        return salario * 0.20;
    }

    double descontoIRPF(){
        return  salario * 0.10;
    }

    double descontoPlanoSaude(){
        return salario * 0.05;
    }

    double horasExtras(){
        // Calcula o valor da hora normal
        double valorHoraNormal = salario / 160;

        // Calcula o valor da hora extra (hora normal + 50%)
        double valorHoraExtra = valorHoraNormal * 1.5;

        // Calcula o valor total das horas extras
        return valorHoraExtra * horasExtras;
    }

    public double salarioLiquido(){
        return salario - descontoINSS() - descontoIRPF() - descontoPlanoSaude() + horasExtras();
    }

    @Override
    public String toString() {
        return "Salario Bruto: " + salario +
                "\nHoras Extras: " + horasExtras() +
                "\nSalario Líquido: " + salarioLiquido() +
                "\nDescontos de salarios" +
                "\nINSS: " + descontoINSS() +
                "\nIRPF: " + descontoIRPF() +
                "\nPlano de saude: " + descontoPlanoSaude();
    }
}
