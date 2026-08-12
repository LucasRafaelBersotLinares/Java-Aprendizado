package br.ifsp.aula.encapsulamento;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int[] valoresTri = {5,6,7};
		Encapsulado pacote= new Encapsulado();
		pacote.setValores(valoresTri); // push message
		
		Encapsulado pacote2= new Encapsulado(valoresTri);
		
		int[] vet=pacote2.getValores(); // pull messages
		
		Scanner leitor=new Scanner(System.in);
		
		String name=leitor.next(); // Le uma String.
		int valor=leitor.nextInt(); // Le um valor inteiro.
		double valorD=leitor.nextDouble(); // Le um valor do tipo double.
		byte valorB=leitor.nextByte(); // Le uma valor inteiro de 0 a 255 (Tipo byte 1 bit).
		leitor.close();
		
		System.out.println("Nome: "+ name + "\n" + 
							"Inteiro: "+ valor + "\n" + 
							"Double: "+ valorD + "\n" + 
							"Byte: "+ valorB + "\n");
	}

}
