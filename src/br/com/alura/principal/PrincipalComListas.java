package br.com.alura.principal;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screematch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
    Filme meuFilme = new Filme("O poderoso chefão",1970);
    Serie lost = new Serie("Lost", 2000);
    Filme outroFilme = new Filme("outro-----",1971);
    Filme filmeDoFabricio = new Filme("Filme do fabricio",2003);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoFabricio);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);



    }
}
