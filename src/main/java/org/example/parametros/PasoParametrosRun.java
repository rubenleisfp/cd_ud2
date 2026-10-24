package org.example.parametros;

public class PasoParametrosRun {
    public static void main(String[] args) {
        System.out.print("Introduce el primer número: ");
        double numero1 = Double.parseDouble(args[0]);
        System.out.print("Introduce el segundo número: ");
        double numero2 = Double.parseDouble(args[1]);
        double suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
    }
}
