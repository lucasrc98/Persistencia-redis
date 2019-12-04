package br.ufc.quixada.model;

public class Dependentes {


	private int idDep;
	private String nomeDep;
	private String sexo;
	private String dataNascimento;
	private String grauDeParentesco;
	
	

	private Funcionario funcionario;
	
	public Dependentes() {

	}

	public Dependentes(int idDep) {
		this.idDep = idDep;

	}
	
	
	public Dependentes(int idDep, String nomeDep, String sexo, String dataNascimento, String grauDeParentesco) {
		this.idDep = idDep;
		this.nomeDep = nomeDep;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.grauDeParentesco = grauDeParentesco;
	}
	
	public Dependentes(String nomeDep, String sexo, String dataNascimento, String grauDeParentesco) {
		this.nomeDep = nomeDep;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.grauDeParentesco = grauDeParentesco;
	}
	
	public Dependentes(int idDep,String nomeDep, String sexo, String dataNascimento, String grauDeParentesco, Funcionario funcionario) {
		this.nomeDep = nomeDep;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.grauDeParentesco = grauDeParentesco;
		this.funcionario = funcionario;
	}



	public int getIdDep() {
		return idDep;
	}

	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}

	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGrauDeParentesco() {
		return grauDeParentesco;
	}

	public void setGrauDeParentesco(String grauDeParentesco) {
		this.grauDeParentesco = grauDeParentesco;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Dependentes [idDep=" + idDep + ", nomeDep=" + nomeDep + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", grauDeParentesco=" + grauDeParentesco + ", funcionario=" + funcionario + "]";
	}
	
	
	
	
	
	
}
