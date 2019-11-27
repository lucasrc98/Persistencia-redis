package br.ufc.quixada.service;


import java.util.Set;

import br.ufc.quixada.model.Endereco;
import br.ufc.quixada.model.Secretario;
import br.ufc.quixada.redis.dao.SecretarioJPADAO;
import redis.clients.jedis.Jedis;

public class secretarioService {
	SecretarioJPADAO secretario = new SecretarioJPADAO();
	private static Jedis jedis;
	public void adicionarSecretario(Secretario secretario) {
		jedis= new Jedis("localhost");
		String userKey = "FuncionarioSecretario:"+ String.valueOf(secretario.getId());
		Endereco e = secretario.getEnderecos();

		jedis.set(userKey+ ":Nome", secretario.getNome());
		jedis.set(userKey+ ":id", String.valueOf(secretario.getId()));
		jedis.set(userKey+ ":Sexo", secretario.getSexo()); 
		jedis.set(userKey+ ":DataAniversario", secretario.getDataAniversario()); 
		jedis.set(userKey+ ":Salario", secretario.getSalario());
		jedis.set(userKey+ ":NumeroDepartamento", String.valueOf(secretario.getNumeroDepartamento()));
		jedis.set(userKey+ ":Salario", secretario.getGrauDeEscolaridade());	
		jedis.set(userKey+ ":Rua", e.getRua());
		jedis.set(userKey+ ":NumeroCasa", String.valueOf(e.getNumeroCasa()));
		jedis.set(userKey+ ":Bairro", e.getBairro());
		jedis.set(userKey+ ":Cidade", e.getCidade());

		jedis.save();
		System.out.println("SECRETARIO SALVO COM SUCESSO...");
		jedis.close();

	}
	public void buscarSecretario(String id) {
		jedis = new Jedis("localhost"); 
		//System.out.println(limpeza.findById("FuncionarioLimpeza:"+ String.valueOf(id)));
		
		String nome =jedis.get("FuncionarioSecretario:"+id+":Nome");
		String Sexo =jedis.get("FuncionarioSecretario:"+id+":Sexo");
		String dataNascimento =jedis.get("FuncionarioSecretario:"+id+":DataAniversario");
		String Salario =jedis.get("FuncionarioSecretario:"+id+":Salario");
		String NumeroDepartamento =jedis.get("FuncionarioSecretario:"+id+":NumeroDepartamento");
		String Rua =jedis.get("FuncionarioSecretario:"+id+":Rua");
		String NumeroCasa =jedis.get("FuncionarioSecretario:"+id+":NumeroCasa");
		String Cidade =jedis.get("FuncionarioSecretario:"+id+":Cidade");
		String Bairro =jedis.get("FuncionarioSecretario:"+id+":Bairro");
		//String IdFuncionario =jedis.get("FuncionarioLimpeza:"+id+":Funcionarioid");


		System.out.println("FuncionarioSecretario:[IdDepa = "+id+",Nome= " +nome+ " Sexo = "+Sexo+" Data nascimento= "+dataNascimento+
				" Salario = "+ Salario +" NumeroDepartamento= "+NumeroDepartamento+" Rua= "+Rua+" NumeroCasa= "+NumeroCasa+
				" Cidade= "+Cidade+" Bairro= "+Bairro+"]");

	}

	public void buscarTodosSecretario() {
		jedis = new Jedis("localhost"); 

		Set<String> keys = jedis.keys("FuncionarioSecretario:*:id");
		
		if(keys == null || keys.isEmpty()) {
			System.out.println("Não temos secretários");
		}

		for(String key : keys) {
			int id = Integer.parseInt(jedis.get(key));
			String nome =jedis.get("FuncionarioSecretario:"+id+":Nome");
			String Sexo =jedis.get("FuncionarioSecretario:"+id+":Sexo");
			String dataNascimento =jedis.get("FuncionarioSecretario:"+id+":DataAniversario");
			String Salario =jedis.get("FuncionarioSecretario:"+id+":Salario");
			String NumeroDepartamento =jedis.get("FuncionarioSecretario:"+id+":NumeroDepartamento");
			String Rua =jedis.get("FuncionarioSecretario:"+id+":Rua");
			String NumeroCasa =jedis.get("FuncionarioSecretario:"+id+":NumeroCasa");
			String Cidade =jedis.get("FuncionarioSecretario:"+id+":Cidade");
			String Bairro =jedis.get("FuncionarioSecretario:"+id+":Bairro");
			
			System.out.println("FuncionarioSecretario:[IdDepa = "+id+",Nome= " +nome+ " Sexo = "+Sexo+" Data nascimento= "+dataNascimento+
					" Salario = "+ Salario +" NumeroDepartamento= "+NumeroDepartamento+" Rua= "+Rua+" NumeroCasa= "+NumeroCasa+
					" Cidade= "+Cidade+" Bairro= "+Bairro+"]");	
		}
		jedis.close();
	}

	public void deletarSecretario(int CPF) {
		secretario.deleteById(CPF,"FuncionarioSecretario");
		System.out.println("FUNCIONARIO DELETADO COM SUCESSO");
	}

	



}
