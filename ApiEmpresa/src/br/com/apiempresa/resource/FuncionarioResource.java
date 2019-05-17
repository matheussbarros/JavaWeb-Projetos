package br.com.apiempresa.resource;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.apiempresa.bean.Funcionario;
import br.com.apiempresa.bo.FuncionarioBO;

@Path("/funcionario")
public class FuncionarioResource {

	private FuncionarioBO funcBo = FuncionarioBO.getInstance(); 
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Funcionario> buscar(){
		return funcBo.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Funcionario buscar(@PathParam("id") int codigo) {
		return funcBo.consultarFuncionario(codigo);
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Funcionario funcionario, @Context UriInfo uriInfo) {
		funcBo.cadastrar(funcionario);
		System.out.println(funcionario.getId());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCargo());
		System.out.println(funcionario.getSetor());
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(funcionario.getId()));
		return Response.created(builder.build()).build();
	}
	
	@DELETE
	@Path("/{id}")
	public void remover (@PathParam("id") int codigo) {
		funcBo.remover(codigo);
	}
	
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Funcionario func, @PathParam("id") int codigo) {
		
		func.setId(codigo);
		funcBo.atualizar(func);
		return Response.ok().build();
	}
	
	
	
	
}
