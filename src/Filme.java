public class Filme {
        static String nome;
        int anoDeLancamento;
        boolean incluidoNoPlano;
        double somaDasAvaliacoes;
        int totalDeAvaliacoes;
        int duracaoEmMinutos;

        void exibeFichaTecnica(){
                System.out.println("Nome do filme: " + nome);
                System.out.println("Ano de lançamento: " + anoDeLancamento);
        }
        void avalia(double nota){
                somaDasAvaliacoes += nota;
                totalDeAvaliacoes++;
        }

        double pegaMedia(){
                return  somaDasAvaliacoes / totalDeAvaliacoes;
        }
    }


