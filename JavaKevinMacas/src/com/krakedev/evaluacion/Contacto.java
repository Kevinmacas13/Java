package com.krakedev.evaluacion;

public class Contacto {
    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion direccion;

    public Contacto(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void imprimir() {
        System.out.println("Información del Contacto: " );
        System.out.println("Cédula: " + this.cedula);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Direccion: ");
        System.out.println("  Calle Principal: "+this.direccion.getCallePrincipal());
        System.out.println("  Calle Secundaria: "+this.direccion.getCalleSecundaria());
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
}
