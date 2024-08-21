package org.LivroJavaDisruptivo.PadraoSingleton;
import org.LivroJavaDisruptivo.CarroPadraoFactory.Carro;
import org.LivroJavaDisruptivo.CarroPadraoFactory.CarroEsportivo;
import org.LivroJavaDisruptivo.CarroPadraoFactory.SUV;


public class CarroFactory {

    // Instância única da CarroFactory
    private static CarroFactory instanciaUnica;

    // Construtor privado para evitar instância externa
    private CarroFactory() {
        // Pode ser usado para inicializar recursos, se necessário
    }

    // Método público para obter a instância única
    public static synchronized CarroFactory getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new CarroFactory();
        }
        return instanciaUnica;
    }

    // Método para criar carros
    public Carro criarCarro(String tipo, String modelo) {
        if (tipo.equalsIgnoreCase("esportivo")) {
            return new CarroEsportivo(modelo);
        } else if (tipo.equalsIgnoreCase("suv")) {
            return new SUV(modelo);
        } else {
            throw new IllegalArgumentException("Tipo de carro desconhecido");
        }
    }
}
