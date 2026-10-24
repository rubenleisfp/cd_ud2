package org.example.limpieza;

import java.util.Scanner;

public class CalculadoraDescuentos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CONTROL DE VENTAS ===");
        System.out.print("¿Cuantas ventas vas a registrar hoy?: ");
        int n = sc.nextInt();

        double totalVentas = 0;
        int contador = 1;

        while (contador <= n) {
            System.out.print("Introduce el importe de la venta " + contador + ": ");
            double importe = sc.nextDouble();

            if (importe > 0) {

                if (importe >= 100) {
                    System.out.println("¡Aplica descuento del 10%!");
                    double desc = importe * 0.10;
                    importe = importe - desc;
                }

                totalVentas = totalVentas + importe;

                System.out.println("Importe procesado para esta venta: " + importe);
            } else {
                System.out.println("Importe no valido, debe ser mayor a 0.");
            }
            contador++;

        }

        System.out.println("\n------------------------------------");
        System.out.println("El total acumulado de las ventas es: " + totalVentas);

        double prom = totalVentas / n;
        System.out.println("El promedio por venta fue: " + prom);
        System.out.println("Fin del programa");
        sc.close();
    }
}