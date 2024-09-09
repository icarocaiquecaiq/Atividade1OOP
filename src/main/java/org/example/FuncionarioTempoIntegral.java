package org.example;

public class FuncionarioTempoIntegral extends Funcionario{
    private float bonus;

    public FuncionarioTempoIntegral(String nome, String Cpf, float salario, float bonus) {
        super(nome, Cpf, 0 );
        this.bonus = bonus;
        this.setSalario(salario);
    }

    @Override
    public float calcularSalario() {
        return ((this.getBonus() / 100) * this.getSalario()) + this.getSalario();
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
