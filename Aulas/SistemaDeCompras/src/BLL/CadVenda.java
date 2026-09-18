package BLL;

import java.util.List;

import DAL.DaoVenda;
import Model.Venda;

public class CadVenda {
	DaoVenda daoVenda = new DaoVenda();
	
	public void CadastrarVenda(Venda venda) {
		if(venda!=null) {
			daoVenda.Create(venda);
		}
	}
	
	public Venda BuscarVenda(int id) {
		Venda venda=daoVenda.Recovery(id);
		return venda;
	}
	
	public void RemoverVenda(Venda venda) {
		daoVenda.Delete(venda);
	}
	
	public List<Venda> ListarVendas() {
		return daoVenda.listar();
	}
	
}
