package org.example.debug;

public class EjemploDebug {

    public static void main(String[] args) {

        double precio = 80;
        int cantidad = 3;
        boolean clienteVip = true;

        double subtotal = calcularSubtotal(precio, cantidad);
        double descuento = calcularDescuento(subtotal, clienteVip);
        double total = calcularTotal(subtotal, descuento);

        mostrarResultado(subtotal, descuento, total);
    }

    public static double calcularSubtotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    public static double calcularDescuento(double subtotal, boolean clienteVip) {

        double descuento = 0;

        if (clienteVip) {
            descuento = subtotal * 0.10;
        } else if (subtotal > 200) {
            descuento = subtotal * 0.05;
        }

        return descuento;
    }

    public static double calcularTotal(double subtotal, double descuento) {
        return subtotal - descuento;
    }

    public static void mostrarResultado(
            double subtotal,
            double descuento,
            double total) {

        System.out.println("Subtotal: " + subtotal + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("Total: " + total + " €");
    }
}