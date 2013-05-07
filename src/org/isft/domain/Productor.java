package org.isft.domain;

/**
 * @version 1.0
 * @created 07-may-2013 02:15:26 a.m.
 */
public class Productor {

	private int id_productor;
	private int Nro_matricula;

	public Productor(){

	}

	public void finalize() throws Throwable {

	}

	public int getIdProductor(){
		return id_productor;
	}

	public int getNroMatricula(){
		return Nro_matricula;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setIdProductor(int newVal){
		id_productor = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroMatricula(int newVal){
		Nro_matricula = newVal;
	}

}