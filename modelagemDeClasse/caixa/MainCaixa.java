package caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Caixa caixinha = new Caixa(1000);
        System.out.println("Quantos lançamentos você deseja fazer? ");
        int lancamento = input.nextInt();
        int escolha;

        for (int i = 0; i < lancamento; i++) {

            System.out.print("Escolha o tipo de lançamento: (C) para crédito (D) para débito: ");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor do lançamento: ");
                    credito(input.nextDouble());
                    break;
                case 2:
                    System.out.print("Digite o valor do lançamento: ");
                    debito(input.nextDouble());
                    break;
                default:
                    System.out.println("Valor inválido");

            }
            System.out.println();
            System.out.println("O valor final do saldo é: R$ " + saldo);
        }
    }
}


