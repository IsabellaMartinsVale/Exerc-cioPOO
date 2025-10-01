package br.com.exercicio_30set;

public class Passaro extends Animal {
    private double envergaduraAsas;

    public Passaro(String nome, int idade, double envergaduraAsas) {
        super(nome, idade);
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Piu Piu!");
    }

    @Override
    public void mover() {
        System.out.println(nome + " está voando!");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Envergadura: " + envergaduraAsas + "cm");
    }
}
