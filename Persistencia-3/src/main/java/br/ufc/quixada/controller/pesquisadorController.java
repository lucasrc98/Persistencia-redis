package br.ufc.quixada.controller;

import java.util.Scanner;

import br.ufc.quixada.model.Departamento;
import br.ufc.quixada.model.Endereco;
import br.ufc.quixada.model.Pesquisador;
import br.ufc.quixada.service.pesquisadorService;

public class pesquisadorController {
	Scanner tcl = new Scanner(System.in);
	pesquisadorService pesquisador = new pesquisadorService();
	departamentoController departamento = new departamentoController();
	projetoController projeto = new projetoController();
	public void adicionarPesquisador() {
		
		System.out.println("QUAL NOME DO FUNCIONARIO? ");
		String nomeFuncionario = tcl.nextLine();
		
		System.out.println("QUAL O CPF DO FUNCIONARIO? ");
		int cpfFuncionario = 0;
		try {
			cpfFuncionario= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}

		System.out.println("QUAL A RUA DO FUNCIONARIO?  ");
		String ruaFuncionario = tcl.nextLine();

		System.out.println("QUAL NUMERO DA CASA DO FUNCIONARIO: ");
		int numeroCasaFuncionario = 0;
		try {
			numeroCasaFuncionario= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		System.out.println("QUAL O BAIRRO DO FUNCIONARIO? ");
		String bairroFuncionario = tcl.nextLine();

		System.out.println("QUAL A CIDADE DO FUNCIONARIO? ");
		String cidadeFuncionario = tcl.nextLine();

		System.out.println("QUAL O SEXO DO FUNCIONARIO? ");
		String sexoFuncionario = tcl.nextLine();

		System.out.println("QUAL A DATA DE NASCIMENTO DO FUNCIONARIO? ");
		String dataAniversarioFuncionario = tcl.nextLine();

		System.out.println("QUAL O SALARIO DO FUNCIONARIO? ");
		String salarioFuncionario = tcl.nextLine();
		
		System.out.println("****LISTA DE DEPARTAMENTOS*****");
		departamento.buscarTodosDepartamentos();
				
		System.out.println("QUAL DEPARTAMENTO O FUNCIONARIO PERTENCE");
		int idDepartamentoFuncionario = 0;
		try {
			idDepartamentoFuncionario= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		System.out.println("QUAL A AREA DE ATUAÇÃO DO PESQUISADOR? ");
		String areaAtuacaoPesquisador = tcl.nextLine();
	
		
		Departamento d = new Departamento(idDepartamentoFuncionario);
		Endereco e = new Endereco(ruaFuncionario, numeroCasaFuncionario,cidadeFuncionario, bairroFuncionario);
		Pesquisador p = new Pesquisador(cpfFuncionario, nomeFuncionario,sexoFuncionario,
				dataAniversarioFuncionario,salarioFuncionario, areaAtuacaoPesquisador,e,d);
		
		
		pesquisador.adicionarPesquisador(p);
		
	}
	
	public void buscarPorCpf() {
		System.out.println("QUAL O CPF DO FUNCIONARIO");
		int CPF = 0;
		try {
			CPF= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		pesquisador.buscarPorPesquisador(CPF);
			
	}
	
	public void deletePorCpf() {
		System.out.println("QUAL O CPF DO FUNCIONARIO QUE DESEJA");
		int CPF = 0;
		try {
			CPF= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		pesquisador.deletePesquisador(CPF);
	
	}
	
	public void buscarTodosPesquisador() {
		pesquisador.listaTodosPesquisador();
	}

}
