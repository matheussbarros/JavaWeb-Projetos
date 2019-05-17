package br.com.apiiot.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.apiiot.bean.Arduino;
import br.com.apiiot.bean.Estado;
import br.com.apiiot.bo.ArduinoBO;

@Path("/arduino")
public class ArduinoResource {
	
	private ArduinoBO arduinoBO = ArduinoBO.getInstance();
	
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Arduino> buscar(){
		return arduinoBO.listar();
	}
	
	
	@GET
	@Path("/{estado}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Arduino> mudarEstado(@PathParam("estado") Estado e){
		return arduinoBO.mudarEstado(e);
	}
	

}
