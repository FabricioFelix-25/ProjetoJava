package br.com.alura.screematch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
        private String diretor;


        public Filme(String nome, int anoDeLancamento) {
                this.setNome(nome, anoDeLancamento);
        }


        public String getDiretor() {
                return diretor;
        }
        public void setDiretor(String diretor) {
                this.diretor = diretor;
        }

        @Override
        public int getClassificacao() {
                return (int) pegaMedia() / 2;
        }

        @Override
        public String toString() {
                return "Filme: "+ this.getNome() + "(" + this.getAnoDeLancamento() + ")";
        }




}


