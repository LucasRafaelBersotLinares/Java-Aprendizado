package br.AnonymousNestedClass;

public abstract class Motor {
	abstract void iniciar();
	
	
	
}

class Carro{
	public void construirCarro() {
		Motor v8=new Motor() { //dentro do metodo

			@Override
			void iniciar() {
				System.out.println("Ligando");	
			}
		};// Final de Classe
		
	}// fim do metodo
}
