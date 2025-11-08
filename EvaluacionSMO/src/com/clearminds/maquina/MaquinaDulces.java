package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo;

    public MaquinaDulces() {

    }

    public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
        this.celda1 = new Celda(codigoCelda1);
        this.celda2 = new Celda(codigoCelda2);
        this.celda3 = new Celda(codigoCelda3);
        this.celda4 = new Celda(codigoCelda4);
    }

    public void mostrarConfiguracion() {
        System.out.println("CELDA 1:" + this.celda1.getCodigo());
        System.out.println("CELDA 2:" + this.celda2.getCodigo());
        System.out.println("CELDA 3:" + this.celda3.getCodigo());
        System.out.println("CELDA 4:" + this.celda4.getCodigo());
    }

    public Celda buscarCelda(String codigoCelda) {
        if (this.celda1.getCodigo().equals(codigoCelda)) {
            return this.celda1;
        } else if (this.celda2.getCodigo().equals(codigoCelda)) {
            return this.celda2;
        } else if (this.celda3.getCodigo().equals(codigoCelda)) {
            return this.celda3;
        } else if (this.celda4.getCodigo().equals(codigoCelda)) {
            return this.celda4;
        } else {
            return null;
        }
    }

    public void cargarProducto(Producto producto, String codigoCelda, int stock) {
        Celda celdaRecuperada;
        celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, stock);
        } else {
            System.out.println("La celda no existe");
        }
    }

    public void mostrarProductos() {
        System.out.println("***********CELDA A1:");
        System.out.println("Stock " + this.celda1.getStock());
        if (celda1.getProducto() != null) {
            System.out.println("Nombre Producto:" + this.celda1.getProducto().getNombre());
            System.out.println("Precio Producto:" + this.celda1.getProducto().getPrecio());
            System.out.println("Codigo Producto:" + this.celda1.getProducto().getCodigo());
        } else {
            System.out.println("La celda no tiene producto!!!");
        }
        System.out.println("***********CELDA A2:");
        System.out.println("Stock " + this.celda2.getStock());
        if (celda2.getProducto() != null) {
            System.out.println("Nombre Producto:" + this.celda2.getProducto().getNombre());
            System.out.println("Precio Producto:" + this.celda2.getProducto().getPrecio());
            System.out.println("Codigo Producto:" + this.celda2.getProducto().getCodigo());
        } else {
            System.out.println("La celda no tiene producto!!!");
        }
        System.out.println("***********CELDA B1:");
        System.out.println("Stock " + this.celda3.getStock());
        if (celda3.getProducto() != null) {
            System.out.println("Nombre Producto:" + this.celda3.getProducto().getNombre());
            System.out.println("Precio Producto:" + this.celda3.getProducto().getPrecio());
            System.out.println("Codigo Producto:" + this.celda3.getProducto().getCodigo());
        } else {
            System.out.println("La celda no tiene producto!!!");
        }
        System.out.println("***********CELDA B2:");
        System.out.println("Stock " + this.celda4.getStock());
        if (celda4.getProducto() != null) {
            System.out.println("Nombre Producto:" + this.celda4.getProducto().getNombre());
            System.out.println("Precio Producto:" + this.celda4.getProducto().getPrecio());
            System.out.println("Codigo Producto:" + this.celda4.getProducto().getCodigo());
        } else {
            System.out.println("La celda no tiene producto!!!");
        }
        System.out.println("Saldo: "+this.saldo);
    }

    public Producto buscarProductoEnCelda(String codigoCelda) {
        if (this.celda1.getCodigo().equals(codigoCelda)) {
            return this.celda1.getProducto();
        } else if (this.celda2.getCodigo().equals(codigoCelda)) {
            return this.celda2.getProducto();
        } else if (this.celda3.getCodigo().equals(codigoCelda)) {
            return this.celda3.getProducto();
        } else if (this.celda4.getCodigo().equals(codigoCelda)) {
            return this.celda4.getProducto();
        } else {
            return null;
        }
    }

    public double consultarPrecio(String codigoCelda) {
        if (this.celda1.getCodigo().equals(codigoCelda)) {
            if(celda1.getProducto()!=null) {
                return this.celda1.getProducto().getPrecio();
            }
        }
        if (this.celda2.getCodigo().equals(codigoCelda)) {
            if(celda2.getProducto()!=null) {
                return this.celda2.getProducto().getPrecio();
            }
        }
        if (this.celda3.getCodigo().equals(codigoCelda)) {
            if(celda3.getProducto()!=null) {
            return this.celda3.getProducto().getPrecio();
            }
        }
        if (this.celda4.getCodigo().equals(codigoCelda)) {
            if(celda4.getProducto()!=null) {
                return this.celda4.getProducto().getPrecio();
            }
        }
        return 0;
    }

    public Celda buscarCeldaProducto(String codigoProducto) {
        if (celda1.getProducto() != null) {
            if (this.celda1.getProducto().getCodigo().equals(codigoProducto)) {
                return this.celda1;
            }
        }
        if (celda2.getProducto() != null) {
            if (this.celda2.getProducto().getCodigo().equals(codigoProducto)) {
                return this.celda2;
            }
        }
        if (celda3.getProducto() != null) {
            if (this.celda3.getProducto().getCodigo().equals(codigoProducto)) {
                return this.celda3;
            }
        }
        if (celda4.getProducto() != null) {
            if (this.celda4.getProducto().getCodigo().equals(codigoProducto)) {
                return this.celda4;
            }
        }
        return null;

    }

    public void incrementarProductos(String codigoProducto, int cantidad) {
        Celda celdaEncontrada;
        celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
        } else {
            System.out.println("El producto no existe");
        }

    }

    public void vender(String codigoCelda) {
        Celda celdaEncontrada;
        celdaEncontrada = buscarCelda(codigoCelda);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
            this.saldo += celdaEncontrada.getProducto().getPrecio();
            mostrarProductos();
        } else {
            System.out.println("El producto no existe");
        }

    }

    public double venderConCambio(String codigoCelda, double valorIngresado) {
        Celda celdaEncontrada;
        double cambio;
        celdaEncontrada = buscarCelda(codigoCelda);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
            cambio = valorIngresado - celdaEncontrada.getProducto().getPrecio();
            this.saldo -= cambio;
            return cambio;
        } else {
            System.out.println("El producto no existe");
            return 0;
        }
    }


}


