package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import com.krakedev.persistencia.utils.ConexionBDD;
import com.krakedev.persistencia.utils.Convertidor;

public class TestPersona {

	public static void main(String[] args) {

		PreparedStatement ps=null;
		     try{
				 String fechaStr="2020/03/22";
				 String HoraStr="08:10";
		    	 Date fecha = Convertidor.convertirFecha(fechaStr);
		    	 Date hora=  Convertidor.convertirHora(HoraStr);
		    	 long fechaMilis= fecha.getTime();
		    	 long horaMilis= hora.getTime();
		    	 java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
		    	 java.sql.Time timeSQL= new java.sql.Time(horaMilis);
		    	 
		         ps=ConexionBDD.conectar().prepareStatement("insert into persona (cedula, nombre, apellido, estatura, codigo_estado_civil, fecha_nacimiento, cantidad_ahorrada, numero_hijos, hora_nacimiento)"
		  							+ "values(?,?,?,?,?,?,?,?,?)");
		     	ps.setString(1,"1234567890");
				ps.setString(2,"Pedro");
				ps.setString(3,"Torres");
				ps.setDouble(4,1.75);
				ps.setString(5,"S");
				ps.setDate(6,fechaSQL);
				ps.setBigDecimal(7,new BigDecimal(3));
				ps.setInt(8, 2);
				ps.setTime(9,timeSQL);
				
				ps.executeUpdate();
				System.out.println("ejecuta insert 1");
				
					

		     }
		 
			catch ( SQLException e) {
				e.printStackTrace();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
