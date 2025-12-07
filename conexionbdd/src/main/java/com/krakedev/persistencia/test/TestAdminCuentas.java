package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminCuentas;
import com.krakedev.persistencia.servicios.AdminUsuarios;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminCuentas {
	
	public static void main(String[] args) {
		 
		    try{
		    	 String fechaStr="2020/03/22";
		    	 Date fecha= Convertidor.convertirFecha(fechaStr);
		    	 Usuario miUsuario = new Usuario("17524", "Kevin", "Macas", "Corriente", 15.5);
		    	 Cuentas miCuenta= new Cuentas("17520");
		    	 miCuenta.setUsuario(miUsuario);
		    	 miCuenta.setSaldo(new BigDecimal("13.4"));
		    	 miCuenta.setFecha_creacion(fecha);

		    	 AdminUsuarios.insertar(miUsuario);		    	 
		    	 System.out.println("Mi usuario se creó");
		    	 
		    	 AdminCuentas.insertar(miCuenta);
		    	 System.out.println("Mi cuenta se insertó");
		    	 
		    	 String fechaStr2="2020/03/22";
		    	 Date fecha2= Convertidor.convertirFecha(fechaStr2);
		    	 miCuenta.setSaldo(new BigDecimal("18.5"));
		    	 miCuenta.setFecha_creacion(fecha2);
		    	 
		    	 AdminCuentas.actualizar(miCuenta);
		    	 System.out.println("Mi cuenta se actualizó");
		       	 
		    	 AdminCuentas.eliminar("17520");
		    	 System.out.println("Mi cuenta se eliminó");

		   }
		   catch (Exception e) {
			    System.out.println(e.getMessage());
				e.printStackTrace();
			};
		 
		    
	
}
	
}
