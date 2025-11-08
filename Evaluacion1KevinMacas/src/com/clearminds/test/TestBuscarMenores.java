package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestBuscarMenores {
    public static void main(String[] args) {
        MaquinaDulces maquinaDulces = new MaquinaDulces();

        Celda celda1= new Celda("1");
        celda1.ingresarProducto(new Producto("KN1","Papitas",0.85),10);
        Celda celda2= new Celda("2");
        celda2.ingresarProducto(new Producto("KN2","Doritos",0.5),10);
        Celda celda3= new Celda("3");
        celda3.ingresarProducto(new Producto("KN3","Jet Precio",0.25),10);
        Celda celda4= new Celda("4");
        celda4.ingresarProducto(new Producto("KN4","DeTodito",0.6),10);
        Celda celda5= new Celda("5");
        celda5.ingresarProducto(new Producto("KN5","PowerRade",1.5),10);
        Celda celda6= new Celda("6");
        celda6.ingresarProducto(new Producto("KN6","Galletas Amor",1.20),10);
        maquinaDulces.agregarCelda(celda1);
        maquinaDulces.agregarCelda(celda2);
        maquinaDulces.agregarCelda(celda3);
        maquinaDulces.agregarCelda(celda4);
        maquinaDulces.agregarCelda(celda5);
        maquinaDulces.agregarCelda(celda6);
        ArrayList<Producto> productosMenores = new ArrayList<Producto>();
        productosMenores= maquinaDulces.buscarMenores(1);
       System.out.println("Menores: "+productosMenores.size());
       for(int i=0;i<productosMenores.size();i++){
           System.out.println("Nombre: "+productosMenores.get(i).getNombre()+" Precio:"+productosMenores.get(i).getPrecio());
       }



    }
}
