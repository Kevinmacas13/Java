package como.krakedev.composicion.test;

import como.krakedev.composicion.Persona;
import como.krakedev.composicion.Direccion;
public class TestPersona {
    public static void main(String[] args)
    {
        Persona p1 = new Persona();
        p1.setNombre("Kevin");
        p1.setApellido("Macas");
        String nombre= p1.getNombre();
        Direccion dir;
        dir=new Direccion();
        dir.setCallePrincial("Av Siempre vida");
        dir.setCalleSecundaria("La que cruza");
        dir.setNumero("N47");
        dir.setLatitud(1);
        dir.setLongitud(1);
        p1.setDireccion(dir);
        Direccion direccion=  p1.getDireccion();

        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion.getCallePrincial());
        //null .algun Método
        p1.imprimir();


        Persona p2 = new Persona();
        Direccion direccion2= new Direccion("AV shirys","Eloy ALFARO","S/N");
        p2.setNombre("Anastacia");
        p2.setDireccion(direccion2);
        Persona p3 = new Persona();
        p3.setNombre("Anastacia");
        p3.setDireccion(new Direccion("AV shirys","Eloy ALFARO","S/N"));
    }
}
