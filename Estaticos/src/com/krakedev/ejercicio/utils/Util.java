package com.krakedev.ejercicio.utils;

public class Util {

	 public static String formatearHora(int numero) {
          
		 String valor = numero+"";
         if(valor.length()==1) {
        	 valor = "0"+valor;
         } 
         return valor;
	 }
	 
	 public static String formatearDia(int dia) {
		 
		 if(dia==0) {
			 return "Lunes";
		 }
		 if(dia==1) {
			 return "Martes";
		 }
		 
		 if(dia==2) {
			 return "Mércoles";
		 }
		 
		 if(dia==3) {
			 return "Jueves";
		 }
		 
		 if(dia==4) {
			 return "Viernes";
		 }
		 
		 if(dia==5) {
			 return "Sábado";
		 }
		 if(dia==6) {
			 return "Domingo";
		 }
		 return "";
	 }
}
