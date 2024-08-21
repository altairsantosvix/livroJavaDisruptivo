package org.LivroJavaDisruptivo.PadraoAbstractFactory;

public class MotorSUV implements Motor {
    @Override
    public void ligar() {
        System.out.println("Motor SUV está ligado!");
    }
}