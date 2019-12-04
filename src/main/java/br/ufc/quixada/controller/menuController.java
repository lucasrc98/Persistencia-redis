package br.ufc.quixada.controller;

import java.util.Scanner;

public class menuController {

	private static Scanner tcl;

	public static void menuPrincipal() {
		System.out.println("Informe qual entidade deseja acessar: \n");
		System.out.println("1 - Departamento \n");
		System.out.println("2 - Funcionario \n");
		System.out.println("3 - Projeto \n");
		System.out.println("0 - sair \n");
	}

	public static void menuDepartamentos() {
		
		System.out.println("Depertamento \n");
		System.out.println("1 - Adicionar \n");
		System.out.println("2 - Remover \n");
		System.out.println("3 - Listar \n");
		System.out.println("4 - Buscar \n");
		System.out.println("0 - sair \n");
	}

	public static void menuFuncionarios() {
		
		System.out.println("Funcionario \n");
		System.out.println("1 - Adicionar \n");
		System.out.println("2 - Remover \n");
		System.out.println("3 - Listar \n");
		System.out.println("4 - Buscar \n");
		System.out.println("5 - Adicionar Dependente \n");
		System.out.println("0 - sair \n");
	}

	public static void menuProjetos() {
		
		System.out.println("Projeto \n");
		System.out.println("1 - Adicionar \n");
		System.out.println("2 - Remover \n");
		System.out.println("3 - Listar \n");
		System.out.println("4 - Buscar \n");
		System.out.println("5 - Adicionar Pesquisador \n");
		System.out.println("6 - Exibir Pesquisadores de projeto \n");
		System.out.println("0 - sair \n");

	}

	public void inicio() {
		departamentoController departamento = new departamentoController();
		dependenteController dependente = new dependenteController();
		limpezaController limpeza = new limpezaController();
		pesquisadorController pesquisador = new pesquisadorController();
		projetoController projeto = new projetoController();
		secretarioController secretario = new secretarioController();
		pesquisadorProjetoController propes = new pesquisadorProjetoController();

		boolean running = true;
		tcl = new Scanner(System.in);

		while(running) {
			menuPrincipal(); // menu princiapl
			int escolhaMenuPrincipal = tcl.nextInt();

			switch (escolhaMenuPrincipal) {

			case 0:
				running = false;
				System.out.println("Bye");
				break;
			case 1:
				menuDepartamentos();
				int escolhaMenuDepartamento = tcl.nextInt();

				if(escolhaMenuDepartamento == 1) {
					departamento.adicionarDeparemento();
					break;
				}else if(escolhaMenuDepartamento == 2) {
					departamento.deletePorCpf();
					break;
				}else if(escolhaMenuDepartamento == 3) {
					departamento.buscarTodosDepartamentos();
					break;
				}else if(escolhaMenuDepartamento == 4) {
					departamento.buscarPorId();
					break;
				}else if(escolhaMenuDepartamento == 0) {
					System.out.println("-");
					break;
				}else {
					System.out.println("Entrada invalida");
					break;
				}

			case 2:
				menuFuncionarios();
				int escolhaMenuFuncionarios = tcl.nextInt();

				if(escolhaMenuFuncionarios == 1 ) {
					System.out.println("Que tipo de funcionario deseja inserir ? \n");

					System.out.println("1 - Pesquisador \n");
					System.out.println("2 - Secretario \n");
					System.out.println("3 - Funcionario Limpeza \n");
					

					
					int escolhaFuncionario = tcl.nextInt();

					if(escolhaFuncionario == 1) {
						pesquisador.adicionarPesquisador();
					}else if(escolhaFuncionario == 2) {
						secretario.adicionarSecretario();
					}else if(escolhaFuncionario == 3) {
						
						System.out.println("Este funcionario e gerente : \n");
						System.out.println("1 - Sim");
						System.out.println("2 - Nao");
						
						
						int escolhaLimpeza = tcl.nextInt();

						if(escolhaLimpeza == 1) {
							limpeza.adicionarLimpezaGerente();
							break;
						}else if(escolhaLimpeza == 2) {
							limpeza.adicionarLimpezaComGerente();
							break;
						}else {
							System.out.println("Entrada invalida");
							break;
						}

					}else {
						System.out.println("Entrada invalida");
						break;
					}
					break;
				}else if(escolhaMenuFuncionarios == 2 ) {
					
					System.out.println("Que tipo de funcionario deseja remover: \n");
					System.out.println("1 - Pesquisador \n");
					System.out.println("2 - Secretario \n");
					System.out.println("3 - Funcionario Limpeza \n");
					
					int escolhaFuncionario = tcl.nextInt();

					if(escolhaFuncionario == 1) {
						pesquisador.deletePorCpf();	
					}else if(escolhaFuncionario == 2) {
						secretario.deletePorCpf();
					}else if(escolhaFuncionario == 3) {
						limpeza.deletePorCpf();
					}else {
						System.out.println("Entrada invalida");
						break;
					}
				}else if(escolhaMenuFuncionarios == 3) {
					
					System.out.println("Que tipo de funciorio deseja listar: \n");
					System.out.println("1 - Pesquisador \n");
					System.out.println("2 - Secretario \n");
					System.out.println("3 - Funcionario Limpeza \n");
					
					int escolhaFuncionario = tcl.nextInt();

					if(escolhaFuncionario == 1) {
						pesquisador.buscarTodosPesquisador();	
					}else if(escolhaFuncionario == 2) {
						secretario.buscarTodosSecretario();
					}else if(escolhaFuncionario == 3) {
						limpeza.buscarTodosLimpeza();
					}else {
						System.out.println("Entrada invalida");
						break;
					}
				}else if(escolhaMenuFuncionarios == 4) {

					System.out.println("Que tipo de funcionario deseja buscar: \n");
					System.out.println("1 - Pesquisador \n");
					System.out.println("2 - Secretario \n");
					System.out.println("3 - Funcionario Limpeza \n");
					
					int escolhaFuncionario = tcl.nextInt();

					if(escolhaFuncionario == 1) {
						pesquisador.buscarPorCpf();
					}else if(escolhaFuncionario == 2) {
						secretario.buscarPorCpf();
					}else if(escolhaFuncionario == 3) {
						limpeza.buscarPorCpf();
					}else {
						System.out.println("Entrada invalida");

					}
				}else if(escolhaMenuFuncionarios == 5 ) {
					dependente.adicionarDependente();
					break;
				}else if(escolhaMenuFuncionarios == 0) {
					System.out.println("-");
					break;
				}else {
					System.out.println("Entrada invalida");
					break;
				}
				break;

			case 3:
				menuProjetos();

				int escolhaMenuProjetos = tcl.nextInt();

				if(escolhaMenuProjetos == 1) {
					projeto.adicionarProjeto();
					break;
				}else if(escolhaMenuProjetos == 2) {
					projeto.deletePorIdProjeto();
					break;
				}else if(escolhaMenuProjetos == 3) {
					projeto.buscarTodosProjeto();
					break;
				}else if(escolhaMenuProjetos == 4) {
					projeto.buscarPorIdProjeto();
					break;
				}else if(escolhaMenuProjetos == 5) {
					propes.adicionarProjetoPesquisador();
					break;
				}else if(escolhaMenuProjetos == 6) {
					propes.listarProjetoPesquisador();
					break;
				}else if(escolhaMenuProjetos == 0) {
					System.out.println("-");
					break;
				}else {
					System.out.println("Entrada invalida");
					break;
				}
			default:
				System.out.println("Entrada invalida");
				break;

			}

		}

	}

}
