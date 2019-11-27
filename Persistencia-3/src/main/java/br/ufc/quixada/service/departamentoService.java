package br.ufc.quixada.service;

import java.util.Set;

import br.ufc.quixada.model.Departamento;
import br.ufc.quixada.redis.dao.DepartamentoRedisDAO;
import redis.clients.jedis.Jedis;

public class departamentoService {
	private static Jedis jedis = new Jedis("localhost");
	DepartamentoRedisDAO departamento = new DepartamentoRedisDAO();


	public void inserirDepartamento(Departamento departamento) {
		jedis = new Jedis("localhost");
		jedis.set("Departamento:"+ String.valueOf(departamento.getIdDepa())+":nome", departamento.getNome());
		jedis.set("Departamento:"+ String.valueOf(departamento.getIdDepa())+":id", String.valueOf(departamento.getIdDepa()));
		jedis.save();
		
		System.out.println("DEPARTAMENTO SALVO COM SUCESSO...");
		
		jedis.close();
	}

	public void buscarDepartamento(int idDepartamento) {
		String nome =jedis.get("Departamento:"+idDepartamento+":nome");
		System.out.println("Depatamento:[IdDepa = "+idDepartamento+",nome= " +nome+"]");
	}


	public void buscarTodosDepartamento() {

		Set<String> keys = jedis.keys("Departamento:*:id");
		
		if(keys == null || keys.isEmpty()) {
			System.out.println("Não temos departamentos");
		}

		for(String key : keys) {
			int id = Integer.parseInt(jedis.get(key));
			String nome =jedis.get("Departamento:"+id+":nome");
			System.out.println("Depatamento:[IdDepa = "+ id +",nome= " +nome+"]");
		}
	}



	public void deletarDepartamento(int idDepartamento) {
		departamento.deleteById(idDepartamento,"Departamento");
		System.out.println("DEPARTAMENTO DELETADO COM SUCESSO");
	}

}
