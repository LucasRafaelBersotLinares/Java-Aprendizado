package UI;

import java.util.List;
import java.util.Scanner;

import BLL.CadProduto;
import Model.Produto;

public class UICadProduto {
	Scanner leitor= new Scanner(System.in);
	CadProduto cadProduto= new CadProduto();
	
	public Produto cadastrarProduto() {
		System.out.println("========CADASTRO DE PRODUTO========");
		System.out.println("Digite os dados do produto: ");
		System.out.println("ID: "); int id = leitor.nextInt();
		System.out.println("Nome: "); String nome = leitor.next();
		System.out.println("Quantidade: "); int quantidade = leitor.nextInt();
		System.out.println("===================================");
		
		Produto produto= new Produto();
		produto.setId(id);
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		
		return produto;
	}
	
	public void mostrarProduto(Produto produto) {
		System.out.println("==========MOSTRAR PRODUTO==========");
		System.out.println("ID: "+produto.getId());
		System.out.println("NOME: "+produto.getNome());
		System.out.println("QUANTIDADE: "+produto.getQuantidade());
		System.out.println("===================================");
	
	}
	
	public Produto atualizarProduto(Produto produto) {
		System.out.println("=========ATUALIZAR PRODUTO=========");
		
		mostrarProduto(produto);
		
		System.out.println("Digite os dados do produto: ");
		System.out.println("ID: "); int id = leitor.nextInt();
		System.out.println("Nome: "); String nome = leitor.next();
		System.out.println("Quantidade: "); int quantidade = leitor.nextInt();
		System.out.println("===================================");
		
		produto.setId(id);
		produto.setNome(nome);
		produto.setQuantidade(quantidade);
		
		return produto;
	}
	
	public boolean removerProduto(Produto produto) {
		System.out.println("=========REMOVER PRODUTO=========");
		
		if(produto == null) {
			System.out.println("Produto é igual a nulo");
			return false;
		}
		
		System.out.println("Produto a ser removido: ");
		mostrarProduto(produto);
		System.out.println("Deseja excluir o cliente?: (SIM | NÃO)");
		String resposta=leitor.next();
		
		if(resposta.equals("s")) return true;
		return false;
	}
	
	public void listarProdutos(List<Produto> produto){
		System.out.println("========LISTA DE PRODUTOS========");
		for(Produto p:produto) {
			System.out.println("ID: "+p.getId()+" NOME: "+p.getNome()+" QUANTIDADE: "+p.getQuantidade());
		}
		
	}
	
	public int buscarID() {
		System.out.println("===Buscar Produto===");
		Scanner leitor=new Scanner(System.in);
		System.out.println("Digite o id do produto: "); int id = leitor.nextInt();
		return id;
	}
}
