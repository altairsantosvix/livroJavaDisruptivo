package org.LivroJavaDisruptivo.PadraoAbstractFactory;
import org.LivroJavaDisruptivo.CarroPadraoFactory.Carro;

public class Main {
    public static void main(String[] args) {
        // Criando uma fábrica de carros esportivos
        CarroFactoryAbstrata esportivoFactory = new EsportivoFactory();
        Carro carroEsportivo = esportivoFactory.criarCarro("Lamborghini");
        Motor motorEsportivo = esportivoFactory.criarMotor();
        Roda rodaEsportiva = esportivoFactory.criarRoda();

        carroEsportivo.acelerar();  // Lamborghini está acelerando até a velocidade máxima!
        motorEsportivo.ligar();     // Motor esportivo está ligado!
        rodaEsportiva.rodar();      // Roda esportiva está girando!

        // Criando uma fábrica de SUVs
        CarroFactoryAbstrata suvFactory = new SUVFactory();
        Carro suv = suvFactory.criarCarro("Land Rover");
        Motor motorSUV = suvFactory.criarMotor();
        Roda rodaSUV = suvFactory.criarRoda();

        suv.acelerar();             // Land Rover está acelerando em modo off-road!
        motorSUV.ligar();           // Motor SUV está ligado!
        rodaSUV.rodar();            // Roda SUV está girando!
    }
}
