package org.example.parametros;

import java.util.Scanner;

public class PasoParametrosTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double numero1 = teclado.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double numero2 = teclado.nextDouble();
        double suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
    }
}
