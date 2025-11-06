package com.krakedev;
public class TestPersona {
	public static void main(String[] args) {
		Persona p; //Declaro variable persona
        Persona p2;//Declaro variable persona
        p = new Persona(); //Instancio objeto persona
        p2= new Persona(); // Instanacio objeto persona
        //Modificar atributos
        p.setNombre("Kevin");
        p.setEdad(20);
        p2.setNombre("Vicky");
        p2.setEdad(15);
        //Acceder atributos
		System.out.println("Primera persona"+ p.getNombre() + " edad: "+ p.getEdad());
        System.out.println("Segunda persona "+ p2.getNombre() + " edad: "+ p2.getEdad());
        
	}

}
