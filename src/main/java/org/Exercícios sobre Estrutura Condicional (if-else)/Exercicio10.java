import java.util.Locale;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, numero3;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("Maior:" + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("Maior:" + numero2);
        } else {
            System.out.println("Maior:" + numero3);
        }
        sc.close();


    }
}