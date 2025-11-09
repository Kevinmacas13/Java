package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
    private ArrayList<Contacto> contactos;
    private Date fechaModificacion;

    public Directorio() {
        contactos = new ArrayList<>();

    }

    public boolean agregarContacto(Contacto contacto) {
        Contacto contactoEncontrado;
        contactoEncontrado = buscarPorCedula(contacto.getCedula());
        if (contactoEncontrado == null) {
            contactos.add(contacto);
            this.fechaModificacion = new Date();
            return true;
        } else {
            return false;
        }

    }

    public String consultarUltimaModificacion() {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy/mm/dd HH:mm:ss");
        String fechaFormateada = formato.format(this.fechaModificacion);
        return fechaFormateada;

    }

    public Contacto buscarPorCedula(String cedula) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getCedula().equals(cedula)) {
                return contactos.get(i);
            }
        }
        return null;
    }

}
