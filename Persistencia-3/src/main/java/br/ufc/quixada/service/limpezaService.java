package br.ufc.quixada.service;

import java.util.Set;

import br.ufc.quixada.model.Endereco;
import br.ufc.quixada.model.Limpeza;
import br.ufc.quixada.redis.dao.LimpezaRedisDAO;
import redis.clients.jedis.Jedis;

public class limpezaService {
	private static Jedis jedis;
	LimpezaRedisDAO limpeza = new LimpezaRedisDAO();
	
	public void adicionarLimpezaGerente(Limpeza limpeza) {
		jedis = new Jedis("localhost");
		String userKey = "FuncionarioLimpeza:"+ String.valueOf(limpeza.getId());
		Endereco e = limpeza.getEnderecos();
		
		jedis.set(userKey+ ":id", String.valueOf(limpeza.getId()));
		jedis.set(userKey+ ":nome", limpeza.getNome()); 
		jedis.set(userKey+ ":Sexo", limpeza.getSexo()); 
		jedis.set(userKey+ ":DataAniversario", limpeza.getDataAniversario()); 
		jedis.set(userKey+ ":Salario", limpeza.getSalario());
		jedis.set(userKey+ ":NumeroDepartamento", String.valueOf(limpeza.getNumeroDepartamento())); 
		jedis.set(userKey+ ":gerente", "gerente");
		jedis.set(userKey+ ":Rua", e.getRua());
		jedis.set(userKey+ ":NumeroCasa", String.valueOf(e.getNumeroCasa()));
		jedis.set(userKey+ ":Cidade", e.getCidade());
		jedis.set(userKey+ ":Bairro", e.getBairro());
		jedis.set(userKey+ ":JornadaDeTrabalho", limpeza.getJornadaDeTrabalho());
		
		jedis.save();
		
		System.out.println("FUNCIONARIO DE LIMPEZA SALVO COM SUCESSO...");
		
		jedis.close();
	}
	
	public void adicionarLimpezaGerenteComGerente(Limpeza limpeza) {
		jedis = new Jedis("localhost"); 
		String userKey = "FuncionarioLimpeza:"+ String.valueOf(limpeza.getId());
		Endereco e = limpeza.getEnderecos();
		
		jedis.set(userKey+ ":id", String.valueOf(limpeza.getId()));
		jedis.set(userKey+ ":nome", limpeza.getNome()); 
		jedis.set(userKey+ ":Sexo", limpeza.getSexo()); 
		jedis.set(userKey+ ":DataAniversario", limpeza.getDataAniversario()); 
		jedis.set(userKey+ ":Salario", limpeza.getSalario());
		jedis.set(userKey+ ":NumeroDepartamento", String.valueOf(limpeza.getNumeroDepartamento()));
		jedis.set(userKey+ ":Rua", e.getRua());
		jedis.set(userKey+ ":NumeroCasa", String.valueOf(e.getNumeroCasa()));
		jedis.set(userKey+ ":Cidade", e.getCidade());
		jedis.set(userKey+ ":Bairro", e.getBairro());
		jedis.set(userKey+ ":Cargo", limpeza.getCargo());
		jedis.set(userKey+ ":JornadaDeTrabalho", limpeza.getJornadaDeTrabalho());

		jedis.save();
		
		System.out.println("FUNCIONARIO DE LIMPEZA SALVO COM SUCESSO...");
		
		jedis.close();
	}
	
	public void buscarLimpeza(int id) {
		jedis = new Jedis("localhost"); 
		//System.out.println(limpeza.findById("FuncionarioLimpeza:"+ String.valueOf(id)));
		
		String nome =jedis.get("FuncionarioLimpeza:"+id+":nome");
		String Sexo =jedis.get("FuncionarioLimpeza:"+id+":Sexo");
		String dataNascimento =jedis.get("FuncionarioLimpeza:"+id+":DataAniversario");
		String Salario =jedis.get("FuncionarioLimpeza:"+id+":Salario");
		String NumeroDepartamento =jedis.get("FuncionarioLimpeza:"+id+":NumeroDepartamento");
		String Rua =jedis.get("FuncionarioLimpeza:"+id+":Rua");
		String NumeroCasa =jedis.get("FuncionarioLimpeza:"+id+":NumeroCasa");
		String Cidade =jedis.get("FuncionarioLimpeza:"+id+":Cidade");
		String Bairro =jedis.get("FuncionarioLimpeza:"+id+":Bairro");
		String Cargo =jedis.get("FuncionarioLimpeza:"+id+":Cargo");
		String JornadaDeTrabalho =jedis.get("FuncionarioLimpeza:"+id+":JornadaDeTrabalho");
		
		
		System.out.println("FuncionarioLimpeza:[IdDepa = "+id+",nome= " +nome+ " Sexo = "+Sexo+" Data nascimento= "+dataNascimento+
				" Salario = "+ Salario +" NumeroDepartamento= "+NumeroDepartamento+" Rua= "+Rua+" NumeroCasa= "+NumeroCasa+
				" Cidade= "+Cidade+" Bairro= "+Bairro+" Cargo= "+Cargo+" JornadaDeTrabalho= "+JornadaDeTrabalho+"]");
		jedis.close();
		
	}
	
	public void buscarTodosLimpeza() {
		jedis = new Jedis("localhost"); 

		Set<String> keys = jedis.keys("FuncionarioLimpeza:*:id");
		
		if(keys == null  || keys.isEmpty()) {
			System.out.println("Não temos funcionario de limpeza");
		}

		for(String key : keys) {
			int id = Integer.parseInt(jedis.get(key));
			String nome =jedis.get("FuncionarioLimpeza:"+id+":nome");
			String Sexo =jedis.get("FuncionarioLimpeza:"+id+":Sexo");
			String dataNascimento =jedis.get("FuncionarioLimpeza:"+id+":DataAniversario");
			String Salario =jedis.get("FuncionarioLimpeza:"+id+":Salario");
			String Rua =jedis.get("FuncionarioLimpeza:"+id+":Rua");
			String NumeroCasa =jedis.get("FuncionarioLimpeza:"+id+":NumeroCasa");
			String Cidade =jedis.get("FuncionarioLimpeza:"+id+":Cidade");
			String Bairro =jedis.get("FuncionarioLimpeza:"+id+":Bairro");
			String Cargo =jedis.get("FuncionarioLimpeza:"+id+":Cargo");
			String JornadaDeTrabalho =jedis.get("FuncionarioLimpeza:"+id+":JornadaDeTrabalho");
				
			System.out.println("FuncionarioLimpeza:[IdDepa = "+id+" nome= " +nome+ " Sexo = "+Sexo+" Data nascimento= "+dataNascimento+
					" Salario = "+ Salario +" Rua= "+Rua+" NumeroCasa= "+NumeroCasa+
					" Cidade= "+Cidade+" Bairro= "+Bairro+" Cargo= "+Cargo+" JornadaDeTrabalho= "+JornadaDeTrabalho+"]");
		}
		jedis.close();
		
	}
	
	public void buscarTodosLimpezaGerentes() {
		jedis = new Jedis("localhost"); 

		//System.out.println(jedis.keys("FuncionarioLimpeza:*:*"));
		jedis.close();
	}
	
	public void deletarLimpeza(int id) {
		limpeza.deleteById(id,"FuncionarioLimpeza");
		System.out.println("FUNCIONARIO DELETADO COM SUCESSO");
	}
	
	

}
