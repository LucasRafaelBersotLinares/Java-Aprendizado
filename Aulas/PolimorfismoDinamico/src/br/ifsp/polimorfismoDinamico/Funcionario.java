package br.ifsp.polimorfismoDinamico;

public class Funcionario extends Pessoa {
	private Dependente dependente;
	
	public void setDepedente(Dependente dependente) {
		this.dependente=dependente;
	}
	
	public Funcionario(String name){
		super(name);
	}
	
}
