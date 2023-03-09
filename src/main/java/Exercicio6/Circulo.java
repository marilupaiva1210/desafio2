package Exercicio6;

public class Circulo extends FormasGeometricas{
    private int raio;

    public Circulo(int tamanhoDoRaio) {
        this.raio = tamanhoDoRaio;

    }
    public double calcularArea() {

        return Math.PI * raio * raio;
    }
    public double calcularPerimetro() {

        return 2 * Math.PI * raio;
    }
    public String getNome() {

        return "Círculo";

    }
}
