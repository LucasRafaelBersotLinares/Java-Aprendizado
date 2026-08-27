package br.ifsp.polimorfismoDinamico;

public class Dependente extends Pessoa{
	
	public Dependente(String name) {
		super(name);
		
	    super.metodoImaginario();
	}
	
	@Override
	public void metodoImaginario(){
	}
	
	public void metodoNoFilho() {
	}

}
