package org.LivroJavaDisruptivo.PadraoAbstractFactory;

import org.LivroJavaDisruptivo.CarroPadraoFactory.Carro;
import org.LivroJavaDisruptivo.CarroPadraoFactory.CarroEsportivo;


public class EsportivoFactory implements CarroFactoryAbstrata {
    @Override
    public Carro criarCarro(String modelo) {
        return new CarroEsportivo(modelo);
    }

    @Override
    public Motor criarMotor() {
        return new MotorEsportivo();
    }

    @Override
    public Roda criarRoda() {
        return new RodaEsportiva();
    }
}

