package com.krakedev;

public class TestProducto {


    public static void main(String[] args) {
        Producto productoA;
        Producto productoB;
        Producto productoC;
        productoA = new Producto();
        productoB = new Producto();
        productoC = new Producto();
        productoA.setNombre("Protecto Solar");
        productoA.setPrecio(35);
        productoA.setStockActual(40);
        productoB.setNombre("Pasta dental");
        productoB.setPrecio(4);
        productoB.setStockActual(26);
        productoC.setNombre("Vitamina C");
        productoC.setPrecio(3);
        productoC.setStockActual(45);
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
