package br.ufc.quixada.model;

import java.util.List;





public class Secretario extends Funcionario{

	private String grauDeEscolaridade;

	public Secretario(String grauDeEscolaridade, Funcionario funcionario) {
		super();
		this.grauDeEscolaridade = grauDeEscolaridade;
	}

	

	public Secretario(int id, String nome, String sexo, String dataAniversario, String salario, Endereco endereco,
			Departamento numeroDepartamento, List<Dependentes> dependentes, String grauDeEscolaridade) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento, dependentes);
		this.grauDeEscolaridade = grauDeEscolaridade;
	}
	
	public Secretario(int id, String nome, String sexo, String dataAniversario, String salario, Endereco endereco,
			Departamento numeroDepartamento, String grauDeEscolaridade) {
		super(id, nome, sexo, dataAniversario, salario, endereco, numeroDepartamento);
		this.grauDeEscolaridade = grauDeEscolaridade;
	}

	public Secretario(int id, String nome, String sexo, String dataAniversario, String salario, Endereco endereco,
			String grauDeEscolaridade, Departamento d) {
		super(id, nome, sexo, dataAniversario, salario, endereco);
		this.grauDeEscolaridade = grauDeEscolaridade;
	}
	
	public Secretario( String nome, String sexo, String dataAniversario, String salario, Endereco endereco,
			String grauDeEscolaridade) {
		super(nome, sexo, dataAniversario, salario, endereco);
		this.grauDeEscolaridade = grauDeEscolaridade;
	}

	public String getGrauDeEscolaridade() {
		return grauDeEscolaridade;
	}

	public void setGrauDeEscolaridade(String grauDeEscolaridade) {
		this.grauDeEscolaridade = grauDeEscolaridade;
	}



	@Override
	public String toString() {
		return "Secretario [grauDeEscolaridade=" + this.grauDeEscolaridade + "]";
	}



	


	

	
	
	

	






}
