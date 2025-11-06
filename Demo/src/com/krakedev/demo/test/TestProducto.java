package com.krakedev.demo.test;
import  com.krakedev.demo.Producto;
public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1= new Producto(1,"Zapatos");
		producto1.setDescripcion("Buen Estado");
		producto1.setPeso(5);
		
		//Imprimimos el objeto
		System.out.println("Codigo: "+producto1.getCodigo());
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Peso: "+producto1.getPeso());

	}

}
