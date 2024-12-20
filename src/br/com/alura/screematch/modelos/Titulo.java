package br.com.alura.screematch.modelos;

import br.com.alura.screematch.excecao.ErroDeConversaoDeAnoExceptio;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private int dataDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) throws ErroDeConversaoDeAnoExceptio {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw  new ErroDeConversaoDeAnoExceptio("Não consegui converter o ano");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

//getter e set//


    public String getNome() {
        return nome;
    }

    public int setAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public int getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(int dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }





    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return  somaDasAvaliacoes / totalDeAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outroTtulo) {
        return  this.getNome().compareTo(outroTtulo.getNome());
    }


    @Override
    public String toString() {
        return "(nome = " + nome + '\'' +
                ", anoDeLancamento =" + anoDeLancamento + "," +
                " duração = " + duracaoEmMinutos + ")";

    }
}


