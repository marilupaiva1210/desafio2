package Exercicio8;

public class TesteGenealogica {
    public static void main(String[] args) {

        Genealogica genealogica = new Genealogica("Lima");
        Pessoa pessoa = new Pessoa("Maya de Lima");
        Idade idade = new Idade("15");
        Mae mae = new Mae("Fernanda de Lima");
        Pai pai = new Pai("José de Lima");
        Arvore arvore = new Arvore(genealogica, pessoa, idade, pai, mae);


        System.out.println(" -- Árvore Genealógica -- ");

        System.out.println("Nome da familía: " + arvore.genealogica.getFamilia());
        System.out.println("Nome: " + arvore.pessoa.getNome());
        System.out.println("Idade: " + arvore.idade.getIdade());
        System.out.println("Nome da mãe: " + arvore.mae.getNome());
        System.out.println("Nome do pai: " + arvore.pai.getNome());

    }
}
