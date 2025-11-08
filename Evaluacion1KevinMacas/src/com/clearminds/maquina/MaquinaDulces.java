package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

import java.util.ArrayList;

public class MaquinaDulces {
    private ArrayList<Celda> celdas;
    private double saldo;

    public MaquinaDulces() {
        this.celdas = new ArrayList<Celda>();
    }

    public void agregarCelda(Celda celda) {
        this.celdas.add(celda);
    }

    public void mostrarConfiguracion() {
        System.out.println("Celdas:");
        for (int i = 0; i < celdas.size(); i++) {

            System.out.println("Celda" + (i + 1) + ":" + celdas.get(i).getCodigo());
        }
    }

    public Celda buscarCelda(String codigoCelda) {
        for (int i = 0; i < celdas.size(); i++) {
            if (celdas.get(i).getCodigo().equals(codigoCelda)) {
                return celdas.get(i);
            }
        }
        return null;
    }

    public void cargarProducto(Producto producto, String codigoCelda, int cantidad) {
        Celda celdaRecuperada;
        celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, cantidad);
        }

    }

    public void mostrarProductos() {
        for (int i = 0; i < celdas.size(); i++) {
            if(i==2){
                System.out.println();
            }
            System.out.print("Celda:" + celdas.get(i).getCodigo() + " Stock:" + celdas.get(i).getStock());

            if (celdas.get(i).getProducto() != null) {
                System.out.println(" Producto:" + celdas.get(i).getProducto().getNombre() + " Precio:" + celdas.get(i).getProducto().getPrecio());
            } else {
                System.out.println(" Sin producto asignado");
            }
        }
        System.out.println();
        System.out.println("Saldo:" + this.saldo);
    }

    public Producto buscarProductoEnCelda(String codigoCelda) {
        for (int i = 0; i < celdas.size(); i++) {
            if (celdas.get(i).getCodigo().equals(codigoCelda)) {
                return celdas.get(i).getProducto();
            }
        }
        return null;

    }

    public double consultarPrecio(String codigoCelda) {
        for (int i = 0; i < celdas.size(); i++) {
            if (celdas.get(i).getCodigo().equals(codigoCelda)) {
                if(celdas.get(i).getProducto()!=null){
                    return celdas.get(i).getProducto().getPrecio();
                }
            }
        }
        return 0;
    }
    public Celda buscarCeldaProducto(String codigoProducto) {
        for (int i = 0; i < celdas.size(); i++) {
            if(celdas.get(i).getProducto()!=null){
            if (celdas.get(i).getProducto().getCodigo().equals(codigoProducto)) {
                return celdas.get(i);
                }
            }
        }
        return null;
    }
    public  void incrementarProductos(String codigoProducto,int cantidad){
        Celda celdaEncontrada;
        celdaEncontrada= buscarCeldaProducto(codigoProducto);
        if(celdaEncontrada!=null){
           celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
        }
    }
    public void vender(String codigoCelda){
        Celda celdaEncontrada;
        celdaEncontrada= buscarCelda(codigoCelda);
        if(celdaEncontrada!=null){
            celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
            if(celdaEncontrada.getProducto()!=null){
                this.saldo+=celdaEncontrada.getProducto().getPrecio();
            }
        }
        mostrarProductos();
    }
    public double venderConCambio(String codigoCelda, double valorIngresado){
        Celda celdaEncontrada;
        celdaEncontrada= buscarCelda(codigoCelda);
        if(celdaEncontrada!=null){
            celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
            if(celdaEncontrada.getProducto()!=null){
                double cambio= valorIngresado- celdaEncontrada.getProducto().getPrecio();
             this.saldo+=celdaEncontrada.getProducto().getPrecio();
                return cambio;
            }
        }
        mostrarProductos();

        return 0;
    }

    public ArrayList<Producto> buscarMenores(double limite){
        ArrayList<Producto> menores= new ArrayList<Producto>();
        for (int i = 0; i<celdas.size();i++){
            if(celdas.get(i).getProducto()!=null){
                if(celdas.get(i).getProducto().getPrecio()<limite){
                    menores.add(celdas.get(i).getProducto());
                }
            }
        }
         return menores;

    }
}
