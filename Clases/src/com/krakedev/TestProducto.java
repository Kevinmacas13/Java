package com.krakedev;

public class TestProducto {


    public static void main(String[] args) {
        Producto productoA;
        Producto productoB;
        Producto productoC;
        productoA = new Producto();
        productoB = new Producto();
        productoC = new Producto();
        productoA.nombre="Protecto Solar";
        productoA.precio=35;
        productoA.stockActual=40;
        productoB.nombre="Pasta dental";
        productoB.precio=4;
        productoB.stockActual=26;
        productoC.nombre="Vitamina C";
        productoC.precio=3;
        productoC.stockActual=45;
        System.out.println("Producto farmacia");
        System.out.println("Primer producto");
        System.out.println("Nombre: "+productoA.nombre );
        System.out.println("Precio: "+productoA.precio);
        System.out.println("Stock Actual: "+productoA.stockActual);
        System.out.println("Segundo producto");
        System.out.println("Nombre: "+productoB.nombre );
        System.out.println("Precio: "+productoB.precio);
        System.out.println("Stock Actual: "+productoB.stockActual);
        System.out.println("Tercer producto");
        System.out.println("Nombre: "+productoC.nombre );
        System.out.println("Precio: "+productoC.precio);
        System.out.println("Stock Actual: "+productoC.stockActual);
    }
}
