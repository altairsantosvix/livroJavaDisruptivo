package org.LivroJavaDisruptivo.Carro;

public class CarroEsportivo extends Carro {

    public CarroEsportivo(String modelo, int velocidadeMaxima) {
        super(modelo, velocidadeMaxima); // Chama o construtor da classe Carro
    }

    // Método exclusivo do carro esportivo
    public void ligarTurbo() {
        System.out.println(modelo + " ativou o turbo!");
    }
}
