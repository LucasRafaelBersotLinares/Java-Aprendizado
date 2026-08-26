package br.ifsp.AssociacaoSimples;

public class Principal {

	public static void main(String[] args) {
		Dependente filho=new Dependente();
		filho.setNome("Lucas");
		
		Funcionario pai= new Funcionario();
		pai.setNome("Roberto");
		
		pai.setDepedente(filho);

	}

}
