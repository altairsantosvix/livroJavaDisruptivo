package org.LivroJavaDisruptivo.Carro;

public class Main {


        public static void main(String[] args) {
            Carro meuCarro = new Carro("Honda Civic", 240);

            // Usando polimorfismo
            Carro meuCarroEsportivo = new CarroEsportivo("Ferrari", 320);
            Carro meuSUV = new Suv("Range Rover", 200);

            // Acelerando os carros

            // Usando sobrecarga para acelerar de formas diferentes
            meuCarro.acelerar();              // Acelera até a velocidade máxima
            meuCarro.acelerar(180);           // Acelera até 180 km/h
            meuCarro.acelerar(300);           // Tenta acelerar além da velocidade máxima

            meuCarroEsportivo.acelerar(); // Ferrari está acelerando até 320 km/h!
            meuSUV.acelerar();    // Range Rover está acelerando até 200 km/h!

            // Ligando o turbo no carro esportivo (não é possível diretamente pelo tipo Carro)
            // meuCarro.ligarTurbo(); // Erro de compilação: o método não existe para o tipo Carro

            // Conversão de tipo para usar o método específico da Ferrari
            if (meuCarroEsportivo instanceof CarroEsportivo) {
                ((CarroEsportivo) meuCarroEsportivo).ligarTurbo(); // Ferrari ativou o turbo!
            }




        }
    }


