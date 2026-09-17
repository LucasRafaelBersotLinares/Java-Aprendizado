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
	
}
