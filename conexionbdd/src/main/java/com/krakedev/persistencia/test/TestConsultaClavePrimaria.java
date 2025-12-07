package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaClavePrimaria {

	public static void main(String[] args) {
		try {
		
			Persona personaEncontrada= AdminPersonas.buscarPorNombrePrimario("Pedro");
			System.out.println(personaEncontrada);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
				
			}

	}

}
