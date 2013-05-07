package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 07-may-2013 02:15:33 a.m.
 */
public class AccidenteSiniestro {

	private Siniestro Codigo;
	private Accidente Fecha_hora_accidente;


	public AccidenteSiniestro(){

	}

	public void finalize() throws Throwable {

	}

	public Siniestro getCodigo(){
		return Codigo;
	}

	public Accidente getFechaHoraAccidente(){
		return Fecha_hora_accidente;
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
	public void setFechaHoraAccidente(Accidente newVal){
		Fecha_hora_accidente = newVal;
	}

}