package org.LivroJavaDisruptivo.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Carro {
    String modelo;
    int velocidadeMaxima;

    public Carro(String modelo, int velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // Sobrecarga do método acelerar
    public void acelerar() {
        System.out.println(modelo + " está acelerando até " + velocidadeMaxima + " km/h!");
    }

    // Acelerando até uma velocidade específica
    public void acelerar(int velocidade) {
        if (velocidade > velocidadeMaxima) {
            System.out.println("Este Carro não pode passar de " + velocidadeMaxima + " km/h!");
        } else {
            System.out.println(modelo + " está acelerando até " + velocidade + " km/h.");
        }
    }

    // Frear
    public void frear() {
        System.out.println(modelo + " está freando.");
    }
}
