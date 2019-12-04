package br.ufc.quixada.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import redis.clients.jedis.Jedis;

public class funcionarioService {
	private static Map<String,String> mapTipo;
	private static Jedis jedis = new Jedis("localhost");
	Scanner tcl = new Scanner(System.in); 

	public void adicionarLimpeza(String CPF,String nomeFuncionario, String ruaFuncionario,String numeroCasaFuncionario, String cidadeFuncionario,
			String bairroFuncionario, String sexoFuncionario, String dataAniversarioFuncionario,
			String salarioFuncionario, String idDepartamentoFuncionario, String cargo, String jornadaTrabalhoFuncionarioLimpeza) {

		mapTipo = new HashMap<String, String>();
		System.out.println("Connection to server sucessfully"); 
		//store data in redis list

		jedis.lpush("FuncionarioLimpeza:"+ CPF, nomeFuncionario); 
		jedis.lpush("FuncionarioLimpeza:"+ CPF, sexoFuncionario); 
		jedis.lpush("FuncionarioLimpeza:"+ CPF, dataAniversarioFuncionario); 
		jedis.lpush("FuncionarioLimpeza:"+ CPF, salarioFuncionario);
		jedis.lpush("FuncionarioLimpeza:"+ CPF, idDepartamentoFuncionario); 
		jedis.lpush("FuncionarioLimpeza:"+ CPF, cargo); 
		jedis.lpush("FuncionarioLimpeza:"+ CPF, jornadaTrabalhoFuncionarioLimpeza);


		mapTipo.put(ruaFuncionario, numeroCasaFuncionario);
		jedis.hmset("FuncionarioLimpeza:"+ CPF, mapTipo);
		mapTipo.put(cidadeFuncionario, bairroFuncionario);
		jedis.hmset("FuncionarioLimpeza:"+ CPF, mapTipo);
		// Get the stored data and print it


		jedis.save();
		System.out.println("Deu certo");
		jedis.close();

	}

	public void adicionarSecretario(String CPF, String nomeFuncionario, String ruaFuncionario,
			String numeroCasaFuncionario, String cidadeFuncionario, String bairroFuncionario,
			String sexoFuncionario, String dataAniversario, String salarioFuncionario,
			String idDepartamentoFuncionario, String grauEscolaridadeSecretario) {

		mapTipo = new HashMap<String, String>();
		jedis = new Jedis("localhost"); 
		System.out.println("Connection to server sucessfully"); 
		//store data in redis list

		jedis.lpush("FuncionarioSecretario:"+ CPF, nomeFuncionario); 
		jedis.lpush("FuncionarioSecretario:"+ CPF, sexoFuncionario); 
		jedis.lpush("FuncionarioSecretario:"+ CPF, dataAniversario); 
		jedis.lpush("FuncionarioSecretario:"+ CPF, salarioFuncionario);
		jedis.lpush("FuncionarioSecretario:"+ CPF, idDepartamentoFuncionario); 
		jedis.lpush("FuncionarioSecretario:"+ CPF, salarioFuncionario);
		jedis.lpush("FuncionarioSecretario:"+ CPF, ruaFuncionario);
		jedis.lpush("FuncionarioSecretario:"+ CPF, numeroCasaFuncionario);
		jedis.lpush("FuncionarioSecretario:"+ CPF, cidadeFuncionario);
		jedis.lpush("FuncionarioSecretario:"+ CPF, bairroFuncionario);
		jedis.lpush("FuncionarioSecretario:"+ CPF, grauEscolaridadeSecretario);
		jedis.save();
		System.out.println("Deu bom");
	}

	public static void adicionarPesquisador(String CPF,String nomeFuncionario, String ruaFuncionario,
			String numeroCasaFuncionario, String cidadeFuncionario, String bairroFuncionario, String estadoFuncionario,
			String sexoFuncionario, String dataAniversarioFuncionario, String salarioFuncionario, 
			String idDepartamentoFuncionario, String areaAtuacaoPesquisador, 
			String idprojeto,String horasTrabalhadasPesquisador) {
		mapTipo = new HashMap<String, String>();
		jedis = new Jedis("localhost"); 
		System.out.println("Connection to server sucessfully"); 
		jedis.lpush("FuncionarioPesquisador:"+ CPF, nomeFuncionario); 
		jedis.lpush("FuncionarioPesquisador:"+ CPF, sexoFuncionario); 
		jedis.lpush("FuncionarioPesquisador:"+ CPF, dataAniversarioFuncionario); 
		jedis.lpush("FuncionarioPesquisador:"+ CPF, salarioFuncionario);
		jedis.lpush("FuncionarioPesquisador:"+ CPF, idDepartamentoFuncionario); 
		jedis.lpush("FuncionarioPesquisador:"+ CPF, salarioFuncionario); 
		jedis.lpush("FuncionarioPesquisador:"+ CPF, areaAtuacaoPesquisador);
		jedis.lpush("FuncionarioPesquisador:"+ CPF, idprojeto);
		jedis.lpush("FuncionarioPesquisador:"+ CPF, horasTrabalhadasPesquisador);
		 


		mapTipo.put(ruaFuncionario, numeroCasaFuncionario);
		jedis.hmset("EnderecoPesquisador:"+ CPF, mapTipo);
		mapTipo.put(cidadeFuncionario, bairroFuncionario);
		jedis.hmset("EnderecoPesquisador:"+ CPF, mapTipo);


		jedis.save();
		
		jedis.close();


	}
	
	public void lista(String CPF) {
		System.out.println(jedis.lrange("FuncionarioSecretario:"+CPF, 0, 15));
		jedis.close();
	}
	
	public void listaTodos() {
		System.out.println(jedis.keys("FuncionarioPesquisador:*:*"));
		jedis.close();
	}
	
	public void delete(String CPF) {
		try {
			jedis.del("FuncionarioSecretario:"+CPF);
			System.out.println("Funcionario deletado com sucesso");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}


}
