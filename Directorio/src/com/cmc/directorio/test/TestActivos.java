package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
    public static void main(String[] args) {
        Contacto c1= new Contacto("Kevin","Macas",new Telefono("movi","09941234123",10),60);
        System.out.println("Nombre: "+c1.getNombre()+" Apellido: "+c1.getApellido()+" Operadora: "+c1 .getTelefono().getOperadora()+" Número: "+c1 .getTelefono().getNumero()+" Tiene Whatsapp: "+c1.getTelefono().isTieneWhatsapp()+" Está activo: "+c1.isActivo()+" Peso: "+c1.getPeso());
        AdminContactos ad= new AdminContactos();
        ad.activarUsuario(c1);
        System.out.println("Nombre: "+c1.getNombre()+" Apellido: "+c1.getApellido()+" Operadora: "+c1 .getTelefono().getOperadora()+" Número: "+c1 .getTelefono().getNumero()+" Tiene Whatsapp: "+c1.getTelefono().isTieneWhatsapp()+" Está activo: "+c1.isActivo()+" Peso: "+c1.getPeso());

    }
}
