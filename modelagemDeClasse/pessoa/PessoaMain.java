package pessoa;

import java.util.Scanner;

public class PessoaMain {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.apresentar();

        Scanner input = new Scanner(System.in);
        System.out.println("Deseja saber o quanto você cresceu? S/N");
        String usuario = input.next();
        if (usuario.equalsIgnoreCase("s")){
            p1.crescer();
        }else{
            System.out.println("Agradecemos a preferencia!");
        }
    }
}
