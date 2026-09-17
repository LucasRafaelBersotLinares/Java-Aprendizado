package DAL;

import java.util.ArrayList;
import java.util.List;

import Model.Cliente;

public class DaoCliente {
	List<Cliente> tabelaCliente= new ArrayList<Cliente>();
	
	//CRUD
	public void Create(Cliente cliente) {
		tabelaCliente.add(cliente);
	}
	
	public void Delete(Cliente cliente) {
		tabelaCliente.remove(cliente);
	}
	
	public void Update(Cliente cliente) {
		Cliente clienteBusca= Recovery(cliente.getId());
		clienteBusca.setId(cliente.getId());
		clienteBusca.setNome(cliente.getNome());
		clienteBusca.setEndereco(cliente.getEndereco());
	}

	public Cliente Recovery(int id) {
		for(Cliente c:tabelaCliente) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
	}
	
	public List<Cliente> listar(){
		return tabelaCliente;
	}
	
	public String listarProfessor() {
		String relatorio="";
		for(Cliente c:tabelaCliente) {
			relatorio+=c.getId()+"\n"+
					   c.getNome()+"\n"+
					   c.getEndereco();
		}
		return relatorio;
	}
}
