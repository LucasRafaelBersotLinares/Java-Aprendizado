package br.UI;

import java.util.List;
import java.util.Scanner;

import br.BLL.CadCliente;
import br.Model.Cliente;

public class UICadCliente {
	Scanner leitor= new Scanner(System.in);
	CadCliente cadCliente= new CadCliente();
	
	public Cliente cadastrarCliente() {
		System.out.println("========CADASTRO DE CLIENTE========");
		System.out.println("Digite os dados do cliente: ");
		System.out.println("ID: "); int id = leitor.nextInt();
		System.out.println("Nome: "); String nome = leitor.next();
		System.out.println("Endereço: "); String endereco = leitor.next();
		System.out.println("===================================");
		
		Cliente cliente=new Cliente();
		cliente.setId(id);
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		
		return cliente;
	}
	
	public void mostrarCliente(Cliente cliente) {
		System.out.println("==========MOSTRAR CLIENTE==========");
		System.out.println("ID: "+cliente.getId());
		System.out.println("NOME: "+cliente.getNome());
		System.out.println("ENDEREÇO: "+cliente.getEndereco());
		System.out.println("===================================");
	
	}
	
	public Cliente atualizarCliente(Cliente cliente) {
		System.out.println("=========ATUALIZAR CLIENTE=========");
		
		mostrarCliente(cliente);
		
		System.out.println("Digite os dados do cliente: ");
		System.out.println("ID: "); int id = leitor.nextInt();
		System.out.println("Nome: "); String nome = leitor.next();
		System.out.println("Endereço: "); String endereco = leitor.next();
		System.out.println("===================================");
		
		cliente.setId(id);
		cliente.setNome(nome);
		cliente.setEndereco(endereco);
		
		return cliente;
	}
	
	public boolean removerCliente(Cliente cliente) {
		System.out.println("=========REMOVER CLIENTE=========");
		
		if(cliente == null) {
			System.out.println("Cliente é igual a nulo");
			return false;
		}
		
		System.out.println("Cliente a ser removido: ");
		mostrarCliente(cliente);
		System.out.println("Deseja excluir o cliente?: (SIM | NÃO)");
		String resposta=leitor.next();
		
		if(resposta == "S") return true;
		return false;
	}
	
	public void listarClientes(List<Cliente> clientes){
		System.out.println("========LISTA DE CLIENTES========");
		for(Cliente c:clientes) {
			System.out.println("ID: "+c.getId()+" NOME: "+c.getNome()+" ENDEREÇO: "+c.getEndereco());
		}
		
	}
	
	public int buscarID() {
		System.out.println("===Buscar Cliente===");
		listarClientes(cadCliente.ListarClientes());
		Scanner leitor=new Scanner(System.in);
		System.out.println("Digite o id do cliente a ser excluido: "); int id = leitor.nextInt();
		return id;
	}
	
	
}
