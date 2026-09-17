package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BLL.CadVenda;
import Model.Item;
import Model.Venda;

public class UICadVenda {
	Scanner leitor= new Scanner(System.in);
	CadVenda cadProduto= new CadVenda();
	
	public Venda cadastrarVenda() {
		System.out.println("========CADASTRO DE VENDA========");
		System.out.println("Digite os dados do produto: ");
		System.out.println("ID: "); int id = leitor.nextInt();
		System.out.println("Data: "); String data = leitor.next();
		System.out.println("Carrinho: "); ArrayList<Item> carrinho;
		System.out.println("===================================");
		
		Venda venda= new Venda();
		venda.setId(id);
		venda.setData(data);
		
		return venda;
	}
	
	public void mostrarVenda(Venda venda) {
		System.out.println("==========MOSTRAR VENDA==========");
		System.out.println("ID: "+venda.getId());
		System.out.println("===================================");
	
	}
	
	public boolean removerVenda(Venda venda) {
		System.out.println("=========REMOVER VENDA=========");
		
		if(venda == null) {
			System.out.println("Venda é igual a nulo");
			return false;
		}
		
		System.out.println("Venda a ser removido: ");
		mostrarVenda(venda);
		System.out.println("Deseja excluir o venda?: (SIM | NÃO)");
		String resposta=leitor.next();
		
		if(resposta == "S") return true;
		return false;
	}
	
	public void listarVendas(List<Venda> venda){
		System.out.println("========LISTA DE VENDAS========");
		for(Venda v:venda) {
			System.out.println("ID: "+v.getId());
		}
		
	}
	
	public int buscarID() {
		System.out.println("===Buscar Venda===");
		listarVendas(cadProduto.ListarVendas());
		Scanner leitor=new Scanner(System.in);
		System.out.println("Digite o id do venda a ser excluido: "); int id = leitor.nextInt();
		return id;
	}
	
}
