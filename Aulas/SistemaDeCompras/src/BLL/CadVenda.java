package BLL;

import java.util.List;

import DAL.DaoVenda;
import Model.Venda;

public class CadVenda {
	DaoVenda daoVenda;
	
	public void CadastrarVenda(Venda venda) {
		if(venda!=null) {
			daoVenda= new DaoVenda();
			daoVenda.Create(venda);
		}
	}
	
	public Venda BuscarVenda(int id) {
		daoVenda = new DaoVenda();
		Venda venda=daoVenda.Recovery(id);
		return venda;
	}
	
	public void RemoverVenda(Venda venda) {
		daoVenda=new DaoVenda();
		daoVenda.Delete(venda);
	}
	
	public List<Venda> ListarVendas() {
		daoVenda = new DaoVenda();
		return daoVenda.listar();
	}
	
}
