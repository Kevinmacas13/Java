package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Producto;
public class TestProducto {
    public static void main(String[] args) {
        Producto p= new Producto("Pizza",15);
        p.setPrecio(-58);
        System.out.println("Precio promo: "+p.calcularPromo(10));

    }




}
