package br.com.exercicio_26set;

public class SistemaRH {

    public static void main(String[] args) {
        // Criando Funcionários - POLOMORFISMO
        Funcionario[] funcionario = new Funcionario[3];

        Desenvolvedor dev = new Desenvolvedor(
                "Ana",
                "DEV001",
                5000,
                50,
                145.00);

        dev.registrarHorasExtras(10);
        funcionario[0] = dev;

        Gerente gerente = new Gerente(
                "Carlos", "GER001", 8000);

        gerente.setBonusPerformance(1000);
        gerente.setComissao(500);
        funcionario[1] = gerente;

        Estagiario estagiario = new Estagiario("Pedro", "EST001", 15.000);
        estagiario.registrarHorasTrabalhadas(35);
        funcionario[2] = estagiario;

        // Processamento folha de pagamento
        System.out.println("=== FOLHA DE PAGEMENTO ===");
        double totalFolha = 0;

        for (Funcionario func : funcionario) {
            func.exibirDados();
            totalFolha += func.calcularSalario();
            System.out.println("---");
        }

        System.out.println("TOTAL DA DOLA: R$" + totalFolha);

        System.out.println("=== DEMONSTRAÇÃO DE POLIMOFISMOS ===");
        for (Funcionario func : funcionario) {
            System.out.println(func.getNome() + " - Salário R$ " + func.calcularSalario());
        }
    }
}
