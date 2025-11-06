package com.krakedev;

public class TestCuadrado {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado();
        Cuadrado cuadrado3 = new Cuadrado();
        cuadrado.lado=5;
        cuadrado2.lado=6;
        cuadrado3.lado=7;
        double areaCuadrado= cuadrado.calcularArea();
        double areaCuadrado2 = cuadrado2.calcularArea();
        double areaCuadrado3 = cuadrado3.calcularArea();
        System.out.println("Area cuadrado 1: "+areaCuadrado);
        System.out.println("Area cuadrado 2: "+areaCuadrado2);
        System.out.println("Area cuadrado 3: "+areaCuadrado3);

    }
}
