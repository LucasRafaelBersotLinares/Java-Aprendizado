package br.BLL;

import java.util.Scanner;

import br.Model.Cliente;
import br.UI.UICadCliente;

public class Principal {

	public static void main(String[] args) {
		
		//Cadastro de Cliente;
		CadCliente cadCliente=new CadCliente();
		UICadCliente uiCliente= new UICadCliente();
		
		Cliente cliente=uiCliente.cadastrarCliente();
		cadCliente.CadastrarCliente(cliente);
		
		//Exclusao de cliente
		int id = uiCliente.buscarID();
		var resposta = uiCliente.removerCliente(cadCliente.BuscarCliente(id));
		if(resposta)
			cadCliente.RemoverCliente(cliente);
		
		//Atualizar de cliente
		int idA = uiCliente.buscarID();
		Cliente cliente = uiCliente.atualizarCliente(cadCliente.BuscarCliente(idA));
	}

}
