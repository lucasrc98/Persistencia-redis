package br.ufc.quixada.controller;

import java.util.Scanner;

import br.ufc.quixada.model.Departamento;
import br.ufc.quixada.model.Endereco;
import br.ufc.quixada.model.Secretario;
import br.ufc.quixada.service.secretarioService;

public class secretarioController {
	Scanner tcl = new Scanner(System.in);
	secretarioService secretario = new secretarioService();
	departamentoController departamento = new departamentoController();
	public void adicionarSecretario() {

		System.out.println("QUAL NOME DO FUNCIONARIO? ");
		String nomeFuncionario = tcl.nextLine();

		System.out.println("QUAL O CPF DO FUNCIONARIO? ");
		int cpfFuncionario = 0;
		try {
			cpfFuncionario= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada invalida");
			return ;
		}

		System.out.println("QUAL A RUA DO FUNCIONARIO?  ");
		String ruaFuncionario = tcl.nextLine();

		System.out.println("QUAL NUMERO DA CASA DO FUNCIONARIO: ");
		int numeroCasaFuncionario = 0;
		try {
			numeroCasaFuncionario= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada invalida");
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

		System.out.println("QUAL O GRAU DE ESCOLARIDADE DO SECRET�RIO: ");
		String grauEscolaridadeSecretario = tcl.nextLine();
		grauEscolaridadeSecretario = tcl.nextLine();

		System.out.println("Lista de departamentos: \n");
		departamento.buscarTodosDepartamentos();

		System.out.println("QUAL DEPARTAMENTO O FUNCIONARIO PERTENCE");
		int idDepartamentoFuncionario = 0;
		try {
			idDepartamentoFuncionario= Integer.parseInt(tcl.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Entrada invalida");
			return ;
		}

		Endereco e = new Endereco(ruaFuncionario, numeroCasaFuncionario,cidadeFuncionario, bairroFuncionario);
		Departamento d = new Departamento(idDepartamentoFuncionario);

		Secretario s = new Secretario(cpfFuncionario, nomeFuncionario,sexoFuncionario, dataAniversarioFuncionario, salarioFuncionario,e,
				d, grauEscolaridadeSecretario);


		secretario.adicionarSecretario(s);
	}

	public void buscarPorCpf() {
		System.out.println("QUAL O CPF DO FUNCIONARIO");
		String CPF = tcl.nextLine();
		secretario.buscarSecretario(CPF);

	}

	public void deletePorCpf() {
		System.out.println("QUAL O CPF DO FUNCIONARIO QUE DESEJA");
		int CPF = tcl.nextInt();
		secretario.deletarSecretario(CPF);

	}

	public void buscarTodosSecretario() {
		secretario.buscarTodosSecretario();
	}


}
