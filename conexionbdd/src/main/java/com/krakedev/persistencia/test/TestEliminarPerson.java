package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminarPerson {
	public static void main(String[] args) {
		
		try {
	       String cedula= "153245698";
	         AdminPersonas.eliminar(cedula);
	         System.out.println("Se elimina la cedula");
	         
	}	 
	 catch (Exception e) {
		        System.out.println(e.getMessage());
				e.printStackTrace();
				
			}
		
	}

}
