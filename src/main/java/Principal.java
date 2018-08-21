import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Losango los = new Losango();
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com a altura do Losango");
        int n = ler.nextInt();
        los.ImprimeLosango(n);

    }
}
