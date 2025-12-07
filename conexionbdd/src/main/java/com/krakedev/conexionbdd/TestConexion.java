package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class TestConexion {

	public static void main(String[] args) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/ejercicios","postgres","passwordsqlpos");		
			System.out.println("Se conectó");
		     SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		     String fechaStr="2020/03/22 10:05:04";
		     Date fecha1=null;
		     
		     try{
		    	 Date fecha= sdf.parse(fechaStr);
		    	 System.out.println(fecha);
		    	 long fechaMilis= fecha.getTime();
		    	 System.out.println(fechaMilis);
		    	 java.sql.Time timeSQL= new java.sql.Time(fechaMilis);
		    	 java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
		         System.out.println("Fecha SQL"+ fechaSQL +" "+ timeSQL);
		         
		     }catch(ParseException e) {
		    	 
		    	 e.printStackTrace();
		    	 
		    	 
		     }
		     

				ps=connection.prepareStatement("insert into proveedor(codigo,nombre,telefono)"
						+ "values(?,?,?)");
				ps.setInt(1,15);
				ps.setString(2,"co");
				ps.setString(3,"1234521362");
				ps.executeUpdate();
				System.out.println("ejecuta insert");
				
			
	

			} 
		catch ( ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		

	}

}
