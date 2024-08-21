package org.LivroJavaDisruptivo.PadraoAbstractFactory;
import org.LivroJavaDisruptivo.CarroPadraoFactory.Carro;

public interface CarroFactoryAbstrata {
    Carro criarCarro(String modelo);
    Motor criarMotor();
    Roda criarRoda();
}
