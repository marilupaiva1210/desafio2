package Exercicio8;

public class Pessoa {
    String mae;
    String pai;
    String nome;
    int idade;

    public Pessoa(String nomeDapessoa) {

        this.nome = nomeDapessoa;

    }

        public String getNome () {
            return nome;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public int getIdade () {
            return idade;
        }

        public void setIdade ( int idade){
            this.idade = idade;
        }

        public String getMae () {
            return mae;
        }

        public void setMae (String mae){
            this.mae = mae;
        }

        public String getPai () {
            return pai;
        }

        public void setPai (String pai){
            this.pai = pai;
        }

}


