package jardinagem;

public class MainJardinagem {

    public static void main(String[] args) {
        Jardinagem jardim = new Jardinagem();

        jardim.usarAdubo();
        System.out.println(jardim.quiloAdubo);
        jardim.valorAdubo();
        System.out.println(jardim.valorAdubo);
        jardim.valorCorteGrama();
        System.out.println(jardim.valorCorteGrama);
    }
}
