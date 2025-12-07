package com.krakedev.persistencia.servicios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminUsuarios {
	
	private  static Logger LOGGER= LogManager.getLogger(AdminUsuarios.class);
	public static void insertar(Usuario usuario) throws Exception {
		Connection con= null;
		PreparedStatement ps=null;
		try {
			con= ConexionBDD.conectar();
			ps=con.prepareStatement("insert into  usuario (cedula, nombre, apellido, tipo_cuenta, limite_credito)"
					+ "values(?,?,?,?,?)");
			ps.setString(1,usuario.getCedula());
			ps.setString(2,usuario.getNombre());
			ps.setString(3 , usuario.getApellido());
			ps.setString(4, usuario.getTipo_cuenta());
			ps.setDouble(5, usuario.getLimite_credito());
			ps.executeUpdate();
		
		} catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw e;
		}finally {
			System.out.println("Se cerró conexión");
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error de infraestructura",e);
				throw new Exception("Error de infraestructura");
			}
			}
		
		
	}
	
	public static void actualizar(Usuario usuario) throws Exception {

		Connection con= null;
		PreparedStatement ps=null;
		try {
			con= ConexionBDD.conectar();
			ps = con.prepareStatement(
				    "update usuario set nombre=?, apellido=?, tipo_cuenta=?, limite_credito=? WHERE cedula=?"
				);

			ps.setString(1,usuario.getNombre());
			ps.setString(2,usuario.getApellido());
			ps.setString(3, usuario.getTipo_cuenta());
			ps.setDouble(4, usuario.getLimite_credito());
			ps.setString(5, usuario.getCedula());
			ps.executeUpdate();
		} catch (Exception e) {
			
			LOGGER.error("Error al insertar",e);
			throw e;
		}finally {
			System.out.println("Se cerró conexión");
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error de infraestructura",e);
				throw new Exception("Error en la base de datos");
			}
			}
		
	}
	
	
	public static void eliminar(Usuario usuario) throws Exception{
		Connection con= null;
		PreparedStatement ps=null;
		   		
		try {
			con= ConexionBDD.conectar();
			ps=con.prepareStatement("delete from persona where cedula=?");
			ps.setString(1,usuario.getCedula());
			ps.executeUpdate();
			System.out.println("ejecuta eliminar");
		}  catch (Exception e) {
			LOGGER.error("Error al insertar",e);
			throw e;
		}finally {
			System.out.println("Se cerró conexión");
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Erroren la base de datos",e);
				throw new Exception("Error en la base de datos");
			}
			}
		
	}


}
