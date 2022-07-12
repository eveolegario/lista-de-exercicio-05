package caixa;

public class Caixa {

    double saldo;
    double credito;
    double debito;

    public Caixa(double saldo) {
        this.saldo = 1000;
        this.credito = credito;
        this.debito = debito;
    }
    public double entraDinheiro() {
        saldo = saldo + credito;
        return saldo;
    }

    public double saiDinheiro(){
        saldo = saldo - debito;
        return saldo;
    }
}
