package classes;

public class Casa3 {

    String cor;
    public void pinta(String cor) {

        this.cor = cor;

    }
}
class Teste {
    public static void main(String[] args) {

        boolean aberta = true;

        Porta2 p1 = new Porta2();
        Porta2 p2 = new Porta2();
        Porta2 p3 = new Porta2();
        int contador = 0;

        p1.abre();

        Casa3 c1 = new Casa3();
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
