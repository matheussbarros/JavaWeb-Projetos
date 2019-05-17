package br.com.apiiot.bean;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class Arduino implements Serializable {
	
	
	private double humidade;
	private double luminosidade;
	private Estado estado;
	
	
	
	
	public Arduino() {
	
	}




	public Arduino(double humidade, double luminosidade, Estado estado) {
		super();
		this.humidade = humidade;
		this.luminosidade = luminosidade;
		this.estado = estado;
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




	public Estado getEstado() {
		return estado;
	}




	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
	

}
