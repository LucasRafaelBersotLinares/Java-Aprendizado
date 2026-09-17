package DAL;

import java.util.ArrayList;
import java.util.List;

import Model.Venda;

public class DaoVenda {
	ArrayList<Venda> tabelaVenda = new ArrayList<>(); 
	
	//CRUD
	public void Create(Venda venda) {
		tabelaVenda.add(venda);
	}
	
	public void Delete(Venda venda) {
		tabelaVenda.remove(venda);
	}
	
	public void Update(Venda venda) {
		Venda vendaBusca= Recovery(venda.getId());
		vendaBusca.setId(venda.getId());
		vendaBusca.setData(venda.getData());
	}
	
	public Venda Recovery(int id) {
		for(Venda venda:tabelaVenda) {
			if(venda.getId() == id) {
				return venda;
			}
		}
		return null;
	}
	
	public List<Venda> listar(){
		return tabelaVenda;
	}
}
