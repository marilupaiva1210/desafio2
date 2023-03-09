package Exercicio8;

public class Arvore {

    Genealogica genealogica;
    Pessoa pessoa;
    Idade idade;
    Mae mae;
    Pai pai;

    public Arvore(Genealogica genealogica, Pessoa pessoa, Idade idade, Pai pai, Mae mae) {

        this.genealogica = genealogica;
        this.pessoa = pessoa;
        this.idade = idade;
        this.mae = mae;
        this.pai = pai;
    }

}
