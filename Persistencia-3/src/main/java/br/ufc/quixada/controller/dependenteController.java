package br.ufc.quixada.controller;

import java.util.Scanner;

import br.ufc.quixada.model.Dependentes;
import br.ufc.quixada.model.Funcionario;
import br.ufc.quixada.service.dependenteService;

public class dependenteController {
	Scanner tcl = new Scanner(System.in);
	dependenteService dependente = new dependenteService();
	limpezaController limpeza = new limpezaController();
	secretarioController secretario = new secretarioController(); 
	pesquisadorController pesquisador = new pesquisadorController();
	
	public void adicionarDependente() {
		
		System.out.println("QUAL O NOME DO DEPENDENTE? ");
		String nomeDep = tcl.nextLine();
		
		System.out.println("QUAL O CPF DO DEPENDENTE? ");
		int idDep = 0;
		try {
			idDep= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		System.out.println("QUAL O SEXO DO DEPENDENTE? ");
		String sexo = tcl.nextLine();
		sexo = tcl.nextLine();

		System.out.println("QUAL A DATA DE NASCIMENTO DO DEPENDENTE? ");
		String dataNascimento= tcl.nextLine();
		
		System.out.println("QUAL O GRAU DE PARENTESCO COM O FUNCIONARIO QUE ELE DEPENDE? ");
		String grauDeParentesco= tcl.nextLine();
		
		System.out.println("****LISTA DE FUNCIONARIO*****");	
		
		limpeza.buscarTodosLimpeza();
		secretario.buscarTodosSecretario();
		pesquisador.buscarTodosPesquisador();
		
		System.out.println("QUAL O ID DO FUNCIONARIO QUE ELE DEPENDE? ");
		int idFuncionario=0;
		try {
			idFuncionario= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		Funcionario f = new Funcionario(idFuncionario);
		Dependentes d = new Dependentes(idDep, nomeDep, sexo, dataNascimento, grauDeParentesco,f);		
		dependente.adicionarDependente(d);
		
		
	}
	
	public void buscarPorCpf() {
		System.out.println("QUAL O CPF DO DEPENDENTE");
		int idDep = 0;
		try {
			idDep= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		dependente.buscarPorDependente(idDep);
			
	}
	
	public void deletePorCpf() {
		System.out.println("QUAL O CPF DO DEPENDENTE QUE DESEJA DELETAR");
		int CPF = 0;
		try {
			CPF= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		dependente.deleteDependente(CPF);
	
	}
	
	public void buscarTodosSecretario() {
		dependente.listaTodosDependente();
	}

}
