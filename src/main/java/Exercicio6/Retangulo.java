package Exercicio6;

public class Retangulo extends FormasGeometricas {
        private int lado;

        public Retangulo(int tamanhoDolado) {
            this.lado = tamanhoDolado;

        }
        public double calcularArea() {

            return this.lado * this.lado;
        }
        public double calcularPerimetro() {

            return this.lado * 4;
        }
        public String getNome() {

            return "Retângulo";

        }
}
