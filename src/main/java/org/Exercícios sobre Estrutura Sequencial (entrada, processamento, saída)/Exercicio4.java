package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int idFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorHora = sc.nextDouble();
        double salario = horasTrabalhadas * valorHora;
        System.out.println("NUMBER = " + idFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();

    }
}