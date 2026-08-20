package Concessionaria;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Concessionaria conc = new Concessionaria();
		Scanner leitor=new Scanner(System.in);
		int opcao = 0;
		
		do {
			
			System.out.println("======= CADASTRO DE VEICULOS =======");
			System.out.println("");
			System.out.println("1- Adicionar Veiculo.");
			System.out.println("2- Alterar Veiculo.");
			System.out.println("3- Excluir Veiculo.");
			System.out.println("4- Exibir Veiculos.");
			System.out.println("5- Exibir Veiculo.");
			System.out.println("0- SAIR.");
			
			opcao = leitor.nextInt();
			
			switch(opcao) {
				case 1:
					conc.adicionarVeiculo();
					break;
				case 2:
					conc.alterarVeiculos();
					break;
				case 3:
					conc.excluirVeiculo();
					break;
				case 4:
					conc.exibirVeiculos();
					break;
				case 5:
					conc.exibirVeiculo();
					break;
				case 0:
					break;
			}
			
		}while(opcao != 0);
		
		

	}

}
