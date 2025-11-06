package com.krakedev;

public class TestAuto {
    public static void main(String[] args) {
        Auto auto1;
        Auto auto2;
        auto1 = new Auto();
        auto2 = new Auto();
        auto1.setMarca("Toyota");
        auto1.setAnio(2000);
        auto1.setPrecio(4000);
        auto2.setMarca("Chevrolet");
        auto2.setAnio(2010);
        auto2.setPrecio(8000);
        System.out.println("Mi primer vehículo: ");
        System.out.println("Marca: "+auto1.getMarca());
        System.out.println("Anio: "+auto1.getAnio());
        System.out.println("Precio: "+auto1.getPrecio());
        System.out.println("Mi segundo vehículo: ");
        System.out.println("Marca: "+auto2.getMarca());
        System.out.println("Anio: "+auto2.getAnio());
        System.out.println("Precio: "+auto2.getPrecio());


    }
}
