package Desafio2;

public class BilheteComum extends BilheteUnico {
    double saldo = 0;

    public BilheteComum(Usuario usuario) {
        super(usuario);

    }
    public void recarregarBilhete(Double valor) {

        saldo = saldo + valor;

    }
    public void pagarPassagem() {

        saldo = saldo - 5;

        if (saldo < 5) {

            System.out.println("Sem saldo! Recarregue.");

        } else {

            System.out.println("Liberado!");

    }
}
    public void pesquisarPeloCpf() {

    }


    @Override
    public String toString() {

        String dados = "";

        dados += "Nome do usuário: " + usuario.getNome() + "\n";
        dados += "Número Cpf: " + usuario.getCpf() + "\n";
        dados += "Número telefone: " + usuario.getTelefone() + "\n";
        dados += "Email do usuário: " + usuario.getEmail() + "\n";
        dados += "Código do usuário: " + this.getCodigo() + "\n";
        dados += "Saldo do bilhete: " + this.saldo + "\n";

        return dados;

    }
}