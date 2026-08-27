package ExemploHeranca;

public class Principal {

	public static void main(String[] args) {
		Dependente filho=new Dependente("Lucas");
		
		Funcionario pai= new Funcionario("Roberto");
		pai.setDepedente(filho);

	}

}
