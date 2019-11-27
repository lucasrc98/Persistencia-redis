package br.ufc.quixada.service;


import java.util.Set;

import br.ufc.quixada.model.Endereco;
import br.ufc.quixada.model.Pesquisador;
import br.ufc.quixada.redis.dao.PesquisadorRedisDAO;
import redis.clients.jedis.Jedis;

public class pesquisadorService {
	private static Jedis jedis;
	PesquisadorRedisDAO pesquisador = new PesquisadorRedisDAO();

	public void adicionarPesquisador(Pesquisador pesquisador) {
		jedis = new Jedis("localhost"); 
		String userKey = "FuncionarioPesquisador:"+ String.valueOf(pesquisador.getId());
		Endereco e = pesquisador.getEnderecos();

		jedis.set(userKey+ ":Nome", pesquisador.getNome());
		jedis.set(userKey+ ":Id", String.valueOf(pesquisador.getId()));
		jedis.set(userKey+ ":Sexo", pesquisador.getSexo()); 
		jedis.set(userKey+ ":DataAniversario", pesquisador.getDataAniversario()); 
		jedis.set(userKey+ ":Salario", pesquisador.getSalario());
		jedis.set(userKey+ ":NumeroDepartamento", String.valueOf(pesquisador.getNumeroDepartamento()));
		jedis.set(userKey+ ":Rua", e.getRua());
		jedis.set(userKey+ ":NumeroCasa", String.valueOf(e.getNumeroCasa()));
		jedis.set(userKey+ ":Bairro", e.getBairro());
		jedis.set(userKey+ ":Cidade", e.getCidade());

		jedis.set(userKey+ ":AreaAtuacao", pesquisador.getAreaDeAtuacao());
		jedis.set(userKey+ ":HorasTrabalhadas", pesquisador.getAreaDeAtuacao());
		jedis.set(userKey+ ":IdProjetos", String.valueOf(pesquisador.getProjetos()));

		jedis.save();
		
		System.out.println("PESQUISADOR SALVO COM SUCESSO...");

		jedis.close();


	}

	public void buscarPorPesquisador(int id) {
		jedis = new Jedis("localhost"); 

		String nome =jedis.get("FuncionarioPesquisador:"+id+":nome");
		String Sexo =jedis.get("FuncionarioPesquisador:"+id+":Sexo");
		String dataNascimento =jedis.get("FuncionarioPesquisador:"+id+":DataAniversario");
		String Salario =jedis.get("FuncionarioPesquisador:"+id+":Salario");
		String NumeroDepartamento =jedis.get("FuncionarioPesquisador:"+id+":NumeroDepartamento");
		String Rua =jedis.get("FuncionarioPesquisador:"+id+":Rua");
		String NumeroCasa =jedis.get("FuncionarioPesquisador:"+id+":NumeroCasa");
		String Cidade =jedis.get("FuncionarioPesquisador:"+id+":Cidade");
		String Bairro =jedis.get("FuncionarioPesquisador:"+id+":Bairro");
		String AreaAtuacao =jedis.get("FuncionarioPesquisador:"+id+":AreaAtuacao");
		String HorasTrabalhadas =jedis.get("FuncionarioPesquisador:"+id+":HorasTrabalhadas");
		String IdProjetos =jedis.get("FuncionarioPesquisador:"+id+":IdProjetos");
		//String IdFuncionario =jedis.get("FuncionarioLimpeza:"+id+":Funcionarioid");


		System.out.println("FuncionarioPesquisador:[IdDepa = "+id+",nome= " +nome+ " Sexo = "+Sexo+" Data nascimento= "+dataNascimento+
				" Salario = "+ Salario +" NumeroDepartamento= "+NumeroDepartamento+" Rua= "+Rua+" NumeroCasa= "+NumeroCasa+
				" Cidade= "+Cidade+" Bairro= "+Bairro+" AreaAtuacao= "+AreaAtuacao+" HorasTrabalhadas= "+HorasTrabalhadas
				+"IdProjetos"+IdProjetos+"]");
		jedis.close();

	}

	public void listaTodosPesquisador() {
		jedis = new Jedis("localhost"); 
		
		Set<String> keys = jedis.keys("FuncionarioPesquisador:*:Id");
		
		if(keys == null  || keys.isEmpty()) {
			System.out.println("Não temos pesquisador");
		}
		
		for(String key : keys) {
			int id = Integer.parseInt(jedis.get(key));
			String nome =jedis.get("FuncionarioLimpeza:"+id+":Nome");
			String Sexo =jedis.get("FuncionarioLimpeza:"+id+":Sexo");
			String dataNascimento =jedis.get("FuncionarioLimpeza:"+id+":DataAniversario");
			String Salario =jedis.get("FuncionarioLimpeza:"+id+":Salario");
			String Rua =jedis.get("FuncionarioLimpeza:"+id+":Rua");
			String NumeroCasa =jedis.get("FuncionarioLimpeza:"+id+":NumeroCasa");
			String Cidade =jedis.get("FuncionarioLimpeza:"+id+":Cidade");
			String Bairro =jedis.get("FuncionarioLimpeza:"+id+":Bairro");
			String AreaAtuacao =jedis.get("FuncionarioPesquisador:"+id+":AreaAtuacao");
			String HorasTrabalhadas =jedis.get("FuncionarioPesquisador:"+id+":HorasTrabalhadas");
			String IdProjetos =jedis.get("FuncionarioPesquisador:"+id+":IdProjetos");
		

			System.out.println("FuncionarioPesquisador:[IdDepa = "+id+",nome= " +nome+ " Sexo = "+Sexo+" Data nascimento= "+dataNascimento+
					" Salario = "+ Salario +" Rua= "+Rua+" NumeroCasa= "+NumeroCasa+
					" Cidade= "+Cidade+" Bairro= "+Bairro+" AreaAtuacao= "+AreaAtuacao+" HorasTrabalhadas= "+HorasTrabalhadas
					+"IdProjetos"+IdProjetos+"]");
		}
		jedis.close();
	}
	public void deletePesquisador(int CPF) {
		pesquisador.deleteById(CPF,"FuncionarioPesquisador");
		System.out.println("PESQUISADOR DELETADO COM SUCESSO");

	}
	
	

}
