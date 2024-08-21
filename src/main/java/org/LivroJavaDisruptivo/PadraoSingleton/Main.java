package org.LivroJavaDisruptivo.PadraoSingleton;
import org.LivroJavaDisruptivo.CarroPadraoFactory.Carro;


public class Main {
    public static void main(String[] args) {
        // Obtendo a instância única da CarroFactory
        CarroFactory factory = CarroFactory.getInstancia();

        // Criando um carro esportivo
        Carro carroEsportivo = factory.criarCarro("esportivo", "Ferrari");
        carroEsportivo.acelerar();  // Ferrari está acelerando até a velocidade máxima!

        // Criando um SUV
        Carro suv = factory.criarCarro("suv", "Range Rover");
        suv.acelerar();  // Range Rover está acelerando em modo off-road!

        // Verificando se a fábrica Singleton funciona corretamente
        CarroFactory outraFabrica = CarroFactory.getInstancia();
        System.out.println(factory == outraFabrica);  // Deve imprimir "true"
    }
}
