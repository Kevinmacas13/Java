package com.krakedev;

public class TestAuto {
    public static void main(String[] args) {
        Auto auto1;
        Auto auto2;
        auto1 = new Auto();
        auto2 = new Auto();
        auto1.marca="Toyota";
        auto1.anio=2000;
        auto1.precio=4000;
        auto2.marca="Chevrolet";
        auto2.anio=2010;
        auto2.precio=8000;
        System.out.println("Mi primer vehículo: ");
        System.out.println("Marca: "+auto1.marca);
        System.out.println("Anio: "+auto1.anio);
        System.out.println("Precio: "+auto1.precio);
        System.out.println("Mi segundo vehículo: ");
        System.out.println("Marca: "+auto2.marca);
        System.out.println("Anio: "+auto2.anio);
        System.out.println("Precio: "+auto2.precio);


    }
}
