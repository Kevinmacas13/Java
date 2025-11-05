package com.krakedev;

public class testCalculadora {
    public static void main(String[] args) {
    int suma;
        Calculadora calculadora = new Calculadora();
        suma= calculadora.sumar(3,2);
        System.out.println("La suma resulta: " + suma);
    int resta;
    resta= calculadora.restar(3,2);
    System.out.println("La resta resulta: " + resta);


    }

}
