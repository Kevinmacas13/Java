package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

    public static void main(String[] args) {
        Telefono telefono = new Telefono("movi","09941234123",10);
        System.out.println("Operadora: "+telefono.getOperadora());
        System.out.println("Numero: "+telefono.getNumero());
        System.out.println("Codigo: "+telefono.getCodigo());
    }

}
