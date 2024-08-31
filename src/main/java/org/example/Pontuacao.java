package org.example;

public class Pontuacao {
    private int pontuacao;

    public int adicionarPontos(int pontuacao) {
        return this.pontuacao += pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int removerPontos(int pontuacao) {
        if (this.pontuacao - pontuacao < 0){
            return pontuacao;
        }else
            return this.pontuacao -= pontuacao;
    }



}
