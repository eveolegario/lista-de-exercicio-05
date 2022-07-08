package pessoa;

import java.util.Scanner;

public class Pessoa {

    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa() {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
        this.altura = altura;
    }
    public void apresentar(){

        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome? ");
        nome = input.next();
        System.out.println("Qual sua idade? ");
        idade = input.nextInt();
        System.out.println("Qual seu peso? ");
        peso = input.nextDouble();
        System.out.println("Qual sua altura? ");
        altura = input.nextDouble();
    }
    public void crescer(){
       if (this.idade < 21){
           double total = 0;
           double crescer = 0.5;
           total = idade * crescer;
           System.out.println("Você cresceu " + total);
       } else {
           System.out.println("Você não cresce mais!");
       }
    }
}
