import java.util.Locale;
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2;
        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        double notaFinal = nota1 + nota2;
        if (notaFinal < 60.0) {
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Reprovado");
        } else {
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Aprovado");
        }
        sc.close();
}

}
