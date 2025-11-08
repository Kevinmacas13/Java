package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

import java.util.ArrayList;

public class MaquinaDulces {
    private ArrayList<Celda> celdas;
    private double saldo;
    public MaquinaDulces(){
        this.celdas=new ArrayList<Celda>();
    }
    public void agregarCelda(Celda celda){
        this.celdas.add(celda);
    }
    public void mostrarConfiguracion(){
        System.out.println("Celdas:");
         for(int i=0;i<celdas.size();i++){

             System.out.println("Celda"+(i+1)+":"+celdas.get(i).getCodigo());
         }
    }
    public Celda buscarCelda(String codigoCelda){
        for(int i=0;i<celdas.size();i++){
            if(celdas.get(i).getCodigo().equals(codigoCelda)){
                return celdas.get(i);
            }
        }
    return null;
    }
    public void cargarProducto(Producto producto, String codigoCelda, int cantidad){
        Celda celdaRecuperada;
        celdaRecuperada= buscarCelda(codigoCelda);
        if(celdaRecuperada!=null){
            celdaRecuperada.ingresarProducto(producto,cantidad);
        }

    }
    public void mostrarProductos(){
        for(int i=0;i<celdas.size();i++){
            System.out.print("Celda:"+celdas.get(i).getCodigo()+" Stock:"+celdas.get(i).getStock());
            if(celdas.get(i).getProducto()!=null){
                System.out.println(" Producto:"+celdas.get(i).getProducto().getNombre()+" Precio:"+celdas.get(i).getProducto().getPrecio());
            }else{
                System.out.println(" Sin producto asignado");
            }
        }
    }
}
