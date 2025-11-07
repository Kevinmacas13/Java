package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContanctos2 {
    public static void main(String[] args) {
        Contacto c1 = new Contacto("Miguel", "Perez", new Telefono("claro", "0984675454", 10), 60);
        Contacto c2 = new Contacto("Tomas", "Castro", new Telefono("claro", "09846795444", 11), 40);
        AdminContactos ad = new AdminContactos();

        Contacto masPesado;
        if (c1.getPeso() != c2.getPeso()) {
            masPesado = ad.buscarMasPesado(c1, c2);
            System.out.println("Contacto mas pesado");
            System.out.println("Nombre: "+masPesado.getNombre()+" Apellido: "+masPesado.getApellido()+" Operadora: "+masPesado .getTelefono().getOperadora()+" Número: "+masPesado .getTelefono().getNumero()+" Peso: "+masPesado.getPeso());
        }
        boolean pertenecenMismaOperadora= ad.compararOperadoras(c1, c2);
        if(pertenecenMismaOperadora){
            System.out.println("Pertenecen a la misma operadora");
        }else{
            System.out.println("No pertenecen a la misma operadora");
        }

    }
}
