package Exercicio6;

public class Triangulo extends FormasGeometricas {

        private int lado;

        public Triangulo(int tamanhoDolado) {
            this.lado = tamanhoDolado;

        }

        public double calcularArea() {

            return this.lado * this.lado / 2;
        }

        public double calcularPerimetro() {

            return this.lado * 3;
        }

        public String getNome() {

            return "Triângulo";
        }
}
