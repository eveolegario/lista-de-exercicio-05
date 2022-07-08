package bola;

import java.util.Scanner;

public class MainBola {
    public static void main(String[] args) {
        String trocar = null;
        Bola b1 = new Bola();
        String cor = b1.cor;

        b1.mostraCor();
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja trocar de cor? S/N ");
        trocar = input.next();
        if (trocar.equalsIgnoreCase("S")){
            b1.trocaCor();

        }else{
            System.out.println("Agradecemos a escolha");
        }
    }
}
