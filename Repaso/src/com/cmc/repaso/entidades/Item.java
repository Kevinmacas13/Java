package com.cmc.repaso.entidades;

public class Item {
 private String nombre;
 private int productosActuales;
 private int productosDevueltos;
 private  int productosVendidos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }

    public void imprimir(){
     System.out.println("Nombre: "+nombre);
     System.out.println("Productos Actuales: "+productosActuales);
     System.out.println("Productos Devueltos: "+productosDevueltos);
     System.out.println("Prodcutos Vendidos: "+productosVendidos);
 }
 public void vender(int cantidadVendidos){

     this.productosVendidos += cantidadVendidos;
     this.productosActuales -= cantidadVendidos;
 }
    public void devolver(int cantidadVendidos){

        this.productosVendidos -= cantidadVendidos;
        this.productosActuales += cantidadVendidos;
        this.productosDevueltos += cantidadVendidos;
    }

}
