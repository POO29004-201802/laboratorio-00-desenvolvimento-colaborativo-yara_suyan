import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Losango los = new Losango();
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com um valor para altura do losango/lado do quadrado");
        int n = ler.nextInt();
        los.ImprimeLosango(n);
        Retangulo ret = new Retangulo();
        ret.retanguloQuadradoVazado(n);

    }
}
