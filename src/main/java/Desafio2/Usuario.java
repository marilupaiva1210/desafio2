package Desafio2;

public class Usuario {

    String nome;
    String cpf;
    String email;
    String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Usuario(String nome, String telefone, String cpf, String email) {

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }
}
