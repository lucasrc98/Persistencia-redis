package br.ufc.quixada.controller;

import java.util.Scanner;

public class menuController {

	private static Scanner tcl;

	public static void menuPrincipal() {
		System.out.println("#===============> MENU PRINCIPAL <===============#");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [1] DEPARTAMENTOS     |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [2] FUNCIONARIOS      |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [3] PROJETOS          |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [0] SAIR              |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#================================================#");
	}

	public static void menuDepartamentos() {
		System.out.println("#==============> MENU DEPARTAMENTO <=============#");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [1] ADICIONAR       |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [2] REMOVER         |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [3] LISTAR          |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [4] BUSCAR          |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [0] SAIR            |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#================================================#");
	}

	public static void menuFuncionarios() {
		System.out.println("#==============> MENU FUNCIONARIO <==============#");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [1] ADICIONAR         |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [2] REMOVER           |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [3] LISTAR            |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [4] BUSCAR            |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [5] ADD DEPENDENTE    |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |      [0] SAIR              |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#================================================#");
	}

	public static void menuProjetos() {
		System.out.println("#================> MENU PROJETOS <===============#");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [1] ADICIONAR       |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [2] REMOVER         |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [3] LISTAR          |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [4] BUSCAR          |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [5] ADD PESQUISADOR |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [6] LISTAR          |         #");
		System.out.println("#         |  PESQUISADORES DE PROJETOS |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#         |        [0] SAIR            |         #");
		System.out.println("#         +----------------------------+         #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#                                                #");
		System.out.println("#================================================#");

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
				System.out.println("Saindo...");
				System.out.println("Saiu");
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
					System.out.println("Voltando...");
					break;
				}else {
					System.out.println("Opcao invalida");
					break;
				}

			case 2:
				menuFuncionarios();
				int escolhaMenuFuncionarios = tcl.nextInt();

				if(escolhaMenuFuncionarios == 1 ) {
					System.out.println("QUAL FUNCIONARIO DESEJA INSERIR? ");

					System.out.println("+--------------------> SELECIONE O TIPO DE FUNCIONARIO <---------------------+");
					System.out.println("|                                                                            |");
					System.out.println("|    1 - Pesquisador         2 - Secretario      3 -Funcionario de Limpeza   |");
					System.out.println("|                                                                            |");
					System.out.println("+----------------------------------------------------------------------------+");

					int escolhaFuncionario = tcl.nextInt();

					if(escolhaFuncionario == 1) {
						pesquisador.adicionarPesquisador();
					}else if(escolhaFuncionario == 2) {
						secretario.adicionarSecretario();
					}else if(escolhaFuncionario == 3) {
						System.out.println("+-----------> SELECIONE SE O FUNCIONARIO DE LIMPEZA EH GERENTE <--------------+");
						System.out.println("|                                                                            |");
						System.out.println("|                       1 - Sim         2 - Não                              |");
						System.out.println("|                                                                            |");
						System.out.println("+----------------------------------------------------------------------------+");
						int escolhaLimpeza = tcl.nextInt();

						if(escolhaLimpeza == 1) {
							limpeza.adicionarLimpezaGerente();
							break;
						}else if(escolhaLimpeza == 2) {
							limpeza.adicionarLimpezaComGerente();
							break;
						}else {
							System.out.println("Operação invalida");
							break;
						}

					}else {
						System.out.println("Operação invalida");
						break;
					}
					break;
				}else if(escolhaMenuFuncionarios == 2 ) {
					System.out.println("QUAL FUNCIONARIO DESEJA REMOVER? ");

					System.out.println("+--------------------> SELECIONE O TIPO DE FUNCIONARIO <---------------------+");
					System.out.println("|                                                                            |");
					System.out.println("|    1 - Pesquisador         2 - Secretario      3 -Funcionario de Limpeza   |");
					System.out.println("|                                                                            |");
					System.out.println("+----------------------------------------------------------------------------+");

					int escolhaFuncionario = tcl.nextInt();

					if(escolhaFuncionario == 1) {
						pesquisador.deletePorCpf();	
					}else if(escolhaFuncionario == 2) {
						secretario.deletePorCpf();
					}else if(escolhaFuncionario == 3) {
						limpeza.deletePorCpf();
					}else {
						System.out.println("Operação invalida");
						break;
					}
				}else if(escolhaMenuFuncionarios == 3) {
					System.out.println("QUAL FUNCIONARIO DESEJA LISTA? ");

					System.out.println("+--------------------> SELECIONE O TIPO DE FUNCIONARIO <---------------------+");
					System.out.println("|                                                                            |");
					System.out.println("|    1 - Pesquisador         2 - Secretario      3 -Funcionario de Limpeza   |");
					System.out.println("|                                                                            |");
					System.out.println("+----------------------------------------------------------------------------+");

					int escolhaFuncionario = tcl.nextInt();

					if(escolhaFuncionario == 1) {
						pesquisador.buscarTodosPesquisador();	
					}else if(escolhaFuncionario == 2) {
						secretario.buscarTodosSecretario();
					}else if(escolhaFuncionario == 3) {
						limpeza.buscarTodosLimpeza();
					}else {
						System.out.println("Operação invalida");
						break;
					}
				}else if(escolhaMenuFuncionarios == 4) {
					System.out.println("QUAL FUNCIONARIO DESEJA BUSCAR? ");

					System.out.println("+--------------------> SELECIONE O TIPO DE FUNCIONARIO <---------------------+");
					System.out.println("|                                                                            |");
					System.out.println("|    1 - Pesquisador         2 - Secretario      3 -Funcionario de Limpeza   |");
					System.out.println("|                                                                            |");
					System.out.println("+----------------------------------------------------------------------------+");

					int escolhaFuncionario = tcl.nextInt();

					if(escolhaFuncionario == 1) {
						pesquisador.buscarPorCpf();
					}else if(escolhaFuncionario == 2) {
						secretario.buscarPorCpf();
					}else if(escolhaFuncionario == 3) {
						limpeza.buscarPorCpf();
					}else {
						System.out.println("Operação invalida");

					}
				}else if(escolhaMenuFuncionarios == 5 ) {
					dependente.adicionarDependente();
					break;
				}else if(escolhaMenuFuncionarios == 0) {
					System.out.println("Voltando...");
					break;
				}else {
					System.out.println("Opção invalida");
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
					System.out.println("Voltando...");
					break;
				}else {
					System.out.println("Opcao invalida");
					break;
				}
			default:
				System.out.println("Opcao invalida");
				break;

			}

		}

	}

}
