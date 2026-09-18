package Model;

import java.util.ArrayList;

public class Venda {
	private int id;
	private String data;
	private Cliente cliente;
	private ArrayList<Item> carrinho = new ArrayList<>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ArrayList<Item> getCarrinho() {
		return this.carrinho;
	}

	public void setCarrinho(ArrayList<Item> carrinho) {
		this.carrinho = carrinho;
	}
	
	public void setItem(Item item) {
		carrinho.add(item);
	}
	
	public void AtualizarItem(Item item) {
		Item itemBusca= BuscarItem(item.getId());
		itemBusca.setId(item.getId());
		itemBusca.setProduto(item.getProduto());
		itemBusca.setQuantidade(item.getQuantidade());
	}
	
	public void removerItem(Item item) {
		carrinho.remove(item);
	}
	
	public Item BuscarItem(int id) {
		for(Item item:carrinho) {
			if(item.getId() == id) {
				return item;
			}
		}
		return null;
	}
	
}
