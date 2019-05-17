package br.com.apiempresa.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.apiempresa.bean.Funcionario;

public class FuncionarioBO {
	
	private static FuncionarioBO funcionarioBo;
	private static ArrayList<Funcionario> lista = new ArrayList<>();
	
	
	public static FuncionarioBO getInstance() {
		if(funcionarioBo == null) {
			funcionarioBo = new FuncionarioBO();
		}
		return funcionarioBo;
	}
	
	public FuncionarioBO() {
		lista.add(new Funcionario(1,"Maria","Gerente","Produção"));
		lista.add(new Funcionario(2,"Marcos","Lider","Produção"));
		lista.add(new Funcionario(3,"Joana","Analista","Recusos Humanos"));
		lista.add(new Funcionario(4,"João","Junior I","Desenvolvimento"));
		lista.add(new Funcionario(5,"Paula","Diretora","Vendas"));	
	}
	
	public static Funcionario consultarFuncionario(int codigo) {
		for(Funcionario funcionario : lista) {
			if(funcionario.getId() == codigo) {
				return funcionario;
			}
		}
		return null;
	}
	
	public List<Funcionario> listar(){
		return lista;	
	}
	
	
	public void cadastrar(Funcionario funcionario){
		lista.add(funcionario);
	}
	
	
	public void remover(int cod) {
		for(Funcionario func : lista) {
			if(func.getId() == cod){
				lista.remove(func);
				break;
			}
		}	
	}
	
	public void atualizar(Funcionario func) {
		
		for(Funcionario func2 : lista) {
			if(func.getId() == func2.getId()) {
				func2.setCargo(func.getCargo());
				func2.setNome(func.getNome());
				func2.setSetor(func.getSetor());
				break;
			}
			
		}
		
	}
	
}
