package br.ifsp.AssociacaoSimples;

public class Funcionario {
	private String name;
	private Dependente dependente;
	
	public void setDepedente(Dependente dependente) {
		this.dependente=dependente;
	}
	
	public void setNome(String name) {
		this.name = name;
	}
	
	public String getNome() {
		return name;
	}
	
}
