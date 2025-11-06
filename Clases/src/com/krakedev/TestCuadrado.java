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
        double perimetroCuadrado= cuadrado.calcularPerimetro();
        double perimetroCuadrado2 = cuadrado2.calcularPerimetro();
        double perimetroCuadrado3 = cuadrado3.calcularPerimetro();
        System.out.println("Area cuadrado 1: "+areaCuadrado);
        System.out.println("Area cuadrado 2: "+areaCuadrado2);
        System.out.println("Area cuadrado 3: "+areaCuadrado3);
       System.out.println("Perimetro cuadrado 1: "+perimetroCuadrado);
       System.out.println("Perimetro cuadrado 2: "+perimetroCuadrado2);
       System.out.println("Perimetro cuadrado 3: "+perimetroCuadrado3);
    }
}
