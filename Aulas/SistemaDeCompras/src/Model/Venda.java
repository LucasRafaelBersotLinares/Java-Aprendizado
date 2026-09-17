package Model;

import java.util.ArrayList;

public class Venda {
	private int id;
	private String data;
	private Cliente cliente;
	private static ArrayList<Item> carrinho = new ArrayList<>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public static ArrayList<Item> getCarrinho() {
		return carrinho;
	}

	public static void setCarrinho(ArrayList<Item> carrinho) {
		Venda.carrinho = carrinho;
	}
	
}
