package com.krakedev.persistencia.servicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;



public class AdminPersonas {
	private  static Logger LOGGER= LogManager.getLogger(AdminPersonas.class);
	public static void insertar(Persona persona) throws Exception {
		Connection con= null;
		PreparedStatement ps=null;
		try {
			con= ConexionBDD.conectar();
			ps=con.prepareStatement("insert into persona (cedula, nombre, apellido, estatura, codigo_estado_civil, fecha_nacimiento, cantidad_ahorrada, numero_hijos, hora_nacimiento)"
					+ "values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,persona.getCedula());
			ps.setString(2,persona.getNombre());
			ps.setString(3,persona.getApellido());
			ps.setDouble(4, persona.getEstatura());
			ps.setString(5, persona.getEstado_civil().getCodigo());
	    	long fechaMilis= persona.getFecha_nacimiento().getTime();
	      	long horaMilis= persona.getHora_nacimiento().getTime();
	    	java.sql.Time timeSQL= new java.sql.Time(horaMilis);
	        java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
			ps.setDate(6, fechaSQL);
			ps.setBigDecimal(7,persona.getCantidadAhorrada());
			ps.setInt(8, 2);
			ps.setTime(9, timeSQL);
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw e;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error en la base de datos",e);
				throw new Exception("Error en la base de datos");
			}
			}
		
		
	}
	
	public static void actualizar(Persona persona)  throws Exception{
		Connection con= null;
		PreparedStatement ps=null;
		
		try {
			con= ConexionBDD.conectar();
			ps = con.prepareStatement(
				    "update persona set nombre=?, apellido=?, estatura=?, codigo_estado_civil=?, fecha_nacimiento=?, cantidad_ahorrada=?, numero_hijos=?, hora_nacimiento=? WHERE cedula=?"
				);
			ps.setString(1,persona.getNombre());
			ps.setString(2,persona.getApellido());
			ps.setDouble(3, persona.getEstatura());
			ps.setString(4, persona.getEstado_civil().getCodigo());
			
			long fechaMilis= persona.getFecha_nacimiento().getTime();
	      	long horaMilis= persona.getHora_nacimiento().getTime();

	    	 java.sql.Time timeSQL= new java.sql.Time(horaMilis);
	    	 java.sql.Date fechaSQL=new java.sql.Date(fechaMilis);
	    	 
			ps.setDate(5, fechaSQL);
			ps.setBigDecimal(6,persona.getCantidadAhorrada());
			ps.setInt(7, 2);
			ps.setTime(8,timeSQL);
			ps.setString(9,persona.getCedula());
			
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
		     throw e;
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
	
				LOGGER.error("Error en la base de datos",e);
				throw new Exception("Error en la base de datos");
			}
			}
		
	}
	
	
	public static void eliminar(String cedula) throws Exception {
		Connection con= null;
		PreparedStatement ps=null;
		try {
			con= ConexionBDD.conectar();
			ps=con.prepareStatement("delete from persona where cedula=?");
			ps.setString(1,cedula);
			ps.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw e;
		}finally {

			try {
				con.close();
			} catch (SQLException e) {
		
				LOGGER.error("Error en la base de datos",e);
				throw new Exception("Error en la base de datos");
			}
			}
		
	}
	
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBusqueda) throws Exception {
	    ArrayList<Persona> personas = new ArrayList<Persona>();
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        con = ConexionBDD.conectar();
	        ps = con.prepareStatement("SELECT * FROM persona WHERE nombre LIKE ?");
	        ps.setString(1, "%" + nombreBusqueda + "%"); 

	        rs = ps.executeQuery();
	        while (rs.next()) {
	            Persona p = new Persona(
	                rs.getString("cedula"),
	                rs.getString("nombre"),
	                rs.getString("apellido"),
	                rs.getDouble("estatura"),
	                new EstadoCivil(rs.getString("codigo_estado_civil"),""),
	                rs.getDate("fecha_nacimiento"),
	                rs.getTime("hora_nacimiento"),
	                rs.getBigDecimal("cantidad_ahorrada"),
	                rs.getInt("numero_hijos")
	            );
	            personas.add(p);
	        }
	    } catch (Exception e) {
	        LOGGER.error("Error al consultar por nombre", e);
	        throw new Exception("Error al consultar por nombre");
	    } finally {
	        try {
	            con.close();
	            System.out.println("Se cerró conexión");
	        } catch (SQLException e) {
	            LOGGER.error("Error con la base de datos", e);
	            throw new Exception("Error con la base de datos");
	        }
	    }

	    return personas;
	}
	
	
	public static Persona buscarPorNombrePrimario(String nombreBusqueda) throws Exception {
	    Persona persona = null;
	    Connection con = null;
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        con = ConexionBDD.conectar();
	        ps = con.prepareStatement("SELECT * FROM persona WHERE nombre = ?");
	        ps.setString(1, nombreBusqueda); 

	        rs = ps.executeQuery();
	        if(rs.next()) {
	            Persona p = new Persona(
		                rs.getString("cedula"),
		                rs.getString("nombre"),
		                rs.getString("apellido"),
		                rs.getDouble("estatura"),
		                new EstadoCivil(rs.getString("codigo_estado_civil"),""),
		                rs.getDate("fecha_nacimiento"),
		                rs.getTime("hora_nacimiento"),
		                rs.getBigDecimal("cantidad_ahorrada"),
		                rs.getInt("numero_hijos")
		            );
	            persona=p;
	        	
	        }
	 
	 
	    } catch (Exception e) {
	        LOGGER.error("Error al consultar por nombre", e);
	        throw new Exception("Error al consultar por nombre");
	    } finally {
	        try {
	            con.close();
	            System.out.println("Se cerró conexión");
	        } catch (SQLException e) {
	            LOGGER.error("Error con la base de datos", e);
	            throw new Exception("Error con la base de datos");
	        }
	    }

	    return persona;
	}


}
