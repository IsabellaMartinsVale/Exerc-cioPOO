package br.com.exercicio_30set;

public class Gato extends Animal {
    private boolean temPeloLongo;

    public Gato(String nome, int idade, boolean temPeloLongo) {
        super(nome, idade);
        this.temPeloLongo = temPeloLongo;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Pelo longo: " + (temPeloLongo ? "Sim" : "Não"));
    }
}

