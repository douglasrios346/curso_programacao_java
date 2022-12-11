package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float A, B , C , triangulo , circulo , trapezio , quadrado , retangulo;
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        triangulo = (A * C) / 2;
        circulo = (float) (3.14159 * Math.pow(C, 2));
        trapezio = (float) ((A + B) * C) / 2;
        quadrado = (float) Math.pow(B, 2);
        retangulo = (float) (A * B);
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
        sc.close();

    }
}

