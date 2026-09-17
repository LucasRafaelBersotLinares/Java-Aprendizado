package BLL;

import java.util.List;

import DAL.DaoCliente;
import Model.Cliente;

public class CadCliente {
	DaoCliente daoCliente = new DaoCliente();
	
	public void CadastrarCliente(Cliente cliente) {
		if(cliente!=null) {
			daoCliente.Create(cliente);
		}
	}
	
	public Cliente BuscarCliente(int id) {
		Cliente c=daoCliente.Recovery(id);
		return c;
	}
	
	public void RemoverCliente(Cliente cliente) {
		daoCliente.Delete(cliente);
	}
	
	public void UpdateCliente(Cliente cliente) {
		daoCliente.Update(cliente);
	}
	
	public List<Cliente> ListarClientes() {
		return daoCliente.listar();
	}
	
}
