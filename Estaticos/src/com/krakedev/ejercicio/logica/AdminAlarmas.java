package com.krakedev.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas;
	public AdminAlarmas() {
		this.alarmas= new ArrayList<Alarma>();
	}
	public void agregarAlarma(Alarma alarma) {
		this.alarmas.add(alarma);
		
	}
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}


}
