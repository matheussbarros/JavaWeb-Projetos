package br.com.apiiot.bo;

import java.util.ArrayList;
import java.util.List;


import br.com.apiiot.bean.Arduino;
import br.com.apiiot.bean.Estado;



public class ArduinoBO {
	
	
	private static ArduinoBO arduinoBo;
	private static ArrayList<Arduino> lista = new ArrayList<>();
	
	public static ArduinoBO getInstance() {
		if(arduinoBo == null) {
			arduinoBo = new ArduinoBO();
		}
		return arduinoBo;
	}
	
	
	
	public ArduinoBO(){
		
		lista.add(new Arduino(40.0, 50.0, Estado.LIGADO));
	
	}
	
	
	public List<Arduino> listar(){
		return lista;	
	}
	
	public List<Arduino> mudarEstado(Estado estado){
		lista.add(new Arduino(40.0, 50.0, estado));
		return lista;	
	}
	
	

}
