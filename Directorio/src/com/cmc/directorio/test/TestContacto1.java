package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
    public static void main(String[] args) {
        Telefono telef =  new Telefono("movi","09941234123",10);
        Contacto c = new Contacto("Kevin","Macas",telef,60);
        //Imprimir contacto
        System.out.println("Contacto:");
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Apellido: "+c.getApellido());
        System.out.println("Telefono operadora:"+c.getTelefono().getOperadora());
        System.out.println("Numero Telefono: "+c.getTelefono().getNumero());
        System.out.println("Peso: "+c.getPeso());



    }
}
