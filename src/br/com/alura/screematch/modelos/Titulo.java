package br.com.alura.screematch.modelos;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private int dataDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

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



}