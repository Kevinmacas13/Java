package com.krakedev.excepciones;

public class Ejercicio1 {
    
    public static void main(String[] args) {
    	
    	String a=null;
System.out.println("Imprime incio");
    	
    	try {
    		a.substring(3);
    		System.out.println("ABRE CONEXIÓN: ");
    	}catch(Exception e) {
    		System.out.println("Error");
    		
    	}finally {
    	    System.out.println("Cerra conexión");
    		System.out.println("Llegue al finally");
    
    	}
    
    	System.out.println("Fuera del catch");
    	
    }
}
