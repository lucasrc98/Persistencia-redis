package br.ufc.quixada.controller;

import java.util.Scanner;

import br.ufc.quixada.model.Departamento;
import br.ufc.quixada.model.Projeto;
import br.ufc.quixada.service.projetoService;

public class projetoController {
	Scanner tcl = new Scanner(System.in);
	projetoService projeto = new projetoService();
	departamentoController departamento = new departamentoController();
	
	public void adicionarProjeto() {
		
		System.out.println("QUAL O NOME DO PROJETO QUE DESEJA INSERIR? ");
		String nome = tcl.nextLine();
		
		System.out.println("QUAL INDENTIFICAÇÃO DO PROJETO QUE DESEJA INSERIR? ");
		int id = 0;
		try {
			id= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		System.out.println("QUAL TEMPO DE DESENVOLVIMENTO DESTE PROJETO? ");
		int tempoDesenvolvimento =0;
		try {
			tempoDesenvolvimento= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		System.out.println("****LISTA DE DEPARTAMENTOS*****");
		departamento.buscarTodosDepartamentos();
		
		System.out.println("QUAL DEPARTAMENTO ESSE PROJETO PERTENCE?");
		int idDepartamento = 0;
		try {
			idDepartamento= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
	
		
		Departamento d = new Departamento(idDepartamento);
		Projeto p = new Projeto(id,nome, tempoDesenvolvimento, d);
		
		projeto.adicionarProjeto(p);
		
	}
	
	public void buscarPorIdProjeto() {
		System.out.println("QUAL O ID DO DEPARTAMENTO");
		String idProjeto = tcl.nextLine();
		projeto.buscarPorProjeto(idProjeto);
		
		
	}
	
	public void deletePorIdProjeto() {
		System.out.println("QUAL O CPF DO FUNCIONARIO QUE DESEJA");
		int idProjeto = 0;
		try {
			idProjeto= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		projeto.deletePesquisador(idProjeto);
			
	}
	
	public void buscarTodosProjeto() {
		projeto.listaTodosProjeto();
	}
	
	
	
}
