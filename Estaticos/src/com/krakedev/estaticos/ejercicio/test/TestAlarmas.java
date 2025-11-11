package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.ejercicio.entidades.Alarma;
import com.krakedev.ejercicio.logica.AdminAlarmas;
import com.krakedev.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		 Alarma alarma1 = new Alarma(DiasSemana.LUNES,10,45);
		 Alarma alarma2 = new Alarma(DiasSemana.MARTES,10,5);
		 Alarma alarma3 = new Alarma(DiasSemana.SABADO,8,10);
		 Alarma alarma4 = new Alarma(DiasSemana.DOMINGO,7,30);
		 AdminAlarmas admin= new AdminAlarmas();
		 //agregar alarmas
		 ArrayList<Alarma> alarmasActuales = admin.getAlarmas();
		 System.out.println(alarmasActuales);
		 
		 alarmasActuales.add(alarma1);
		 alarmasActuales.add(alarma2);
		 alarmasActuales.add(alarma3);
		 alarmasActuales.add(alarma4);
		 System.out.println(alarmasActuales);
	    
		 
		 
		 
		

	}

}
