package br.com.apiiot.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;




public class Arduino implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double humidade;
	private double luminosidade;
	private Estado led;
	
	
	
	
	public Arduino() {
	
	}




	public Arduino(double humidade, double luminosidade, Estado led) {
		super();
		this.humidade = humidade;
		this.luminosidade = luminosidade;
		this.led = led;
	}




	public double getHumidade() {
		return humidade;
	}




	public void setHumidade(double humidade) {
		this.humidade = humidade;
	}




	public double getLuminosidade() {
		return luminosidade;
	}




	public void setLuminosidade(double luminosidade) {
		this.luminosidade = luminosidade;
	}




	public Estado getLed() {
		return led;
	}




	public void setLed(Estado led) {
		this.led = led;
	}


	
	
	
	

}
