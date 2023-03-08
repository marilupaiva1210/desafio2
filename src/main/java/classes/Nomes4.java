package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nomes4 {
    public static void main(String[] args) {
        String nome = "ABC";

        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Ale");
        listaDeNomes.add("Ca");
        listaDeNomes.add("Bia");
        listaDeNomes.add(nome);

        System.out.println(listaDeNomes);
        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);

    }
}