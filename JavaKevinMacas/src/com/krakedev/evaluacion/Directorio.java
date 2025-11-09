package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
    private ArrayList<Contacto> contactos;
    private Date fechaModificacion;
    private ArrayList<Contacto> correctos;
    private ArrayList<Contacto> incorrectos;

    public Directorio() {
        contactos = new ArrayList<>();
        correctos = new ArrayList<>();
        incorrectos = new ArrayList<>();
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

    public void depurar(){
        for (int i = 0; i < this.contactos.size(); i++) {
                    if(this.contactos.get(i).getDireccion()==null){
                        incorrectos.add(contactos.get(i));
                    }else{
                        correctos.add(contactos.get(i));
                    }

        }
        contactos.clear();
    }
    public int contarFijos() {
        int contador = 0;
        for (int i = 0; i < this.contactos.size(); i++) {
            if (this.contactos.get(i).getTelefonos() != null) {
                for (int j = 0; j < this.contactos.get(i).getTelefonos().size(); j++) {
                    if (this.contactos.get(i).getTelefonos().get(j) != null) {
                        if (this.contactos.get(i).getTelefonos().get(j).getEstado().equals("C") && this.contactos.get(i).getTelefonos().get(j).getTipo().equals("Convencional")) {
                            contador++;
                        }
                        ;
                    }
                }
            }
        }
        return contador;
    }

    public int contarPerdidos() {
        int contador = 0;
        for (int i = 0; i < this.contactos.size(); i++) {
            if (this.contactos.get(i).getDireccion() == null) {
                contador++;
            }
        }
        return contador;
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

    public ArrayList<Contacto> getCorrectos() {
        return correctos;
    }

    public ArrayList<Contacto> getIncorrectos() {
        return incorrectos;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
}
