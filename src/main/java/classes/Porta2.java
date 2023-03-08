package classes;

import java.util.Scanner;

public class Porta2 {

    boolean aberta = false;

    String cor;
    int dimensaox = 20;
    int dimensaoy = 12;
    int dimensaoz = 37;

    public void abre() {

        aberta = true;

    }
    public void fecha() {

        aberta = false;

    }
    public void pinta(String cor) {

        this.cor = cor;

    }
}
class testePorta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Porta2 p1 = new Porta2();
        p1.pinta("azul");

       if(p1.aberta) {

           System.out.println("A porta está aberta!");

       } else {

           System.out.println("A porta está fechada!");

       }

        System.out.println("A largura da porta é: " + p1.dimensaox);
        System.out.println("A altura da porta é: " + p1.dimensaoy);
        System.out.println("O comprimento da porta é: " + p1.dimensaoz);

        System.out.print("Insira uma nova cor: ");
        String corUsuario = input.nextLine();
        p1.pinta(corUsuario);

        System.out.println("A cor da porta é: " + p1.cor);

    }
}


