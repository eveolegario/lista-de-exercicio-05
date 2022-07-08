package carro;

public class Carro {
    int numeroPortas;
    String modelo;
    String marca;
    double potencia;
    boolean ligarCarro;

    public Carro() {
        this.numeroPortas = numeroPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
        this.ligarCarro = ligarCarro;
    }

    public void ligarCarro(){
        this.ligarCarro = true;
        System.out.println("O carro está: " + ligarCarro);
    }
}
