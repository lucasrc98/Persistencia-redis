package br.ufc.quixada.model;



public class Limpeza extends Funcionario {

	private String cargo;
	private String jornadaDeTrabalho;

	private Limpeza gerente;
	private String gerente1;
	
	public Limpeza(int id, String nome, String sexo,
			String dataAniversario, String salario, Endereco endereco, int idDepartamentoFuncionario,
			String jornadaDeTrabalho) {
		super(id ,nome, sexo, dataAniversario, salario, endereco);
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}
		
	public Limpeza(int id, String nomeFuncionario, String sexoFuncionario, String dataAniversarioFuncionario, String salarioFuncionario, Endereco e, String idDepartamentoFuncionario, String cargo2, String jornadaTrabalhoFuncionarioLimpeza, String gerente2) {
		super(id);
	}

	public Limpeza(int id,String nome, String sexo, String dataAniversario, String salario, Endereco endereco, String cargo, String jornadaDeTrabalho) {
		super(id ,nome, sexo, dataAniversario, salario, endereco);
		this.cargo = cargo;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}
	
	
	
	public Limpeza(String nome, String sexo, String dataAniversario, String salario, String cargo, String jornadaDeTrabalho) {
		super(nome, sexo, dataAniversario, salario);
		this.cargo = cargo;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}
	
	public Limpeza(String cargo, String jornadaDeTrabalho) {
		super();
		this.cargo = cargo;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}
	
	public Limpeza(String cargo, String jornadaDeTrabalho, Limpeza gerente) {
		super();
		this.cargo = cargo;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
		this.gerente = gerente;
	}
	
	public Limpeza(String gerente1) {
		super();
		this.gerente1 = gerente1;
	}

	public Limpeza(int id, String nome, String sexo,
			String dataAniversario, String salario, Endereco endereco, String idDepartamentoFuncionario,
			String cargo, String jornadaDeTrabalho) {
		super(id ,nome, sexo, dataAniversario, salario, endereco);
		this.cargo = cargo;
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}



	public Limpeza getGerente() {
		return gerente;
	}

	public void setGerente(Limpeza gerente) {
		this.gerente = gerente;
	}

	public String getGerente1() {
		return gerente1;
	}

	public void setGerente1(String gerente1) {
		this.gerente1 = gerente1;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getJornadaDeTrabalho() {
		return jornadaDeTrabalho;
	}

	public void setJornadaDeTrabalho(String jornadaDeTrabalho) {
		this.jornadaDeTrabalho = jornadaDeTrabalho;
	}

	@Override
	public String toString() {
		
		return super.toString()+"Limpeza [cargo=" + this.cargo + ", jornadaDeTrabalho=" + this.jornadaDeTrabalho + ", gerente=" + this.gerente + "]";
	}

	
	
	
	
	
	
}
