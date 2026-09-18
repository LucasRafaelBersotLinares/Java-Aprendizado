package BLL;

import java.util.Scanner;

import UI.UICadCliente;
import UI.UICadProduto;
import UI.UICadVenda;
import UI.UIPrincipal;
import UI.UIitem;
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
		UIitem uiitem = new UIitem();
		CadProduto produtos = new CadProduto();
		CadCliente clientes = new CadCliente();
		CadVenda vendas = new CadVenda();
		
		
		String op = "s";
		
		while(op.equals("s")) {
			int escolha = uiprincipal.Menu();
			switch(escolha) {
				case 1:
					int eProduto =  uiprincipal.MenuProduto();
					switch(eProduto) {
						case 1:
							Produto pCadastro = uiproduto.cadastrarProduto();
							produtos.CadastrarProduto(pCadastro);
							break;
						case 2:
							uiproduto.listarProdutos(produtos.ListarProdutos());
							break;
						case 3:
							uiproduto.listarProdutos(produtos.ListarProdutos());
							int idA = uiproduto.buscarID();
							Produto pAtualizar = produtos.BuscarProduto(idA);
							pAtualizar = uiproduto.atualizarProduto(pAtualizar);
							produtos.UpdateProduto(pAtualizar);
							break;
						case 4:
							uiproduto.listarProdutos(produtos.ListarProdutos());
							int idR = uiproduto.buscarID();
							Produto pRemover = produtos.BuscarProduto(idR);
							boolean confirm = uiproduto.removerProduto(pRemover);
							if(confirm) {
								produtos.RemoverProduto(pRemover);
							}
							break;
						case 5:
							int id = uiproduto.buscarID();
							Produto pBusca = produtos.BuscarProduto(id);
							uiproduto.mostrarProduto(pBusca);
							break;
						case 0:
							break;
					}
					break;
				case 2:
					int eVenda = uiprincipal.MenuVenda();
					switch(eVenda) {
						case 1:
							int opI = 1;
							uicliente.listarClientes(clientes.ListarClientes());
							int idC = uicliente.buscarID();
							Cliente cVenda = clientes.BuscarCliente(idC);
							Venda venda = uivenda.abrirVenda(cVenda);
							int eItens = uiprincipal.MenuItens();
							while(opI == 1) {
								eItens = uiprincipal.MenuItens();
								switch(eItens) {
								case 1:
									uiproduto.listarProdutos(produtos.ListarProdutos());
									int idP = uiproduto.buscarID();
									Produto pItem = produtos.BuscarProduto(idP);
									Item item = uiitem.adicionarItem(pItem);
									venda.setItem(item);
									break;
								case 2:
									uiitem.listarItens(venda.getCarrinho());
									break;
								case 3:
									uiitem.listarItens(venda.getCarrinho());
									int idI = uiitem.buscarItem();
									Item itemAtualizar = venda.BuscarItem(idI);
									uiproduto.listarProdutos(produtos.ListarProdutos());
									int idPA = uiproduto.buscarID();
									Produto pAItem = produtos.BuscarProduto(idPA);
									itemAtualizar = uiitem.atualizarItem(itemAtualizar, pAItem);
									venda.AtualizarItem(itemAtualizar);
									break;
								case 4:
									uiitem.listarItens(venda.getCarrinho());
									int idR = uiitem.buscarItem();
									Item itemRemover = venda.BuscarItem(idR);
									boolean confirm = uiitem.removerItem(itemRemover);
									if(confirm) {
										venda.removerItem(itemRemover);
									}
									break;
								case 0:
									break;
								}
								opI = uiprincipal.MenuContinuarItem();
							}
							vendas.CadastrarVenda(venda);
							break;
						case 2:
							uivenda.listarVendas(vendas.ListarVendas());
							break;
						case 3:
							uivenda.listarVendas(vendas.ListarVendas());
							int idR = uivenda.buscarID();
							Venda vRemover = vendas.BuscarVenda(idR);
							boolean confirm = uivenda.removerVenda(vRemover);
							if(confirm) {
								vendas.RemoverVenda(vRemover);
							}
							break;
						case 4:
							int id = uivenda.buscarID();
							Venda vendaB = vendas.BuscarVenda(id);
							uivenda.mostrarVenda(vendaB);
							break;
						case 0:
							break;
					}
					break;
				case 3:
					int eCliente = uiprincipal.MenuCliente();
					switch(eCliente) {
					case 1:
						Cliente cCadastro = uicliente.cadastrarCliente();
						clientes.CadastrarCliente(cCadastro);
						break;
					case 2:
						uicliente.listarClientes(clientes.ListarClientes());
						break;
					case 3:
						uicliente.listarClientes(clientes.ListarClientes());
						int idA = uicliente.buscarID();
						Cliente cAtualizar = clientes.BuscarCliente(idA);
						cAtualizar = uicliente.atualizarCliente(cAtualizar);
						clientes.UpdateCliente(cAtualizar);
						break;
					case 4:
						uicliente.listarClientes(clientes.ListarClientes());
						int idR = uicliente.buscarID();
						Cliente cRemover = clientes.BuscarCliente(idR);
						boolean confirm = uicliente.removerCliente(cRemover);
						if(confirm) {
							clientes.RemoverCliente(cRemover);
						}
						break;
					case 5:
						int id = uicliente.buscarID();
						Cliente cBusca = clientes.BuscarCliente(id);
						uicliente.mostrarCliente(cBusca);
						break;
					case 0:
						break;
				}
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