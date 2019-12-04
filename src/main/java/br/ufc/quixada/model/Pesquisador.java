package br.ufc.quixada.model;

import java.util.List;




public class Pesquisador extends Funcionario {

	private String areaDeAtuacao;
	
	private List<PesquisadorProjeto> projetos;

	public Pesquisador(int cpfFuncionario, String nomeFuncionario, String ruaFuncionario, int numeroCasaFuncionario, String cidadeFuncionario, String bairroFuncionario, String sexoFuncionario, String dataAniversarioFuncionario, String salarioFuncionario, String idDepartamentoFuncionario, String areaAtuacaoPesquisador, String idprojeto, String horasTrabalhadasPesquisador) {

	}
	
	public Pesquisador(String nome, String sexo, String dataAniversario, String salario, Endereco endereco, String areaDeAtuacao) {
		super( nome, sexo, dataAniversario, salario,endereco);
		this.areaDeAtuacao = areaDeAtuacao;
	}
	
	public Pesquisador(String areaDeAtuacao, List<PesquisadorProjeto> projetos) {
		super();
		this.areaDeAtuacao = areaDeAtuacao;
		this.projetos = projetos;
	}
	
	public Pesquisador(String areaDeAtuacao, String horasTrabalhadas) {
		super();
		this.areaDeAtuacao = areaDeAtuacao;
	}
	
	public Pesquisador(int id, String nome, String sexo, String dataAniversario, String salario,String areaDeAtuacao,
			Endereco endereco,Departamento numeroDepartamento) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento);
		this.areaDeAtuacao = areaDeAtuacao;

	}
	
	public Pesquisador(int id, String nome, String sexo, String dataAniversario, String salario, Endereco endereco,
			Departamento numeroDepartamento, List<Dependentes> dependentes) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento, dependentes);
		
	}
	
	public Pesquisador(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public Pesquisador(int id, String nome, String sexo, String dataAniversario, String salario, Endereco endereco) {
		super(id, nome, sexo, dataAniversario, salario, endereco);
		// TODO Auto-generated constructor stub
	}

	public Pesquisador(String nome, String sexo, String dataAniversario, String salario, Endereco endereco,
			Departamento numeroDepartamento) {
		super(nome, sexo, dataAniversario, salario, endereco, numeroDepartamento);
		// TODO Auto-generated constructor stub
	}

	public Pesquisador(String nome, String sexo, String dataAniversario, String salario, Endereco endereco) {
		super(nome, sexo, dataAniversario, salario, endereco);
		// TODO Auto-generated constructor stub
	}

	public Pesquisador(String nome, String sexo, String dataAniversario, String salario) {
		super(nome, sexo, dataAniversario, salario);
		// TODO Auto-generated constructor stub
	}

	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}


	public List<PesquisadorProjeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<PesquisadorProjeto> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return super.toString()+"Pesquisador [areaDeAtuacao=" + this.areaDeAtuacao;
	}


	
	
	

	










}
