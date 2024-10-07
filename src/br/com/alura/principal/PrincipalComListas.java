package br.com.alura.principal;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screematch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão",1970);
    meuFilme.avalia(9);
    Serie lost = new Serie("Lost", 2000);
    meuFilme.avalia(5);
    Filme outroFilme = new Filme("outro-----",1971);
    meuFilme.avalia(3);
    Filme filmeDoFabricio = new Filme("Filme do fabricio",2003);
    meuFilme.avalia(7);



        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoFabricio);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            Filme filme = (Filme) item;
            System.out.println("Classificação " + filme.getClassificacao() );
        }
    }
}