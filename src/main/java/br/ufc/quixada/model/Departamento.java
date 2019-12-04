package br.ufc.quixada.model;


public class Departamento {

	private int idDepa;
	
	private String nome;
		
	public Departamento() {
		
	}

	
	public Departamento(int idDepa, String nome) {
		super();
		this.idDepa = idDepa;
		this.nome = nome;

	}
	
	public Departamento(String nome) {
		super();
		this.nome = nome;

	}
	
	public Departamento(int idDepa) {
		super();
		this.idDepa = idDepa;

	}

	
	
	
	public int getIdDepa() {
		return idDepa;
	}


	public void setIdDepa(int idDepa) {
		this.idDepa = idDepa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	@Override
	public String toString() {
		return "Departamento [idDepa=" + idDepa + ", nome=" + nome + "]";
	}
	
	
	
	
	
	
}
