package com.cmc.directorio.entidades;

public class AdminContactos {

    public Contacto buscarMasPesado(Contacto c1, Contacto c2){

        if(c1.getPeso()>c2.getPeso()){
            return c1;
        }else if(c2.getPeso()>c1.getPeso()){
            return c2;
        }else{
            return null;
        }

    }
    public boolean compararOperadoras(Contacto c1, Contacto c2){
        return c1.getTelefono().getOperadora().equals(c2.getTelefono().getOperadora());
    }
    public void activarUsuario(Contacto c1){
        if(c1.getTelefono().isTieneWhatsapp()){
            c1.setActivo(true);
        }

    }
}
