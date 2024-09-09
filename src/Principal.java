import br.com.alura.screematch.modelos.Episodio;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos( 180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setDataDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());



        Filme outroFilme = new Filme();
        outroFilme.setNome("outro-----");
        outroFilme.setAnoDeLancamento(1970);
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
    }



}