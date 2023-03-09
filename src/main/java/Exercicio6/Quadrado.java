package Exercicio6;

public class Quadrado extends FormasGeometricas {
        private int lado;

        public Quadrado(int tamanhoDoLado) {
            this.lado = tamanhoDoLado;
        }

        public double calcularArea() {

            return this.lado * this.lado;
        }

        public double calcularPerimetro() {

            return this.lado * 4;
        }

        public String getNome() {

            return "Quadrado";
        }
}
