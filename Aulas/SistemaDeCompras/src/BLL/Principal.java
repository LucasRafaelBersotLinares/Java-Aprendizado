package BLL;

import java.util.Scanner;

import UI.UICadCliente;
import UI.UICadProduto;
import UI.UICadVenda;
import UI.UIPrincipal;
import Model.Item;
import Model.Cliente;
import Model.Produto;
import Model.Venda;
import BLL.CadCliente;
import BLL.CadProduto;
import BLL.CadVenda;

public class Principal {
	public static void main(String[] args) {
		UICadCliente uicliente = new UICadCliente();
		UICadProduto uiproduto = new UICadProduto();
		UICadVenda uivenda = new UICadVenda();
		UIPrincipal uiprincipal = new UIPrincipal();
		CadProduto produtos = new CadProduto();
		
		
		String op = "s";
		
		while(op.equals("s")) {
			int escolha = uiprincipal.Menu();
			switch(escolha) {
				case 1:
					int eProduto =  uiprincipal.MenuProduto();
					switch(eProduto) {
						case 1:
							Produto produto = uiproduto.cadastrarProduto();
							produtos.CadastrarProduto(produto);
							break;
						case 2:
							uiproduto.listarProdutos(produtos.ListarProdutos());
							break;
						case 3:
							break;
						case 4:
							break;
						case 5:
							break;
						case 6:
							break;
					}
					break;
				case 2:
					int eVenda = uiprincipal.MenuVenda();
					break;
				case 3:
					int eCliente = uiprincipal.MenuCliente();
					break;	
				case 4:
					System.out.println("Saindo do programa...");
					return;
				default:
					break;
			}
			op = uiprincipal.MenuContinuar();
		}
		
		
		
		
		
	}

}


//Cadastro de Cliente;
//CadCliente cadCliente=new CadCliente();
//UICadCliente uiCliente= new UICadCliente();
//
//Cliente cliente=uiCliente.cadastrarCliente();
//cadCliente.CadastrarCliente(cliente);
//
//Exclusao de cliente
//int id = uiCliente.buscarID();
//var resposta = uiCliente.removerCliente(cadCliente.BuscarCliente(id));
//if(resposta)
//	cadCliente.RemoverCliente(cliente);
//
//Atualizar de cliente
//int idA = uiCliente.buscarID();
//Cliente cliente = uiCliente.atualizarCliente(cadCliente.BuscarCliente(idA));