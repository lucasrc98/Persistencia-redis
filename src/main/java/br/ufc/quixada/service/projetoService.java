package br.ufc.quixada.service;

import java.util.Set;

import br.ufc.quixada.model.Departamento;
import br.ufc.quixada.model.Projeto;
import br.ufc.quixada.redis.dao.ProjetoRedisDAO;
import redis.clients.jedis.Jedis;

public class projetoService {

	private static Jedis jedis;
	ProjetoRedisDAO projeto = new ProjetoRedisDAO();

	public void adicionarProjeto(Projeto projeto) {
		jedis = new Jedis("localhost");
		String userKey = "Projeto:"+ String.valueOf(projeto.getIdPro());
		Departamento d = projeto.getDepartamento();
		jedis.set(userKey+ ":Nome", projeto.getNome());
		jedis.set(userKey+ ":id", String.valueOf(projeto.getIdPro()));
		jedis.set(userKey+ ":TempoDesenvolvimento", String.valueOf(projeto.getTempoDesenvolvimento()));
		jedis.set(userKey+ ":IdDepartamento", String.valueOf(d.getIdDepa()));


		jedis.save();
		System.out.println("PROJETO SALVO COM SUCESSO...");
		jedis.close();

	}

	public void buscarPorProjeto(String id) {
		jedis = new Jedis("localhost");
		String nome =jedis.get("Projeto:"+id+":Nome");
		String TempoDesenvolvimento =jedis.get("Projeto:"+id+":TempoDesenvolvimento");
		String IdDepartamento =jedis.get("Projeto:"+id+":IdDepartamento");
		String NumeroProjeto =jedis.get("Projeto:"+id+":NumeroProjeto");

		//String IdFuncionario =jedis.get("FuncionarioLimpeza:"+id+":Funcionarioid");


		System.out.println("FuncionarioPesquisador:[IdDepa = "+id+",nome= " +nome+ " TempoDesenvolvimento = "+TempoDesenvolvimento+"IdDepartamento= "+IdDepartamento+
				" NumeroProjeto = "+ NumeroProjeto +"]");
		jedis.close();
	}

	public void listaTodosProjeto() {
		jedis = new Jedis("localhost");

		Set<String> keys = jedis.keys("Projeto:*:id");
		
		if(keys == null || keys.isEmpty()) {
			System.out.println("Não temos projetos");
		}
		
		for(String key : keys) {
			int id = Integer.parseInt(jedis.get(key));
			String nome =jedis.get("Projeto:"+id+":Nome");
			String TempoDesenvolvimento =jedis.get("Projeto:"+id+":TempoDesenvolvimento");
			String IdDepartamento =jedis.get("Projeto:"+id+":IdDepartamento");
			//String IdFuncionario =jedis.get("FuncionarioLimpeza:"+id+":Funcionarioid");
			System.out.println("Projeto:[IdDepa = "+id+",nome= " +nome+ " TempoDesenvolvimento = "+TempoDesenvolvimento+" IdDepartamento="+IdDepartamento+"]");
		}
		//System.out.println(jedis.keys("Dependente:*:*"));
		jedis.close();
	}

	public void deletePesquisador(int idProjeto) {

		projeto.deleteById(idProjeto,"Dependente");
		System.out.println("PROJETO DELETADO COM SUCESSO");

	}


}
