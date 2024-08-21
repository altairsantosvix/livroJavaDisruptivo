package org.LivroJavaDisruptivo.Carro;

public class Suv extends Carro {

    public Suv(String modelo, int velocidadeMaxima) {
        super(modelo, velocidadeMaxima);
    }

    // Método exclusivo do SUV
    public void dirigirOffRoad() {
        System.out.println(modelo + " está dirigindo off-road!");
    }
}
