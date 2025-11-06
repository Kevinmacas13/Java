package com.krakedev.test;
import com.krakedev.Rectangulo;

public class TestRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(3,5);
        Rectangulo rectangulo2 = new Rectangulo(4,2);
        rectangulo.setBase(3);
        rectangulo.setAltura(5);
        rectangulo2.setBase(4);
        rectangulo2.setAltura(2);
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
