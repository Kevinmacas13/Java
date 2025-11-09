package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private ArrayList<Nota> notas;


    public Estudiante(String cedula,String nombre, String apellido) {
        this.notas = new ArrayList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public void agregarNota(Nota nota) {
        for (int i = 0; i < this.notas.size(); i++) {
            if (this.notas.get(i).getMateria().getCodigo().equals(nota.getMateria().getCodigo())) {
                System.out.println("Nota repetida");
                return;
            }
            }
        if (nota.getCalificacion() >= 0 && nota.getCalificacion() <= 10) {
            notas.add(nota);
        }
    }



    public void modificarNota(String codigo, double nuevaNota) {
        boolean existeNota = false;
        boolean notaValida = false;
        for (int i = 0; i < this.notas.size(); i++) {
            if (this.notas.get(i).getMateria().getCodigo().equals(codigo)) {
                existeNota = true;
                if (nuevaNota >= 0 && nuevaNota <= 10) {
                    notaValida = true;
                    this.notas.get(i).setCalificacion(nuevaNota);

                }
            }
        }
        if(!existeNota){
            System.out.println("No encontró el código");
        }
        if(!notaValida && existeNota){
            System.out.println("Nota no permitida");
        }


    }

    public double calcularPromedioNotasEstudiante() {
        double total = 0;
        double promedio = 0;
        for (int i = 0; i < this.notas.size(); i++) {
            total += this.notas.get(i).getCalificacion();
        }
        promedio = total / this.notas.size();
        return promedio;
    }

    public void mostrar() {
        System.out.print("Estudiante: [nombre=" + this.nombre + " apellido=" + this.apellido + " cedula=" + this.cedula);
        for (int i = 0; i < this.notas.size(); i++) {
            System.out.print(" materia código=" + this.notas.get(i).getMateria().getCodigo());
            System.out.print(" materia=" + this.notas.get(i).getMateria().getNombre());
            System.out.print(" nota=" + this.notas.get(i).getCalificacion());
        }
        System.out.print("]");
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
}
