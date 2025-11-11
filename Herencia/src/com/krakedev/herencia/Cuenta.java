package com.krakedev.herencia;

public class Cuenta extends Persona{
	private String numeroCuenta;
	private double saldo;
	
	public Cuenta(String cedula, String nombre, String numeroCuenta, int saldo) {
	    super(cedula, nombre);
	    this.numeroCuenta = numeroCuenta;
	    this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Cuenta: [Numero de cuenta="+this.numeroCuenta+" Saldo="+this.saldo+"]";
		
	}
	

}
