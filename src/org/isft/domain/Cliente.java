package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 07-may-2013 02:15:34 a.m.
 */
public class Cliente {

	private String Apellido;
	private String Domicilio;
	private String Fecha_nacimiento;
	private String Nombre;
	private int Nro_cliente;
	private int Nro_licencia;

	public Cliente(){

	}

	public void finalize() throws Throwable {

	}

	public String getApellido(){
		return Apellido;
	}

	public String getDomicilio(){
		return Domicilio;
	}

	public String getFechaNacimiento(){
		return Fecha_nacimiento;
	}

	public String getNombre(){
		return Nombre;
	}

	public int getNroCliente(){
		return Nro_cliente;
	}

	public int getNroLicencia(){
		return Nro_licencia;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setApellido(String newVal){
		Apellido = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDomicilio(String newVal){
		Domicilio = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFechaNacimiento(String newVal){
		Fecha_nacimiento = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNombre(String newVal){
		Nombre = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroCliente(int newVal){
		Nro_cliente = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroLicencia(int newVal){
		Nro_licencia = newVal;
	}

}