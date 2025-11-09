package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;
    public Curso() {
        this.estudiantes = new ArrayList<>();
    }
    public String buscarEstudiantePorCedula(Estudiante estudiante) {
       for(int i = 0; i < this.estudiantes.size(); i++) {
           if(estudiante==this.estudiantes.get(i)) {
               return "Estudiante encontrado";

           }
       }
       return null;
    }

    public void matricularEstudiante (Estudiante estudiante) {
        String estudianteEncontrado= buscarEstudiantePorCedula(estudiante);
        if(estudianteEncontrado==null) {
            this.estudiantes.add(estudiante);
        }

    }
    public double calcularProdemioCurso(){
       double sumaPromedioCurso=0;
       double promedioCurso=0;
        for (int i = 0; i < this.estudiantes.size(); i++) {
            sumaPromedioCurso+= this.estudiantes.get(i).calcularPromedioNotasEstudiante();
        }
        promedioCurso=sumaPromedioCurso/this.estudiantes.size();
        return promedioCurso;
    }
    public void mostrar(){
        System.out.print("Curso: [");
        for (int i = 0; i < this.estudiantes.size(); i++) {
          this.estudiantes.get(i).mostrar();
        }
        System.out.println("]");
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
