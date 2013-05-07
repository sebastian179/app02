package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 07-may-2013 02:15:36 a.m.
 */
public class Auto {

	private String Color;
	private String Marca;
	private String Modelo;

	private String Patente;
	private String Tipo;

	public Auto(){

	}

	public void finalize() throws Throwable {

	}

	public String getColor(){
		return Color;
	}

	public String getMarca(){
		return Marca;
	}

	public String getModelo(){
		return Modelo;
	}

	public int getNroChasis(){
		return Nro_chasis;
	}

	public int getNroMotor(){
		return Nro_motor;
	}

	public String getPatente(){
		return Patente;
	}

	public String getTipo(){
		return Tipo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setColor(String newVal){
		Color = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setMarca(String newVal){
		Marca = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setModelo(String newVal){
		Modelo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroChasis(int newVal){
		Nro_chasis = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroMotor(int newVal){
		Nro_motor = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPatente(String newVal){
		Patente = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTipo(String newVal){
		Tipo = newVal;
	}

}