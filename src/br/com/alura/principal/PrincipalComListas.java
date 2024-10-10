package br.com.alura.principal;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screematch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas  {
    public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão",1970);
    meuFilme.avalia(9);
    Serie lost = new Serie("Lost", 2000);
    meuFilme.avalia(5);
    Filme outroFilme = new Filme("outro-----",1971);
    meuFilme.avalia(3);
    Filme filmeDoFabricio = new Filme("Filme do fabricio",2003);
    meuFilme.avalia(7);


    Filme f1 = filmeDoFabricio;



        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoFabricio);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2 ){
                System.out.println("Classificação " + filme.getClassificacao() );
            }

        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sabdler");
        buscaPorArtista.add("Bob Sabdler");
        buscaPorArtista.add("hoi");
        buscaPorArtista.add("fala");
        System.out.println(buscaPorArtista);



        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenacao");
        System.out.println(buscaPorArtista);

        System.out.println("lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ano de lancamento");
        System.out.println(lista);
    }
}