package br.com.apiiot.bo;

import java.util.Random;

import br.com.apiiot.bean.Arduino;
import br.com.apiiot.bean.Estado;



public class ArduinoBO {
	
	
	private static ArduinoBO arduinoBo;
	private static Arduino sensor;
	
	Random rand = new Random();
	
	public static ArduinoBO getInstance() {
		if(arduinoBo == null) {
			arduinoBo = new ArduinoBO();
		}
		return arduinoBo;
	}
	
	
	
	public ArduinoBO(){
		
		sensor = new Arduino(rand.nextInt(200), rand.nextInt(200), Estado.LIGADO, Estado.DESLIGADO);
		
		
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
	
	public Arduino obterBuzzer(Estado buzzer){
		if(buzzer == Estado.LIGADO) {
			sensor.setBuzzer(buzzer);
			return sensor;
		}else {
			sensor.setBuzzer(buzzer);
			return sensor;
		}		
	}
	
	

}
