package teste;

import br.com.apiempresa.bean.Funcionario;
import br.com.apiempresa.bo.FuncionarioBO;

public class Teste {

	public static void main(String[] args) {
	
		
		Funcionario func = FuncionarioBO.consultarFuncionario(1);
		
		System.out.println(func);
		
	}

}
