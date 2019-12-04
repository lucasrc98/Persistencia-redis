package br.ufc.quixada.controller;

import java.util.Scanner;

import br.ufc.quixada.model.Pesquisador;
import br.ufc.quixada.model.Projeto;
import br.ufc.quixada.service.pesquisadorProjetoService;
import redis.clients.jedis.Jedis;

public class pesquisadorProjetoController {
	private static Jedis jedis;
	Scanner tcl = new Scanner(System.in);
	pesquisadorProjetoService projetoPesquisador = new pesquisadorProjetoService();
	projetoController projeto = new projetoController();
	pesquisadorController pesquisador = new pesquisadorController();


	public void adicionarPesquisadorProjeto() {

		System.out.println("QUAL O CODIGO DO PESQUISADOR?");
		int idPesquisador =0;
		try {
			idPesquisador= Integer.parseInt(tcl.nextLine());
			
		} catch (NumberFormatException e) {
			System.out.println("Entrada invalida");
			return ;
		}

		System.out.println("Projetos cadastrados");
		projeto.buscarTodosProjeto();

		System.out.println("QUAL O ID DO PROJETO?");
		int idProjeto = 0;
		try {
			idProjeto= Integer.parseInt(tcl.nextLine());
			idProjeto= tcl.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Entrada invalida");
			return ;
		}
		
		Projeto projeto = new Projeto(idProjeto);
		Pesquisador pesquisador = new Pesquisador(idPesquisador);

		projetoPesquisador.adicionarPesquisadorProjeto(projeto, pesquisador);




	}

	public void adicionarProjetoPesquisador() {

		System.out.println("QUAL O CODIGO DO PROJETO?");
		int idProjeto = tcl.nextInt();

		System.out.println("Pesquisadores cadastrados: \n");
		pesquisador.buscarTodosPesquisador();

		System.out.println("QUAL O ID DO PESQUISADOR?");
		int idPesquisador = tcl.nextInt();

		Projeto projeto = new Projeto(idProjeto);
		Pesquisador pesquisador = new Pesquisador(idPesquisador);

		projetoPesquisador.adicionarPesquisadorProjeto(projeto, pesquisador);

	}

	public void listarPesquisadorProjeto() {
		jedis = new Jedis("localhost");
		
		System.out.println("QUAL O CODIGO DO PESQUISADOR?");
		int idPesquisador = tcl.nextInt();

		jedis.smembers("FuncionarioPesquisador:"+idPesquisador+":Idprojetos");

		jedis.save();
		jedis.close();

	}

	public void listarProjetoPesquisador() {
		jedis = new Jedis("localhost");
		
		System.out.println("QUAL O CODIGO DO PROJETO?");
		String idProjeto = tcl.nextLine();

		jedis.smembers("Projeto:"+idProjeto+":pesquisador");

		jedis.save();
		jedis.close();
	}

}
