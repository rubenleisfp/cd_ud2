package org.example.tiendaverde.app;


import org.example.tiendaverde.modelo.Producto;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("Maceta de cerámica", 12.50);
        Producto p2 = new Producto("Abono ecológico", 8.90);


        System.out.println(p1);
        System.out.println(p2);
    }
}
