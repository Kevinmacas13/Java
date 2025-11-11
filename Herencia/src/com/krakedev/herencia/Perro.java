package com.krakedev.herencia;

public class Perro extends Animal {
    private String raza;
     public Perro(){
        System.out.println("Ejecuto constructor de perro");
     }
    public void ladrar(){
        System.out.println("ladrar");
    }
    @Override
    public void dormir(){
        super.dormir();
        System.out.println("Mi perro duerme");
    }



}
