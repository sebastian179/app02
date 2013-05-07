package org.isft.domain;

/**
 * @version 1.0
 * @created 07-may-2013 02:15:21 a.m.
 */
public class Cobertura {

	private Siniestro Codigo;
	private Poliza Poliza;
	private double Premio;
	private double Prima;


	public Cobertura(){

	}

	public void finalize() throws Throwable {

	}

	public Siniestro getCodigo(){
		return Codigo;
	}

	public Poliza getNroPoliza(){
		return Poliza;
	}

	public double getPremio(){
		return Premio;
	}

	public double getPrima(){
		return Prima;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCodigo(Siniestro newVal){
		Codigo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroPoliza(Poliza newVal){
		Poliza = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPremio(double newVal){
		Premio = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPrima(double newVal){
		Prima = newVal;
	}

}