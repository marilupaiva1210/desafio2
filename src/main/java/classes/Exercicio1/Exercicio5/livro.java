package classes.Exercicio1.Exercicio5;

public class livro {
    String livro;
    String autor;

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public livro(String nomeDoLivro, String nomeDoAutor) {

        this.livro = nomeDoLivro;
        this.autor = nomeDoAutor;

    }
}
class Pessoa {
    String nome;
    String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa(String nomeDaPessoa, String cpfDaPessoa) {

        this.nome = nomeDaPessoa;
        this.cpf = cpfDaPessoa;

    }
}
class Emprestimo {

        livro Livro;
        Pessoa pessoa;

    public Emprestimo(livro livro, Pessoa pessoa) {

        this.pessoa = pessoa;
        this.Livro = livro;

    }
}
class emprestimoDoLivro {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Maria", "189.827.233-11");
        livro livro = new livro("Bridgerton", "Julie");
        Emprestimo emprestimo = new Emprestimo(livro, pessoa);

        System.out.println("-- Informações do livro --");

        System.out.println("Nome do livro: " + emprestimo.Livro.getLivro());
        System.out.println("Autor do livro: " + emprestimo.Livro.getAutor());

        System.out.println("-- Informações de empréstimo --");

        System.out.println("Nome da pessoa: " + emprestimo.pessoa.getNome());
        System.out.println("Número de CPF: " + emprestimo.pessoa.getCpf());


        }
    }
