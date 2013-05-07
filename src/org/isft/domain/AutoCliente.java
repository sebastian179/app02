package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 07-may-2013 02:15:32 a.m.
 */
public class AutoCliente {

	private Cliente Cliente;
	private Auto Patente;
	private Poliza Poliza;
	

	public AutoCliente(){

	}

	public void finalize() throws Throwable {

	}

	public Cliente getCliente(){
		return Cliente;
	}

	public Auto getPatente(){
		return Patente;
	}

	public Poliza getPoliza(){
		return Poliza;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCliente(Cliente newVal){
		Cliente = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPatente(Auto newVal){
		Patente = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPoliza(Poliza newVal){
		Poliza = newVal;
	}

}