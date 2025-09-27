package br.com.Domain;

public class Estagiario extends Funcionario{

    private int horasTrabalhadas;

    private double valorHoraTrabalhada;



    public Estagiario(String nome,
                      String matricula,
                      double valorHoraTrabalhada) {
        super(nome, matricula, 0.0);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHoraTrabalhada = 0;
    }

    public void registrarHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas += horasTrabalhadas;
    }

@Override
public double calcularSalario() {
    return 0;
}
}