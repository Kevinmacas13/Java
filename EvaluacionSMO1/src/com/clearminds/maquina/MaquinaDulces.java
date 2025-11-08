package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

    private Celda  celda1;
    private Celda  celda2;
    private Celda  celda3;
    private Celda  celda4;
    private double saldo;
    public MaquinaDulces(){

    }
    public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4){
        this.celda1= new Celda(codigoCelda1);
        this.celda2= new Celda (codigoCelda2);
        this.celda3= new Celda(codigoCelda3);
        this.celda4= new Celda(codigoCelda4);
    }

    public void mostrarConfiguracion(){
        System.out.println("CELDA 1:"+this.celda1.getCodigo());
        System.out.println("CELDA 2:"+this.celda2.getCodigo());
        System.out.println("CELDA 3:"+this.celda3.getCodigo());
        System.out.println("CELDA 4:"+this.celda4.getCodigo());
    }
    public Celda buscarCelda(String codigoCelda){
      if(this.celda1.getCodigo().equals(codigoCelda)){
        return this.celda1;
      }else if(this.celda2.getCodigo().equals(codigoCelda)){
        return this.celda2;
      }else if(this.celda3.getCodigo().equals(codigoCelda)){
        return this.celda3;
      }else if(this.celda4.getCodigo().equals(codigoCelda)){
        return this.celda4;
      }else{
           return null;
      }
    }
    public void cargarProducto(Producto producto, String codigoCelda, int stock){
        Celda celdaRecuperada;
        celdaRecuperada=buscarCelda(codigoCelda);
        if(celdaRecuperada!=null){
            celdaRecuperada.ingresarProducto(producto, stock);
        }else{
            System.out.println("La celda no existe");
        }
    }
    public void mostrarProductos(){
        System.out.println("CELDA 1: Codigo "+this.celda1.getProducto().getCodigo()+" Stock Actual: "+this.celda1.getStock()+ " Nombre"+ this.celda1.getProducto().getNombre()+" Precio: "+this.celda1.getProducto().getPrecio());
        System.out.println("CELDA 2: Codigo "+this.celda2.getProducto().getCodigo()+" Stock Actual: "+this.celda2.getStock()+ " Nombre"+ this.celda2.getProducto().getNombre()+" Precio: "+this.celda2.getProducto().getPrecio());
        System.out.println("CELDA 3: Codigo "+this.celda3.getProducto().getCodigo()+" Stock Actual: "+this.celda3.getStock()+ " Nombre"+ this.celda3.getProducto().getNombre()+" Precio: "+this.celda3.getProducto().getPrecio());
        System.out.println("CELDA 4: Codigo "+this.celda4.getProducto().getCodigo()+" Stock Actual: "+this.celda4.getStock()+ " Nombre"+ this.celda4.getProducto().getNombre()+" Precio: "+this.celda4.getProducto().getPrecio());
    }
    public Producto buscarProductoEnCelda(String codigoCelda){
        if(this.celda1.getCodigo().equals(codigoCelda)){
            return this.celda1.getProducto();
          }else if(this.celda2.getCodigo().equals(codigoCelda)){
            return this.celda2.getProducto();
          }else if(this.celda3.getCodigo().equals(codigoCelda)){
            return this.celda3.getProducto();
          }else if(this.celda4.getCodigo().equals(codigoCelda)){
            return this.celda4.getProducto();
          }else{
               return null;
          }
    }
    public double consultarPrecio(String codigoCelda){
        if(this.celda1.getCodigo().equals(codigoCelda)){
            return this.celda1.getProducto().getPrecio();
          }else if(this.celda2.getCodigo().equals(codigoCelda)){
            return this.celda2.getProducto().getPrecio();
          }else if(this.celda3.getCodigo().equals(codigoCelda)){
            return this.celda3.getProducto().getPrecio();
          }else if(this.celda4.getCodigo().equals(codigoCelda)){
            return this.celda4.getProducto().getPrecio();
          }else{
               return 0;
          }
    }
    public Celda buscarCeldaProducto(String codigoProducto){
        if(this.celda1.getProducto().getCodigo().equals(codigoProducto)){
            return this.celda1;
          }else if(this.celda2.getProducto().getCodigo().equals(codigoProducto)){
            return this.celda2;
          }else if(this.celda3.getProducto().getCodigo().equals(codigoProducto)){
            return this.celda3;
          }else if(this.celda4.getProducto().getCodigo().equals(codigoProducto)){
            return this.celda4;
          }else{
               return null;
          }
    }

    public void incrementarProductos(String codigoProducto, int cantidad){
         Celda celdaEncontrada;
          celdaEncontrada=buscarCeldaProducto(codigoProducto);
          if(celdaEncontrada!=null){
            celdaEncontrada.setStock(celdaEncontrada.getStock()+cantidad);
          }else{
            System.out.println("El producto no existe");
          }
         
    }
    public void vender(String codigoCelda){
        Celda celdaEncontrada;
        celdaEncontrada=buscarCelda(codigoCelda);
        if(celdaEncontrada!=null){
            celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
                this.saldo+= celdaEncontrada.getProducto().getPrecio();
                mostrarProductos(); 
        }else{
            System.out.println("El producto no existe");
          }

    }

    public double venderConCambio(String codigoCelda,double valorIngresado){
        Celda celdaEncontrada;
        double cambio;
        celdaEncontrada=buscarCelda(codigoCelda);
        if(celdaEncontrada!=null){
            celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
           cambio= valorIngresado-celdaEncontrada.getProducto().getPrecio();  
            this.saldo-=cambio;
            return cambio;
        }else{
            System.out.println("El producto no existe");
              return 0;  
        }
    }



    }


