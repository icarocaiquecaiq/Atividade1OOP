package org.example;

public class FuncionarioMeioPeriodo extends Funcionario {
    private int horasTabalhadas;
    private float valorPorHora;


    public FuncionarioMeioPeriodo(String nome, String Cpf, int horasTabalhadas, float valorPorHora) {
        super(nome, Cpf, 0 );
        this.horasTabalhadas = horasTabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public float calcularSalario() {
        return this.getHorasTabalhadas() * this.getValorPorHora();
    }



    public int getHorasTabalhadas() {
        return horasTabalhadas;
    }

    public void setHorasTabalhadas(int horasTabalhadas) {
        this.horasTabalhadas = horasTabalhadas;
    }

    public float getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
