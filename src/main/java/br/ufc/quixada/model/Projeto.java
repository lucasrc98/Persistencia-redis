package br.ufc.quixada.model;


public class Projeto{

	private int idPro;
	private String nome;
	private int tempoDesenvolvimento;
	
	private Departamento departamento;
	private String pesquisador;


	public Projeto( String pesquisador) {
		this.pesquisador = pesquisador;
	}

	public Projeto(int idPro) {
		this.idPro = idPro;
	}

	public Projeto(int idPro, String nome, int tempoDesenvolvimento) {
		this.idPro = idPro;
		this.nome = nome;
		this.tempoDesenvolvimento = tempoDesenvolvimento;

	}

	public Projeto(String nome, int tempoDesenvolvimento) {
		this.nome = nome;
		this.tempoDesenvolvimento = tempoDesenvolvimento;

	}

	public Projeto(String nome, int tempoDesenvolvimento, String pesquisador) {
		this.nome = nome;
		this.tempoDesenvolvimento = tempoDesenvolvimento;
		this.pesquisador = pesquisador;

	}
	
	public Projeto(int idPro, String nome, int tempoDesenvolvimento, Departamento departamento) {
		super();
		this.idPro = idPro;
		this.nome = nome;
		this.tempoDesenvolvimento = tempoDesenvolvimento;
		this.departamento = departamento;
	}
	

	public Projeto(int idPro, String nome, int tempoDesenvolvimento, Departamento departamento,
			String numeroDoProjeto) {
		super();
		this.idPro = idPro;
		this.nome = nome;
		this.tempoDesenvolvimento = tempoDesenvolvimento;
		this.departamento = departamento;
		this.pesquisador = numeroDoProjeto;
	}
	

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public int getIdPro() {
		return idPro;
	}

	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoDesenvolvimento() {
		return tempoDesenvolvimento;
	}

	public void setTempoDesenvolvimento(int tempoDesenvolvimento) {
		this.tempoDesenvolvimento = tempoDesenvolvimento;
	}

	public String getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(String pesquisador) {
		this.pesquisador = pesquisador;
	}

	@Override
	public String toString() {
		return "Projetos [idPro=" + idPro + ", nome=" + nome + ", tempoDesenvolvimento=" + tempoDesenvolvimento + "]";
	}

}
