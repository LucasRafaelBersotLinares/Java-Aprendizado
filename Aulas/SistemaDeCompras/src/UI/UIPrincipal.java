package UI;

import java.util.Scanner;

public class UIPrincipal {
	Scanner leitor = new Scanner(System.in);
	
	public int Menu() {
		System.out.println("=====SISTEMAS DE VENDAS=====");
		System.out.println(" Você tem escolha dessas operações:");
		System.out.println("  1. Gerenciar Produtos");
		System.out.println("  2. Gerenciar Vendas");
		System.out.println("  3. Gerenciar Clientes");
		System.out.println("  4. Sair");
		System.out.println("    Coloque apenas o número da operação."); 
		return leitor.nextInt();
	}
	
	public String MenuContinuar() {
		System.out.println("Deseja Continuar no Programa?: Sim (s) | Não (n)");
		return leitor.next();
	}
	
	public int MenuCliente() {
		System.out.println("=====GERENCIAR DE CLIENTE=====");
		System.out.println(" Você tem escolha dessas operações:");
		System.out.println("  1. Criar Cliente");
		System.out.println("  2. Listar Clientes");
		System.out.println("  3. Atualizar Cliente");
		System.out.println("  4. Remover Cliente");
		System.out.println("  5. Buscar Cliente");
		System.out.println("  0. Sair");
		System.out.println("    Coloque apenas o número da operação."); 
		return leitor.nextInt();
	}
	
	public int MenuVenda() {
		System.out.println("=====GERENCIAR DE VENDA=====");
		System.out.println(" Você tem escolha dessas operações:");
		System.out.println("  1. Abrir Venda");
		System.out.println("  2. Listar Vendas");
		System.out.println("  3. Remover Venda");
		System.out.println("  4. Buscar Venda");
		System.out.println("  0. Sair");
		System.out.println("    Coloque apenas o número da operação."); 
		return leitor.nextInt();
	}
	
	public int MenuItens() {
		System.out.println("=====GERENCIAR DE ITENS=====");
		System.out.println(" Você tem escolha dessas operações:");
		System.out.println("  1. Adicionar Item");
		System.out.println("  2. Listar Itens");
		System.out.println("  3. Atualizar Item");
		System.out.println("  4. Remover Item");
		System.out.println("  0. Sair");
		System.out.println("    Coloque apenas o número da operação."); 
		return leitor.nextInt();
	}
	
	public int MenuProduto() {
		System.out.println("=====GERENCIAR DE PRODUTO=====");
		System.out.println(" Você tem escolha dessas operações:");
		System.out.println("  1. Criar Produto");
		System.out.println("  2. Listar Produtos");
		System.out.println("  3. Atualizar Produto");
		System.out.println("  4. Remover Produto");
		System.out.println("  5. Buscar Produto");
		System.out.println("  0. Sair");
		System.out.println("    Coloque apenas o número da operação."); 
		return leitor.nextInt();
	}
	
}
