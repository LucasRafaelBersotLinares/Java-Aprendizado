package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BLL.CadVenda;
import Model.Cliente;
import Model.Item;
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
	
	
	
}
