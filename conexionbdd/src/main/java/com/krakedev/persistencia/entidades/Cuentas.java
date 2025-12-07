package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Cuentas {
	private String numero_cuenta;
	private Usuario usuario;
	private Date fecha_creacion;
	private BigDecimal saldo;
	
	public Cuentas(String numero_cuenta) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.usuario = usuario;
		this.fecha_creacion = fecha_creacion;
		this.saldo = saldo;
	}
	
	
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getFecha_creacion() {
		return fecha_creacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	
	
	

}
