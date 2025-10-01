package br.com.exercicio_30setp2;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Ford", "Fiesta", 2020, 4, true),
                new Moto("Honda", "CG 160", 2021, 160, true),
                new Carro("Volkswagen", "Golf", 2019, 4, true)
        };

        for (Veiculo veiculo : frota) {
            veiculo.exibirInfo();
            veiculo.acelerar(60);

            if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                carro.abrirPortaMalas();
            }

            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                moto.empinar();
            }

            System.out.println("---");
        }
    }
}
