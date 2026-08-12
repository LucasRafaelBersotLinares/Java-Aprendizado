package br.ifsp.aula.encapsulamento;


public class Encapsulado {
	private int valor;
	private int[] valores;
	
	public Encapsulado() {};
	
	public Encapsulado(int[] val) {
		valores=val;
	}
	
	public void setValor(int valor) {
		if(valor>10000) return;
		this.valor=valor;
	}
	
	public void setValores(int[] valores) {
		this.valores = valores;
	}
	
	public int getValor() {
		return valor;
	}
	
	public int[] getValores() {
		return valores;
	}
}
