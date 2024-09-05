package br.com.alura.screenmatch.calculo;

import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;
import br.com.alura.screematch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int  getTempoTotal(){

        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
