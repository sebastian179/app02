package org.isft.domain;

/**
 * @version 1.0
 * @created 07-may-2013 02:15:24 a.m.
 */
public class Configuracion {

	private double Gasto_administrativo;
	private int id;
	private double Impuestos;

	public Configuracion(){

	}

	public void finalize() throws Throwable {

	}

	public double getGastoAdministrativo(){
		return Gasto_administrativo;
	}

	public int getId(){
		return id;
	}

	public double getImpuestos(){
		return Impuestos;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setGastoAdministrativo(double newVal){
		Gasto_administrativo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setId(int newVal){
		id = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setImpuestos(double newVal){
		Impuestos = newVal;
	}

}