package org.LivroJavaDisruptivo.PadraoAbstractFactory;

public class MotorEsportivo implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor esportivo está ligado!");
    }
}
