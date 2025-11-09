package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private ArrayList<Telefono> telefonos;

    public Contacto(String cedula, String nombre, String apellido) {
        this.telefonos = new ArrayList<Telefono>();
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void agregarTelefono(Telefono telefono) {

        telefonos.add(telefono);
    }
    public ArrayList<Telefono> recuperarIncorrectos() {
         ArrayList<Telefono> telefonosIncorrectos= new ArrayList<Telefono>();
        for (int i = 0; i < telefonos.size(); i++) {
            if (telefonos.get(i) != null) {
                if(telefonos.get(i).getEstado().equals("E")) {
                   telefonosIncorrectos.add(telefonos.get(i));
                }
            }
        }
        return telefonosIncorrectos;
    }

    public void mostrarTelefonos() {
        System.out.println("Teléfonos con estado C");
        for (int i = 0; i < telefonos.size(); i++) {
            if (telefonos.get(i) != null) {
                if(telefonos.get(i).getEstado().equals("C")) {
                    System.out.println("Número: " + this.telefonos.get(i).getNumero() + " Tipo: " + telefonos.get(i).getTipo());
                }

            }
        }
    }

    public void imprimir() {
        System.out.println("Información del Contacto: ");
        System.out.println("Cédula: " + this.cedula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        if (this.direccion != null) {
            System.out.println("Direccion: ");
            System.out.println("  Calle Principal: " + this.direccion.getCallePrincipal());
            System.out.println("  Calle Secundaria: " + this.direccion.getCalleSecundaria());
        } else {
            System.out.println("No tiene asociada una dirección");
        }

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
}
