package Desafio2;

public class BilheteEstudante extends BilheteUnico {
    int cota = 0;

    public BilheteEstudante(Usuario usuario) {
        super(usuario);

    }
    public void recarregarBilhete() {

        cota = cota + 48;

    }
    public void pagarPassagem() {

        cota = cota - 1;

        if (cota < 1) {

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

        dados+= "Nome do usuário: " + usuario.getNome() + "\n";
        dados+= "Número Cpf: " + usuario.getCpf() + "\n";
        dados+= "Número telefone: " + usuario.getTelefone() + "\n";
        dados+= "Email do usuário: " + usuario.getEmail() + "\n";
        dados += "Código do usuário: " + this.getCodigo() + "\n";
        dados+= "Cota do bilhete: " + this.cota + "\n";

        return dados;

    }
}