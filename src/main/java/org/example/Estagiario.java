package org.example;

public class Estagiario extends Funcionario{
    private String instituicaoEnsino;
    private float bolsaAuxilio;

    public Estagiario(String nome, String Cpf, String instituicaoEnsino, int bolsaAuxilio) {
        super(nome, Cpf, 0 );
        this.setInstituicaoEnsino(instituicaoEnsino);
        this.setBolsaAuxilio(bolsaAuxilio);
}

    @Override
    public float calcularSalario() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(int bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }
}
