package br.com.exercicio_26set;

public class Desenvolvedor extends Funcionario {


    private int horasExtra;
    private Double valorHoraExtra;
    private Double valoresSalarioExtra;

    public Desenvolvedor(String nome,
                         String matricula,
                         double salarioBase,
                         int horasExtra,
                         double valoresHorasExtras) {
        super(nome, matricula, salarioBase);
        this.horasExtra = horasExtra;
        this.valoresSalarioExtra = valoresHorasExtras;

    }
    public void registrarHorasExtras(int horas) {
        this.horasExtra = horas + horasExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (valorHoraExtra * horasExtra);
    }
}