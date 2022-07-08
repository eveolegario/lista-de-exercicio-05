package retangulo;

public class Retangulo {
    double ladoA;
    double ladoB;

    public Retangulo() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void alterarValorLados(double ladoA, double ladoB){
        System.out.println("Valor de lado A" + this.ladoA);
        System.out.println("Valor de lado B" + this.ladoB);

    }
    public String mostrarLados(){
        System.out.println("mostrar lado A  = " +  ladoA + " Lado B " + ladoB);
        return null;
    }
    public double calcularArea(){
        double total = 0;
        total = ladoA * ladoB;
        return total;
    }
    public double calcularPerimetro(){
        double total;
        total = 2 * (ladoA + ladoB);
        return total;
    }

}
