package Exercicio3;

import Exercicio2.Porta;

public class Casa {

    String cor;
    public void pinta(String cor) {

        this.cor = cor;

    }
}
class Teste {
    public static void main(String[] args) {

        boolean aberta = true;

        Porta p1 = new Porta();
        Porta p2 = new Porta();
        Porta p3 = new Porta();
        int contador = 0;

        p1.abre();

        Casa c1 = new Casa();
        c1.pinta("laranja");

        if (p1.aberta) {
            contador++;

        } if (p2.aberta) {
            contador++;

        } if (p3.aberta) {
            contador++;
        }

        System.out.println("Portas abertas na casa: " + contador);
        System.out.println("A cor da casa é: " + c1.cor);

    }
}

