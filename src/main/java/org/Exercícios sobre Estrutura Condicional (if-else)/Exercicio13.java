import java.util.Locale;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A, B;
        System.out.println("Digite um numero: ");
        A = sc.nextInt();
        System.out.println("Digite outro numero: ");
        B = sc.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}