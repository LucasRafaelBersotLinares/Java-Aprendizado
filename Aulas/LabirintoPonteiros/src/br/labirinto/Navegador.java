package br.labirinto;

public class Navegador {
	Sala salaAtual = null;
	
	public Navegador(Sala sala) {
		salaAtual = sala;
	}
	
	public void navN() {
		salaAtual=salaAtual.vaiN();
		mostraSala(); 
	}
	public void navS() {
		salaAtual=salaAtual.vaiS();
		mostraSala();
	}
	public void navL() {
		salaAtual=salaAtual.vaiL();
		mostraSala();
	}
	public void navO() {
		salaAtual=salaAtual.vaiO();
		mostraSala();
	}
	
	public void mostraSala() {
		System.out.println(salaAtual);
	}
}

