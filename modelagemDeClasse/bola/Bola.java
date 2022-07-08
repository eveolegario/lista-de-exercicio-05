package bola;

import java.util.Scanner;

public class Bola {

    double circunferencia;
    String cor;
    String marca;
    double velocidade;
    String material;
    public Bola() {
        this.circunferencia = circunferencia;
        this.cor = "branca";
        this.marca = marca;
        this.velocidade = velocidade;
        this.material = material;
    }
    public String mostraCor(){
        System.out.println(cor);
        return cor;
    }
    public void trocaCor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque a cor");
        cor = input.next();
        System.out.println("A cor da bola agora é " + cor);
    }
}
