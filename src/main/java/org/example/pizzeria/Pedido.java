package org.example.pizzeria;

public class Pedido {
    String cliente = "Ana";
    String pizza = "Margarita";

    public void mostrar() {
        System.out.println("Pedido de " + cliente);
        System.out.println("Pizza: " + pizza);
    }
}