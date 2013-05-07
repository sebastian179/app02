package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 07-may-2013 02:15:29 a.m.
 */
public class Siniestro {

	private int Codigo;
	private String Descripcion;
	private double Valor;

	public Siniestro(){

	}

	public void finalize() throws Throwable {

	}

	public int getCodigo(){
		return Codigo;
	}

	public String getDescripcion(){
		return Descripcion;
	}

	public double getValor(){
		return Valor;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCodigo(int newVal){
		Codigo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setDescripcion(String newVal){
		Descripcion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setValor(double newVal){
		Valor = newVal;
	}

}