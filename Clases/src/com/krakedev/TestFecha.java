package com.krakedev;

public class TestFecha {
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(12);
        f.setAnio(2025);
        System.out.println("Fecha1: "+f.getAnio());
    }
}
