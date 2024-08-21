package org.LivroJavaDisruptivo.PadraoAbstractFactory;


import org.LivroJavaDisruptivo.CarroPadraoFactory.Carro;
import org.LivroJavaDisruptivo.CarroPadraoFactory.SUV;


public class SUVFactory implements CarroFactoryAbstrata {
    @Override
    public Carro criarCarro(String modelo) {
        return new SUV(modelo);
    }

    @Override
    public Motor criarMotor() {
        return new MotorSUV();
    }

    @Override
    public Roda criarRoda() {
        return new RodaSUV();
    }
}
