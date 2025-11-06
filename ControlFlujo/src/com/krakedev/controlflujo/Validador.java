package com.krakedev.controlflujo;

public class Validador {
 public void validadEdad(int edad){
     if(edad>=18){
         System.out.println("Es mayor de edad");
     }else if(edad>=12 && edad<18){
         System.out.println("Adolescente");
     }else if(edad>0 && edad<12){
         System.out.println("Niño");
     }else {
         System.out.println("Edad incorrecta");
     }
     }
 }


