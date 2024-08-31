package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private Boolean status = false;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
    }

    public boolean isConcluida(){
        return this.status;
    }

    public boolean concluirTarefa(){
        return this.status = true;
    }

    public String alterarPrazo(String prazo){
        return this.prazo = prazo;
    }


    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

}
