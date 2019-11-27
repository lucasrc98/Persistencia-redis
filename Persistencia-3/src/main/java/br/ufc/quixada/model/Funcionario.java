package br.ufc.quixada.model;




import java.util.List;


public class Funcionario{



	private int id;
	
	private String nome;
	private String sexo;
	private String dataAniversario;
	private String salario;

	private Endereco endereco;
	

	private Departamento numeroDepartamento;
	

	private List<Dependentes> dependentes;

	public Funcionario() {

	}

	public Funcionario(int id) {
		this.id = id;
		
	}

	public Funcionario(int id, String nome, String sexo, String dataAniversario, String salario,
			Endereco endereco, Departamento numeroDepartamento, List<Dependentes> dependentes) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.endereco = endereco;
		this.numeroDepartamento = numeroDepartamento;
		this.dependentes = dependentes;
	}

	public Funcionario(int id, String nome, String sexo, String dataAniversario, String salario, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.endereco = endereco;
	}

	public Funcionario(int id, String nome, String sexo, String dataAniversario, String salario, Endereco endereco,
			Departamento numeroDepartamento) {
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.endereco = endereco;
		this.numeroDepartamento = numeroDepartamento;
	}
	
	public Funcionario(String nome, String sexo, String dataAniversario, String salario, Endereco endereco,
			Departamento numeroDepartamento) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.endereco = endereco;
		this.numeroDepartamento = numeroDepartamento;
	}
	
	public Funcionario(String nome, String sexo, String dataAniversario, String salario,
			Departamento numeroDepartamento) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.numeroDepartamento = numeroDepartamento;
	}
	
	public Funcionario(String nome, String sexo, String dataAniversario, String salario) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
	}

	public Funcionario(String nome, String sexo, String dataAniversario, String salario, Endereco endereco) {
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.endereco = endereco;
	
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public Endereco getEnderecos() {
		return endereco;
	}

	public void setEnderecos(Endereco endereco) {
		this.endereco = endereco;
	}

	public Departamento getNumeroDepartamento() {
		return numeroDepartamento;
	}

	public void setNumeroDepartamento(Departamento numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}

	public List<Dependentes> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependentes> dependentes) {
		this.dependentes = dependentes;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + this.id + ", nome=" + this.nome + ", sexo=" + this.sexo + ", dataAniversario=" + this.dataAniversario
				+ ", salario=" + this.salario + "]";
	}

	
	

	
	
	
	
}
