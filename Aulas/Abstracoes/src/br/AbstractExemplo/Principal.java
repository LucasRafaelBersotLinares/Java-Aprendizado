package br.AbstractExemplo;

public class Principal {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(); //Se Chamar o filho pelo ponteiro do pai, voce so usa metodos que o pai e o filho tenham em comum
		Quadrado q1 = new Quadrado(); //Diferente se voce chamar na classe propria do filho, essa especificao nao entra
		
		c1.setRaio(7);
		c1.setXY(12, 10);
		
		c1.executar();

	}

}
