package com.krakedev;
public class TestPersona {
	public static void main(String[] args) {
		Persona p; //Declaro variable persona
        Persona p2;//Declaro variable persona
        p = new Persona(); //Instancio objeto persona
        p2= new Persona(); // Instanacio objeto persona
        //Modificar atributos
        p.nombre = "Kevin";
        p.edad = 20;
        p2.nombre="Vicky";
        p2.edad=15;
        //Acceder atributos
		System.out.println("Primera persona"+ p.nombre + " edad: "+ p.edad);
        System.out.println("Segunda persona "+ p2.nombre + " edad: "+ p2.edad);
        
	}

}
