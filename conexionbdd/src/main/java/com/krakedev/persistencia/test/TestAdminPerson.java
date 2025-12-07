package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPerson {

	public static void main(String[] args) {
		
	try {
	         Date fechaNacimiento = Convertidor.convertirFecha("1995/05/10");
	         Date horaNacimiento  = Convertidor.convertirHora("08:10");
	         EstadoCivil estadoCivil= new EstadoCivil("S","soltero");
	         
	         Persona persona = new Persona("153245698","Pedro","Torres", 1.75,
                     estadoCivil,fechaNacimiento,horaNacimiento,
                     new BigDecimal("1500.50"),2);  
	         AdminPersonas.insertar(persona);
	         System.out.println("Se crea la persona");
	         
	}	 
	 catch (Exception e) {
		        System.out.println(e.getMessage());
				e.printStackTrace();
				
			}


}
}
