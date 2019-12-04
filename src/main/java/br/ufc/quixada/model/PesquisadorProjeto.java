package br.ufc.quixada.model;



public class PesquisadorProjeto {

	private int id;

	private Pesquisador pesquisador;
	

	private Projeto projeto;
	
	private int horasPorProjeto;

	
	
	
	public PesquisadorProjeto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PesquisadorProjeto(Pesquisador pesquisador, Projeto projeto, int horasPorProjeto) {
		super();
		this.pesquisador = pesquisador;
		this.projeto = projeto;
		this.horasPorProjeto = horasPorProjeto;
	}
	
	public PesquisadorProjeto(Projeto projeto, int horasPorProjeto) {
		super();
		this.projeto = projeto;
		this.horasPorProjeto = horasPorProjeto;
	}
	
	public PesquisadorProjeto(Projeto projeto) {
		super();
		this.projeto = projeto;
	}
	
	public PesquisadorProjeto(Pesquisador pesquisador) {
		super();
		this.pesquisador = pesquisador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pesquisador getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public int getHorasPorProjeto() {
		return horasPorProjeto;
	}

	public void setHorasPorProjeto(int horasPorProjeto) {
		this.horasPorProjeto = horasPorProjeto;
	}

	@Override
	public String toString() {
		return "PesquisadorProjeto [id=" + this.id + ", pesquisador=" + this.pesquisador + ", projeto=" + this.projeto
				+ ", horasPorProjeto=" + this.horasPorProjeto + "]";
	}

	
	

	
	
	
	
	
}