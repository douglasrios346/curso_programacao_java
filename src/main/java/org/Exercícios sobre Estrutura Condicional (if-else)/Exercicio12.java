import java.util.Locale;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero;
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");

        }
        sc.close();

    }
}
