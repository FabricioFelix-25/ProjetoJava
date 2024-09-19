import br.com.alura.screematch.modelos.Episodio;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.setDuracaoEmMinutos( 180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());



        Filme outroFilme = new Filme("outro-----",1971);
        outroFilme.setDuracaoEmMinutos( 200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNome("Episodio");
        episodio.setSerie(lost);
        episodio.setTotaVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoFabricio = new Filme("Filme do fabricio",2003);
        filmeDoFabricio.setDuracaoEmMinutos(300);
        filmeDoFabricio.avalia(9);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoFabricio);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("tamanho da lista"+ listaDeFilmes.size());
        System.out.println("primeiro filme, "+ listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);




    }



}