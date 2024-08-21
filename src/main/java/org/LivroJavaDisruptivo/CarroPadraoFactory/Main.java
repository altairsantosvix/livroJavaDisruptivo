package org.LivroJavaDisruptivo.CarroPadraoFactory;

public class Main {
    public static void main(String[] args) {
        // Criando um carro esportivo
        Carro carroEsportivo = CarroFactory.criarCarro("esportivo", "Ferrari");
        carroEsportivo.acelerar();  // Ferrari está acelerando até a velocidade máxima!

        // Criando um SUV
        Carro suv = CarroFactory.criarCarro("suv", "Range Rover");
        suv.acelerar();  // Range Rover está acelerando em modo off-road!
    }
}
