package br.com.apiiot.bo;

import java.util.ArrayList;
import java.util.List;


import br.com.apiiot.bean.Arduino;
import br.com.apiiot.bean.Estado;



public class ArduinoBO {
	
	
	private static ArduinoBO arduinoBo;
	private static Arduino sensor;
	
	public static ArduinoBO getInstance() {
		if(arduinoBo == null) {
			arduinoBo = new ArduinoBO();
		}
		return arduinoBo;
	}
	
	
	
	public ArduinoBO(){
		
		sensor = new Arduino(40.0, 50.0, Estado.LIGADO);
		
		
	}
	
	
//	public List<Arduino> listar(){
//		return lista;	
//	}
	
	
	
	public Arduino buscar() {
		return sensor;
		
	}
	
	
	
	public Arduino obterLed(Estado led){
		if(led == Estado.LIGADO) {
			sensor.setLed(led);
			return sensor;
		}else {
			sensor.setLed(led);
			return sensor;
		}		
	}
	
	

}
