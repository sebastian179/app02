package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 07-may-2013 02:15:31 a.m.
 */
public class Accidente {

	private String Fecha_accidente;
	private String Fecha_hora_accidente;
	private String Lugar;

	public Accidente(){

	}

	public void finalize() throws Throwable {

	}

	public String getFechaAccidente(){
		return Fecha_accidente;
	}

	public String getFechaHoraAccidente(){
		return Fecha_hora_accidente;
	}

	public String getLugar(){
		return Lugar;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFechaAccidente(String newVal){
		Fecha_accidente = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFechaHoraAccidente(String newVal){
		Fecha_hora_accidente = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLugar(String newVal){
		Lugar = newVal;
	}

}