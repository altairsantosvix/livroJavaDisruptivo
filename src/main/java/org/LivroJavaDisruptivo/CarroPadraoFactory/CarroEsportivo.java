package org.LivroJavaDisruptivo.CarroPadraoFactory;

public class CarroEsportivo implements Carro {
    private String modelo;

    public CarroEsportivo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println(modelo + " está acelerando até a velocidade máxima!");
    }

    @Override
    public void frear() {
        System.out.println(modelo + " está freando.");
    }
}


