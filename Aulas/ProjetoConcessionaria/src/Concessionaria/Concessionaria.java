package Concessionaria;
import java.util.Scanner;

public class Concessionaria {
	Scanner leitor=new Scanner(System.in);
	Veiculo[] veiculos = new Veiculo[100];
	private int id = 0;
	
	void adicionarVeiculo() {
		Menu menu = new Menu();
		menu.mostrarMenu();
		
		for(int i =0; i< 100; i++) {
			if(veiculos[i] == null) {
				this.veiculos[i] = new Veiculo(id+1, menu.modelo, menu.marca, menu.ano, menu.potencia);
				id++;
				return;
			}	
		}
	}
	
	void exibirVeiculos(){
		for(int i =0; i<100; i++) {
			if(veiculos[i] != null) {
				veiculos[i].exibirDados();
			}
		}
	}
	
	void alterarVeiculos() {
		Menu menu = new Menu();
		System.out.println("Fale o id do veiculo desejado");
		int idBuscado = leitor.nextInt();
		
		for(int i=0; i< 100; i++) {
			if(idBuscado == veiculos[i].getId()) {
				menu.mostrarMenu();
				veiculos[i].alterarDados(menu.modelo, menu.marca, menu.ano,menu.potencia);
				return;
			}
		}
	}
	
	
	void excluirVeiculo() {
		System.out.println("Fale o id do veiculo desejado");
		int idBuscado = leitor.nextInt();
		
		for(int i=0; i< 100; i++) {
			if(idBuscado == veiculos[i].getId()) {
				veiculos[i] = null;
				return;
			}
		}
	}
	
	void exibirVeiculo() {
		System.out.println("Fale o id do veiculo desejado");
		int idBuscado = leitor.nextInt();
		
		for(int i=0; i< 100; i++) {
			if(idBuscado == veiculos[i].getId()) {
				veiculos[i].exibirDados();
				return;
			}
		}
	}
	
	
}
