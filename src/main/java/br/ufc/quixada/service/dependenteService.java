package br.ufc.quixada.service;

import java.util.Set;

import br.ufc.quixada.model.Dependentes;
import br.ufc.quixada.model.Funcionario;
import br.ufc.quixada.redis.dao.DependenteRedisDAO;
import redis.clients.jedis.Jedis;

public class dependenteService {

	private static Jedis jedis;
	DependenteRedisDAO dependente = new DependenteRedisDAO();


	public void adicionarDependente(Dependentes dependente) {
		jedis = new Jedis("localhost");
		String userKey = "Dependente:"+ String.valueOf(dependente.getIdDep());
		Funcionario f = dependente.getFuncionario();

		
		jedis.set(userKey+ ":nome", dependente.getNomeDep()); 
		jedis.set(userKey+ ":Sexo", dependente.getSexo()); 
		jedis.set(userKey+ ":dataNascimento", dependente.getDataNascimento()); 
		jedis.set(userKey+ ":grauDeParentensco", dependente.getGrauDeParentesco());
		jedis.set(userKey+ ":IdFuncionario", String.valueOf(f.getId()));
		
		jedis.save();

		jedis.close();


	}

	public void buscarPorDependente(int CPF) {
		jedis = new Jedis("localhost");
		
		//System.out.println(jedis.lrange("Dependente:"+String.valueOf(CPF), 0, 15));
		
		
		String nome =jedis.get("Dependente:"+CPF+":nome");
		String Sexo =jedis.get("Dependente:"+CPF+":Sexo");
		String dataNascimento =jedis.get("Dependente:"+CPF+":dataNascimento");
		String grauDeParentensco =jedis.get("Dependente:"+CPF+":grauDeParentensco");
		String IdFuncionario =jedis.get("Dependente:"+CPF+":IdFuncionario");

		System.out.println("Dependente:[Id= "+CPF+",nome= " +nome+"Sexo = "+Sexo+"data Nascimento ="
		+dataNascimento+ "grau De Parentensco = "+grauDeParentensco+"Id Funcionario = "+IdFuncionario+"]");
		
		jedis.close();
	}

	public void listaTodosDependente() {
		jedis = new Jedis("localhost");
		
		Set<String> keys = jedis.keys("Dependente:*:id");

		for(String key : keys) {
			int id = Integer.parseInt(jedis.get(key));
			String nome =jedis.get("Dependente:"+id+":nome");
			String Sexo =jedis.get("Dependente:"+id+":Sexo");
			String dataNascimento =jedis.get("Dependente:"+id+":dataNascimento");
			String grauDeParentensco =jedis.get("Dependente:"+id+":grauDeParentensco");
			String IdFuncionario =jedis.get("Dependente:"+id+":IdFuncionario");

			System.out.println("Dependente:[Id= "+id+",nome= " +nome+"Sexo = "+Sexo+"data Nascimento ="
			+dataNascimento+ "grau De Parentensco = "+grauDeParentensco+"Id Funcionario = "+IdFuncionario+"]");
		}
		//System.out.println(jedis.keys("Dependente:*:*"));
	}

	public void deleteDependente(int CPF) {
		
		dependente.deleteById(CPF,"Dependente");
		System.out.println("DEPARTAMENTO DELETADO COM SUCESSO");

	}

}
