package jardinagem;

public class Jardinagem {

    String nomeJardim;
    double quantidaDeMetro;
    double quantidaDePlanta;
    double metroGrama;
    double quiloAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorCorteGrama;

    public Jardinagem() {
        this.nomeJardim = nomeJardim;
        this.quantidaDeMetro = quantidaDeMetro;
        this.quantidaDePlanta = quantidaDePlanta;
        this.metroGrama = metroGrama;
        this.quiloAdubo = quiloAdubo;
        this.valorAdubo = 1.00;
        this.valorMetroGrama = valorMetroGrama;
        this.valorCorteGrama = 8.00;
    }
    public void usarAdubo(){
        quantidaDeMetro = quantidaDeMetro * 10;
    }
    public double precoAdubo(){
        double calcularPreco = this.quantidaDeMetro * valorAdubo;
        return calcularPreco;
    }
    public double precoCorteGrama(){
        double calcularGrama = this.metroGrama * valorCorteGrama;
        return calcularGrama;
    }
}
