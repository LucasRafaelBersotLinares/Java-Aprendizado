package ExemploHeranca;

public class Funcionario extends Pessoa {
	private String name;
	private Dependente dependente;
	
	public void setDepedente(Dependente dependente) {
		this.dependente=dependente;
	}
	
	public Funcionario(String name){
		super(name);
	}
	
}
