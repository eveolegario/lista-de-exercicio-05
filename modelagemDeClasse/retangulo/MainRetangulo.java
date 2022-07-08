package retangulo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        double ladoA = r1.ladoA;
        double ladoB = r1.ladoB;

        System.out.println("Insira o valor do lado A: ");
        Scanner input = new Scanner(System.in);
        ladoA = input.nextDouble();
        System.out.println("Insira o valor do lado B: ");
        ladoB = input.nextDouble();

        System.out.println("Valor de A = " + ladoA);
        System.out.println("Valor de B = " + ladoB);

        System.out.println("Deseja alterar o valor dos lados? S/N");
        String usuario = input.next();

        if (usuario.equalsIgnoreCase("s")){
            System.out.println("Novo valor de lado A");
            ladoA = input.nextDouble();
            System.out.println("Novo valor de lado B");
            ladoB = input.nextDouble();
            r1.alterarValorLados(ladoA, ladoB);
        }
        String teste = r1.mostrarLados();
        System.out.println("Mostrar valores atuais" + teste);

        r1.mostrarLados();
        double calculo = r1.calcularArea();
        System.out.println("Valor calculo" + calculo);

        r1.calcularPerimetro();
        double perimetro = r1.calcularPerimetro();
        System.out.println("Calculo do perimetro = " + perimetro );

    }

}
