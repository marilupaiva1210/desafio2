package Desafio2;

import java.util.Random;

public abstract class BilheteUnico {
    String codigo;
    Usuario usuario;

    public String getCodigo() {
        return codigo;
    }

    public BilheteUnico(Usuario usuario) {

        this.codigo = this.gerador();
        this.usuario = usuario;

    }

    public String gerador() {
        int bilhete;
        Random codigo = new Random();

        bilhete = (int) (codigo.nextDouble() * 10000);

        return String.valueOf(bilhete);

    }

    public void recarregarBilhete(Double valor) {
    }
    public void pagarPassagem() {
    }
    public void pesquisarPeloCpf() {
    }
}


