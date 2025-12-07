package com.krakedev.excepciones;

public class App {
    
    public static void main(String[] args) {
    	
    	String a=null;
System.out.println("Imprime incio");
    	
    	try {
    		a.substring(3);
    		System.out.println("");
    	}catch(Exception e) {
    		System.out.println("Error");
    		
    	}finally {
    		System.out.println("Llegue");
    	}
    }
    
}
