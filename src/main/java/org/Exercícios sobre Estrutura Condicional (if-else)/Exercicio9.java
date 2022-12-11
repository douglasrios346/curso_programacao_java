import java.util.Locale;
import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B , C;

        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = sc.nextDouble();

        double delta = Math.pow(B, 2.0) - 4.0 * A * C;
        if (A == 0 || delta < 0.0) {
            System.out.println("Impossivel Calcular");
        } else {
            double R1 = (-B + Math.sqrt(delta)) / (2.0 * A);
            double R2 = (-B - Math.sqrt(delta)) / (2.0 * A);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
        sc.close();

    }
}