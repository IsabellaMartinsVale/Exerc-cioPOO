package br.com.exercicio_30setp2;

public class Moto extends Veiculo{
    private int cilindradas;
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano,
                int cilindradas, boolean partidaEletrica) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindradas: " + cilindradas + "cc");
        System.out.println("Partida elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }

    public static void empinar() {
        System.out.println("Moto empinando!");
    }
}
