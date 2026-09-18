package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BLL.CadVenda;
import Model.Cliente;
import Model.Item;
import Model.Produto;
import Model.Venda;

public class UICadVenda {
	Scanner leitor= new Scanner(System.in);
	CadVenda cadProduto= new CadVenda();
	
	public Venda abrirVenda(Cliente cliente) {
		System.out.println("========ABRIR VENDA========");
		System.out.println("Digite os dados necessarios:");
		System.out.println("ID: "); int id = leitor.nextInt();
		System.out.println("DATA: "); String data = leitor.next();
		
		Venda venda = new Venda();
		venda.setId(id);
		venda.setData(data);
		venda.setCliente(cliente);
		venda.setCarrinho(new ArrayList<>());
		
		return venda;
	}
	
	public void listarVendas(List<Venda> venda){
		System.out.println("========LISTA DE VENDAS========");
		for(Venda v:venda) {
			System.out.println("ID: "+v.getId()+" DATA: "+v.getData()+" CARRINHO: "+v.getCarrinho());
		}
		
	}
	
	public boolean removerVenda(Venda venda) {
		System.out.println("=========REMOVER VENDA=========");
		
		if(venda == null) {
			System.out.println("Venda é igual a nulo");
			return false;
		}
		
		System.out.println("Venda a ser removido: ");
		mostrarVenda(venda);
		System.out.println("Deseja excluir a venda?: (SIM | NÃO)");
		String resposta=leitor.next();
		
		if(resposta.equals("s")) return true;
		return false;
	}
	
	public void mostrarVenda(Venda venda) {
		System.out.println("==========MOSTRAR VENDA==========");
		System.out.println("ID: "+venda.getId());
		System.out.println("DATA: "+venda.getData());
		System.out.println("CARRINHO: "+venda.getCarrinho());
		System.out.println("===================================");
	
	}
	
	public int buscarID() {
		System.out.println("===Buscar Venda===");
		Scanner leitor=new Scanner(System.in);
		System.out.println("Digite o id da venda: "); int id = leitor.nextInt();
		return id;
	}
	
	
}
