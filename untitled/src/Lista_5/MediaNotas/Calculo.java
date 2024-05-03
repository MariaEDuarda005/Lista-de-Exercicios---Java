package Lista_5.MediaNotas;

public class Calculo {
    float mediaPonderada;

    float mediaAritmetica;


    public void ResultadoPonderada(float num1,float num2, float peso1, float peso2){
        mediaPonderada = ((num1 * peso1) + (num2 * peso2)) / (peso1 + peso2);
    }

    public void ResultadoAritmetica(float num1,float num2){
        mediaAritmetica = (num1 + num2) / 2;
    }
}
