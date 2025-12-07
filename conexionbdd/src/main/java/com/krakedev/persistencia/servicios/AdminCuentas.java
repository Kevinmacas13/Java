package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuentas;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminCuentas {
    private static final Logger LOGGER = LogManager.getLogger(AdminCuentas.class);

    // INSERTAR
    public static void insertar(Cuentas cuenta) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement(
                "INSERT INTO cuentas (numero_cuenta, cedula_propietario, fecha_creacion, saldo) VALUES (?,?,?,?)"
            );
            ps.setString(1, cuenta.getNumero_cuenta());
            ps.setString(2, cuenta.getUsuario().getCedula()); 
            ps.setDate(3, new Date(cuenta.getFecha_creacion().getTime()));
            ps.setBigDecimal(4, cuenta.getSaldo());

            ps.executeUpdate();
        } catch (Exception e) {
            LOGGER.error("Error al insertar cuenta", e);
            throw e;
        } finally {
            try {
                con.close();
                System.out.println("Se cerró conexión");
            } catch (SQLException e) {
                LOGGER.error("Error de infraestructura", e);
                throw new Exception("Error en la base de datos");
            }
        }
    }

    // ACTUALIZAR
    public static void actualizar(Cuentas cuenta) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement(
                "UPDATE cuentas SET  cedula_propietario=?, fecha_creacion=?, saldo=? WHERE numero_cuenta=?"
            );
            ps.setString(1, cuenta.getUsuario().getCedula());
            ps.setDate(2, new Date(cuenta.getFecha_creacion().getTime()));
            ps.setBigDecimal(3, cuenta.getSaldo());
            ps.setString(4, cuenta.getNumero_cuenta());

            ps.executeUpdate();
            System.out.println("Cuenta actualizada correctamente");
        } catch (Exception e) {
            LOGGER.error("Error al actualizar cuenta", e);
            throw e;
        } finally {
            try {
                con.close();
                System.out.println("Se cerró conexión");
            } catch (SQLException e) {
                LOGGER.error("Error de infraestructura", e);
                throw new Exception("Error en la base de datos");
            }
        }
    }

    // ELIMINAR
    public static void eliminar(String numeroCuenta) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = ConexionBDD.conectar();
            ps = con.prepareStatement("DELETE FROM cuentas WHERE numero_cuenta=?");
            ps.setString(1,numeroCuenta);

            ps.executeUpdate();
            System.out.println("Cuenta eliminada correctamente");
        } catch (Exception e) {
            LOGGER.error("Error al eliminar cuenta", e);
            throw e;
        } finally {
            try {
                con.close();
                System.out.println("Se cerró conexión");
            } catch (SQLException e) {
                LOGGER.error("Error de infraestructura", e);
                throw new Exception("Error en la base de datos");
            }
        }
    }
}