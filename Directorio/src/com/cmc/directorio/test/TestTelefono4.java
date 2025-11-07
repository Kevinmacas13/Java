package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4
{
    public static void main(String[] args) {
        Telefono telefono1 = new Telefono("movi","098234234",21);
        Telefono telefono2 = new Telefono("movi","098234235",22);
        Telefono telefono3 = new Telefono("claro","098234236",23);
        Telefono telefono4 = new Telefono("claro","09823427",24);

        AdminTelefono adminTelefono= new AdminTelefono();
        int totalMovi;
        totalMovi=adminTelefono.contarMovi(telefono1,telefono2,telefono3);
        System.out.println("Hay en total "+totalMovi+" telefono con operadora movi");
    }
}
