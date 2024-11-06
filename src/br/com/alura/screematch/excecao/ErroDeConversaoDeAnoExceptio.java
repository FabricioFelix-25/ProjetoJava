package br.com.alura.screematch.excecao;

public class ErroDeConversaoDeAnoExceptio extends Throwable {

    private  String mensagem;
    public ErroDeConversaoDeAnoExceptio(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
