package br.ufc.quixada.controller;

import java.util.Scanner;

import br.ufc.quixada.model.Endereco;
import br.ufc.quixada.model.Limpeza;
import br.ufc.quixada.service.*;

public class limpezaController {
	Scanner tcl = new Scanner(System.in);
	limpezaService limpeza = new limpezaService();
	departamentoController departamento = new departamentoController();
	
	public void adicionarLimpezaGerente() {
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
		
		System.out.println("QUAL A JORNADA DE TRABALHO");
		String jornadaTrabalhoFuncionarioLimpeza = tcl.nextLine();
		jornadaTrabalhoFuncionarioLimpeza = tcl.nextLine();
		
		Endereco e = new Endereco(ruaFuncionario, numeroCasaFuncionario,cidadeFuncionario, bairroFuncionario);
		Limpeza l = new Limpeza(cpfFuncionario, nomeFuncionario, sexoFuncionario, dataAniversarioFuncionario,
				salarioFuncionario,e,idDepartamentoFuncionario,jornadaTrabalhoFuncionarioLimpeza);		
		limpeza.adicionarLimpezaGerente(l);
		

	}
	
	public void adicionarLimpezaComGerente() {
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
		String salarioFuncionario = tcl.next();
		
		System.out.println("****LISTA DE DEPARTAMENTOS*****");
		departamento.buscarTodosDepartamentos();
				
		System.out.println("QUAL DEPARTAMENTO O FUNCIONARIO PERTENCE");
		String idDepartamentoFuncionario = tcl.nextLine();
		idDepartamentoFuncionario = tcl.nextLine();
		
		System.out.println("QUAL O CARGO DO FUNCIONARIO");
		String cargo = tcl.nextLine();
		
		System.out.println("QUAL A JORNADA DE TRABALHO");
		String jornadaTrabalhoFuncionarioLimpeza = tcl.nextLine();
		
		System.out.println("****LISTA DE GERENTES*****");
		limpeza.buscarTodosLimpezaGerentes();
		
		System.out.println("QUAL O GERENTE DO FUNCIONARIO?");
		String gerente = tcl.nextLine();
		Endereco e = new Endereco(ruaFuncionario, numeroCasaFuncionario,cidadeFuncionario, bairroFuncionario);
		Limpeza l = new Limpeza(cpfFuncionario, nomeFuncionario, sexoFuncionario, dataAniversarioFuncionario,
				salarioFuncionario,e,idDepartamentoFuncionario,cargo,jornadaTrabalhoFuncionarioLimpeza);
		
		limpeza.adicionarLimpezaGerenteComGerente(l);
		

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
		limpeza.buscarLimpeza(CPF);
		
			
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
		
		limpeza.deletarLimpeza(CPF);
	
	}
	
	public void buscarTodosLimpeza() {
		limpeza.buscarTodosLimpeza();
	}
	

}
