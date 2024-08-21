package org.LivroJavaDisruptivo.CarroPadraoFactory;

public class CarroFactory {

    public static Carro criarCarro(String tipo, String modelo) {
        if (tipo.equalsIgnoreCase("esportivo")) {
            return new CarroEsportivo(modelo);
        } else if (tipo.equalsIgnoreCase("suv")) {
            return new SUV(modelo);
        } else {
            throw new IllegalArgumentException("Tipo de carro desconhecido");
        }
    }
}
