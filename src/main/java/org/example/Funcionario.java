package org.example;

public class Funcionario {
    private String nome;
    private String Cpf;
    private float salario;

    public Funcionario(String nome, String Cpf,  float salario) {
        this.nome = nome;
        this.Cpf = Cpf;
        this.salario = salario;
    }

    public float calcularSalario(){
        return salario;
    }

    public void exibirInformacoes(){
        this.getNome();
        this.getCpf();
        this.getSalario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String CPF) {
        this.Cpf = CPF;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
