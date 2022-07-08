package contaCorrente;

public class MainContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.nomeDoCorrentista = "Maria José";
        conta.numeroDaConta = "0102";
        conta.saldo = 11.32;
        System.out.println("Correntista " + conta.nomeDoCorrentista+ ", com conta " + conta.numeroDaConta + " tem saldo de R$ " + conta.saldo);

    }
}
