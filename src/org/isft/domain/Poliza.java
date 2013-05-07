package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 07-may-2013 02:15:27 a.m.
 */
public class Poliza {

	private int Nro_poliza;
	private String Periodo_vigencia;
	private int Suma_asegurada;

	public Poliza(){

	}

	public void finalize() throws Throwable {

	}

	public int getNroPoliza(){
		return Nro_poliza;
	}

	public varchar getPeriodoVigencia(){
		return Periodo_vigencia;
	}

	public int getSumaAsegurada(){
		return Suma_asegurada;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNroPoliza(int newVal){
		Nro_poliza = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPeriodoVigencia(varchar newVal){
		Periodo_vigencia = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSumaAsegurada(int newVal){
		Suma_asegurada = newVal;
	}

}