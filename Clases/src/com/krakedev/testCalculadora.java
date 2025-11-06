package com.krakedev;

public class testCalculadora {
    public static void main(String[] args) {
        int suma;
        Calculadora calculadora = new Calculadora();
        suma = calculadora.sumar(3, 2);
        System.out.println("La suma resulta: " + suma);
        int resta;
        resta = calculadora.restar(3, 2);
        System.out.println("La resta resulta: " + resta);
        double multiplicacion;
        multiplicacion = calculadora.multiplicar(10, 5);
        System.out.println("La multiplicacion resulta: " + multiplicacion);
        double division;
        division = calculadora.dividir(10, 2);
        System.out.println("La division resulta: " + division);
        double promedio;
        promedio = calculadora.promediar(10, 8, 9);
        System.out.println("La promedio resulta: " + promedio);
        calculadora.mostrarResultado();
    }

}
