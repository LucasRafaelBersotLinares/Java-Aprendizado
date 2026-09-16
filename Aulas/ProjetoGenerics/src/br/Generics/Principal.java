package br.Generics;

public class Principal {
	
	public static void main(String[] args) {
		int a = 10;
		Integer B = 10;
		double c=3.14;
		Double d=3.14;
		
		PowerBox<String> supercaixa = new PowerBox<String>();
		supercaixa.setConteudo("Ola Mundo");
		System.out.println(supercaixa.getConteudo());
		
		PowerBox<Integer> supercaixa2 = new PowerBox<Integer>();
		supercaixa2.setConteudo(10);
		System.out.println(supercaixa2.getConteudo());
		
		PowerBox<Double> supercaixa3 = new PowerBox<Double>();
		supercaixa3.setConteudo(6.7);
		System.out.println(supercaixa3.getConteudo());		
		
	}
	
	
}
