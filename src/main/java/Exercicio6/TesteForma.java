package Exercicio6;

import java.util.ArrayList;
import java.util.List;

public class TesteForma {
    public static void main(String[] args) {

        System.out.println(" --- Informações das Formas --- ");
        List<FormasGeometricas> minhasFormas = new ArrayList<>();

        Quadrado q1 = new Quadrado(6);
        minhasFormas.add(q1);

        Triangulo t1 = new Triangulo(4);
        minhasFormas.add(t1);

        Retangulo r1 = new Retangulo(7);
        minhasFormas.add(r1);

        Circulo c1 = new Circulo(3);
        minhasFormas.add(c1);

        minhasFormas.forEach(forma -> {
            System.out.println("Forma: " + forma.getNome());
            System.out.println("Área:" + forma.calcularArea());
            System.out.println("Perímetro:" + forma.calcularPerimetro());

        });
    }
}