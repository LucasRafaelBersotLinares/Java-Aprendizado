package br.labirinto;

public class Sala {
	private String nome;
	
	Sala norte=null,sul=null,leste=null,oeste=null;
	
	//Constructor.
	public Sala(String nome) {this.nome=nome;}
	
	//Métodos de Atribuição de Valores.
	public void setN(Sala sala) {norte=sala;}
	public void setS(Sala sala) {sul=sala;}
	public void setL(Sala sala) {leste=sala;}
	public void setO(Sala sala) {oeste=sala;}
	
	//Métodos de Navegação entre as Salas.
	public Sala vaiN() {
		if(norte==null) {System.out.println("Sala não existe!!!");}
		return norte;
	}
	public Sala vaiS() {
		if(sul==null) {System.out.println("Sala não existe!!!");}
		return sul;
	}
	public Sala vaiO() {
		if(oeste==null) {System.out.println("Sala não existe!!!");}
		return oeste;
	}
	public Sala vaiL() {
		if(leste==null) {System.out.println("Sala não existe!!!");}
		return leste;
	}
	
	//Método de Mostrar o nome da sala (Classe).
	public String toString() {
		return nome;
	}
	
}
