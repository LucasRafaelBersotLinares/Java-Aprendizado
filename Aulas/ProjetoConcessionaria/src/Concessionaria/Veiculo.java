package Concessionaria;

public class Veiculo {
	private int id;
	private String modelo;
	private String marca;
	private String ano;
	private String potencia;
	
	Veiculo(int id, String modelo,String marca,String ano,String potencia){
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.potencia = potencia;
	}
	
	void exibirDados(){
		System.out.println("================");
		System.out.println(this.id);
		System.out.println(this.modelo);
		System.out.println(this.marca);
		System.out.println(this.ano);
		System.out.println(this.potencia);
		System.out.println("================");
	}
	
	int getId() {
		return id;
	}
	
	void alterarDados(String modelo, String marca, String ano, String potencia) {
		if(!modelo.equals("*")) {
			this.modelo = modelo;
		}
		if(!marca.equals("*")) {
			this.marca = marca;
		}
		if(!ano.equals("*")) {
			this.ano = ano;
		}
		if(!potencia.equals("*")) {
			this.potencia = potencia;
		}
	}
	
}
