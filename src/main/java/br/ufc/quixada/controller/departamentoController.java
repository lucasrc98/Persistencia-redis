package br.ufc.quixada.controller;

import java.util.Scanner;

import br.ufc.quixada.model.Departamento;
import br.ufc.quixada.service.departamentoService;


public class departamentoController {
	Scanner tcl = new Scanner(System.in);
	departamentoService departamento = new departamentoService();
	Departamento d = new Departamento();

	public void adicionarDeparemento() {
		System.out.println("QUAL NOME DO DEPARTAMENTO? ");
		String nome = tcl.nextLine();
		
		
		System.out.println("QUAL O ID DO DEPARTAMENTO? ");
		int idDepa = 0;
		try {
			idDepa= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		Departamento d = new Departamento(idDepa,nome);
		
		departamento.inserirDepartamento(d);
		
		
	}
	
	public void buscarPorId() {
		System.out.println("QUAL O ID DO DEPARTAMENTO");
		int CPF = 0;
		
		try {
			CPF= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		
		
		departamento.buscarDepartamento(CPF);
		
		
	}
	
	public void deletePorCpf() {
		System.out.println("QUAL O ID DO DEPARTAMENTO QUE DESEJA REMOVER");
		int CPF = 0;
		try {
			CPF= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada inválida!");
			return ;
		}
		departamento.deletarDepartamento(CPF);
		
		
	}
	
	public void buscarTodosDepartamentos() {
		departamento.buscarTodosDepartamento();
	}


}
