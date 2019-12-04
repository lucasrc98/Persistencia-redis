package br.ufc.quixada.model;






public class Endereco {



	private int id;
	
	private String rua;
	private int numeroCasa;
	private String cidade;
	private String bairro;
	

	private Funcionario funcionario;

	public Endereco(String ruaFuncionario, String numeroCasaFuncionario, String cidadeFuncionario, String bairroFuncionario) {

	}

	public Endereco(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Endereco(int id, String rua, int numeroCasa, String cidade, String bairro,
			Funcionario funcionario) {
		super();
		this.id = id;
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.bairro = bairro;
		this.funcionario = funcionario;
	}
	
	public Endereco( String rua, int numeroCasa, String cidade, String bairro,Funcionario funcionario) {

		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.bairro = bairro;
		this.funcionario = funcionario;
	}

	public Endereco( String rua, int numeroCasa, String cidade, String bairro) {
		this.rua = rua;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.bairro = bairro;

	}
	
	public Endereco(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	@Override
	public String toString() {
		return "Endereco [id=" + id + ", rua=" + rua + ", numeroCasa=" + numeroCasa + ", cidade=" + cidade + ", bairro="
				+ bairro +", Funcionario=" + funcionario + "]";
	}

	

}
