package classes;

public class Pessoa1 {
    private String nome;
    private int idade;

    public Pessoa1(String nomeDaPessoa) {

        this.nome = nomeDaPessoa;
 hashCode();
    }

    public void FazAniversario() {

        int novaIdade = this.idade + 1;
        this.idade = novaIdade;

    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome = nome;

    }
    public int getIdade() {
        return idade;

    }
    public void setIdade(int idade) {
        this.idade = idade;

    }

    public static void main(String[] args) {

        Pessoa1 p1 = new Pessoa1("Otávio Dias");
        p1.setIdade(18);

        // fazer aniversário do Otávio
        p1.FazAniversario();  //19
        p1.FazAniversario();  //20
        p1.FazAniversario();  //21

        System.out.println("Nome da pessoa: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());

    }
}
