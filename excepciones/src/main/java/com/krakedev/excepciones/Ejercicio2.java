package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
 
	
	  public void metodo1() {
		  
		  String a=null;
		   a.substring(0); // EXCEPTION NOT CHECKED
		   
	  }

     public void metodo2() {
    	 File f= new File("archivo1.txt");
    	 try {
    	 f.createNewFile(); ///CHECKED IOEXCEPTION
    	 }catch(Exception e) {
    		 System.out.println("Ocurre exception");

    	 }
     }
     public void metodo3() throws IOException {
    	 File f= new File("archivo1.txt");
    	 
    	 f.createNewFile(); ///CHECKED IOEXCEPTION
    
     }
     public void metodo4() {
    	 
     }
}
