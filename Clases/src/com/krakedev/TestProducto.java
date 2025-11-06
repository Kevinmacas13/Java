package com.krakedev;

public class TestProducto {


    public static void main(String[] args) {
        Producto productoA;
        Producto productoB;
        Producto productoC;
        productoA = new Producto("Protecto Solar","",35,40);
        productoB = new Producto("Pasta dental","",4,26);
        productoC = new Producto("Vitamina C","",3,45);

        System.out.println("Producto farmacia");
        System.out.println("Primer producto");
        System.out.println("Nombre: "+productoA.getNombre() );
        System.out.println("Precio: "+productoA.getPrecio() );
        System.out.println("Stock Actual: "+productoA.getStockActual() );
        System.out.println("Segundo producto");
        System.out.println("Nombre: "+productoB.getNombre() );
        System.out.println("Precio: "+productoB.getPrecio() );
        System.out.println("Stock Actual: "+productoB.getStockActual() );
        System.out.println("Tercer producto");
        System.out.println("Nombre: "+productoC.getNombre() );
        System.out.println("Precio: "+productoC.getPrecio());
        System.out.println("Stock Actual: "+productoC.getStockActual());
    }
}
