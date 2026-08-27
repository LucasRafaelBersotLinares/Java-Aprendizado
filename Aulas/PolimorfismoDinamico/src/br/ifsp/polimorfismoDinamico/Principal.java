package br.ifsp.polimorfismoDinamico;

public class Principal {

	//Ver abstract depois;
	
	public static void main(String[] args) {
		Dependente filho=new Dependente("Lucas");
		
		Funcionario pai= new Funcionario("Roberto");
		pai.setDepedente(filho);
		
		Pessoa p=new Pessoa("Pessoa P");
		//mostrarPessoa(p);
		mostrarPessoa(filho);
		//mostrarPessoa(pai);
		
		Pessoa x=new Dependente("Pazinato");
		
	}
	
	public static void mostrarPessoa(Pessoa pessoa) {
		System.out.println(pessoa.getNome());
		pessoa.metodoImaginario();
	}

}
