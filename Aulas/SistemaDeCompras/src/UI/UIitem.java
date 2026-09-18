package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Item;
import Model.Produto;

public class UIitem {
	Scanner leitor= new Scanner(System.in);
	
	public Item adicionarItem(Produto produto) {
		System.out.println("========ADICIONAR ITEM========");
		System.out.println("Digite a quantidade:");
		System.out.println("R: "); int quantidade = leitor.nextInt();
		
		Item item = new Item();
		item.setId(produto.getId());
		item.setProduto(produto);
		item.setQuantidade(quantidade);
		
		return item;
	}
	
	public void listarItens(List<Item> carrinho) {
		System.out.println("========LISTA DE ITENS========");
		for(Item i:carrinho) {
			System.out.println("ID: "+i.getId()+" NOME: "+i.getProduto().getNome()+" QUANTIDADE: "+i.getQuantidade());
		}
	}
	
	public Item atualizarItem(Item item, Produto produto) {
		System.out.println("=========ATUALIZAR ITEM=========");
		
		mostrarItem(item);
		
		System.out.println("Digite os dados do produto: ");
		System.out.println("Quantidade: "); int quantidade = leitor.nextInt();
		System.out.println("===================================");
		
		item.setId(produto.getId());;
		item.setProduto(produto);
		item.setQuantidade(quantidade);
		
		return item;
	}
	
	public boolean removerItem(Item item) {
		System.out.println("=========REMOVER ITEM=========");
		
		if(item == null) {
			System.out.println("Item é igual a nulo");
			return false;
		}
		
		System.out.println("Item a ser removido: ");
		mostrarItem(item);
		System.out.println("Deseja excluir o cliente?: (SIM | NÃO)");
		String resposta=leitor.next();
		
		if(resposta.equals("s")) return true;
		return false;
	}

	public void mostrarItem(Item item) {
		System.out.println("==========MOSTRAR ITEM==========");
		System.out.println("ID: "+item.getId());
		System.out.println("NOME: "+item.getProduto().getNome());
		System.out.println("QUANTIDADE: "+item.getQuantidade());
		System.out.println("===================================");
	}
	
	public int buscarItem() {
		System.out.println("===Buscar Produto===");
		Scanner leitor=new Scanner(System.in);
		System.out.println("Digite o id do produto: "); int id = leitor.nextInt();
		return id;
	}
}
