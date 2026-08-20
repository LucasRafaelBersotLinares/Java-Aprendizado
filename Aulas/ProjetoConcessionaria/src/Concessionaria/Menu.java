package Concessionaria;
import java.util.Scanner;

public class Menu {
	Scanner leitor=new Scanner(System.in);
	
	String modelo;
	String marca;
	String ano;
	String potencia;
	
	void mostrarMenu() {
		System.out.println("Coloque seu modelo:");
		modelo = leitor.next();
		
		System.out.println("Coloque seu marca:");
		marca = leitor.next();
		
		System.out.println("Coloque seu ano:");
		ano = leitor.next();
		
		System.out.println("Coloque seu potencia:");
		potencia = leitor.next();
		
		return;
	}
}
