package br.ufc.quixada.service;


import br.ufc.quixada.model.Pesquisador;
import br.ufc.quixada.model.Projeto;
import redis.clients.jedis.Jedis;

public class pesquisadorProjetoService {
	private static Jedis jedis;

	
	public void adicionarPesquisadorProjeto(Projeto projeto, Pesquisador pesquisador){
		jedis = new Jedis("localhost");
		String userKey = "PesquisadorProjeto:"+ String.valueOf(projeto.getIdPro());
		jedis.set(userKey+ ":IdPesquisador", String.valueOf(pesquisador.getId()));
		jedis.save();
		
		System.out.println("ADICIONADO...");
		
		jedis.close();

	}

	public void adicionarProjetoPesquisador(String idProjeto, String idPesquisador) {
		jedis = new Jedis("localhost"); 
		jedis.sadd("Projeto:"+idProjeto+":pesquisador", idPesquisador);
		jedis.save();
		
		System.out.println("ADICIONADO...");
		
		jedis.close();

	}

	public void listarPesquisadorProjeto(int idPesquisador) {
		jedis = new Jedis("localhost");
		
		jedis.smembers("FuncionarioPesquisador:"+idPesquisador+":projeto");
		
		jedis.save();
		jedis.close();

	}

	public void listarProjetoPesquisador(String idProjeto) {
		jedis = new Jedis("localhost");
		
		jedis.smembers("Projeto:"+idProjeto+":pesquisador");
		
		
		jedis.save();
		jedis.close();
	}



}
