package com.krakedev;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo.base = 3;
        rectangulo.altura = 5;
        rectangulo2.base = 4;
        rectangulo2.altura = 2;
        int area;
        int area2;
        double perimetro;
        double perimetro2;
        area = rectangulo.calcularArea();
        area2 = rectangulo2.calcularArea();
        perimetro= rectangulo.calcularPerimetro();
        perimetro2 = rectangulo2.calcularPerimetro();
        System.out.println("EL área del rectángulo 1 es: " + area);
        System.out.println("EL área del rectángulo 2 es: " + area2);
        System.out.println("EL perímetro del rectángulo 1 es: " + perimetro);
        System.out.println("EL perímetro del rectángulo 2 es: " + perimetro2);
   }
}
