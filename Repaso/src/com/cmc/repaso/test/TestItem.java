package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setNombre("Item1");
        item1.setProductosActuales(10);
        item1.imprimir();
        item1.vender(10);
        item1.devolver(3);
        item1.imprimir();
        Item item2 = new Item();
        item2.setNombre("Item2");
        item2.setProductosActuales(20);
        item2.vender(8);
        item2.devolver(2);
        item2.imprimir();
    }
}
