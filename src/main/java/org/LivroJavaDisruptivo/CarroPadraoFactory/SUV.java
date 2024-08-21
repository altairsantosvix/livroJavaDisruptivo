package org.LivroJavaDisruptivo.CarroPadraoFactory;

public class SUV implements Carro {
    private String modelo;

    public SUV(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " está acelerando em modo off-road!");
    }

    @Override
    public void frear() {
        System.out.println(modelo + " está freando.");
    }
}