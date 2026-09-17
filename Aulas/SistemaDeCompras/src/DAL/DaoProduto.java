package DAL;

import java.util.ArrayList;
import java.util.List;

import Model.Produto;

public class DaoProduto {
	ArrayList<Produto> tabelaProduto = new ArrayList<>(); 
	
	//CRUD
	public void Create(Produto produto) {
		tabelaProduto.add(produto);
	}
	
	public void Delete(Produto produto) {
		tabelaProduto.remove(produto);
	}
	
	public void Update(Produto produto) {
		Produto produtoBusca= Recovery(produto.getId());
		produtoBusca.setId(produto.getId());
		produtoBusca.setNome(produto.getNome());
		produtoBusca.setQuantidade(produto.getQuantidade());
	}
	
	public Produto Recovery(int id) {
		for(Produto produto:tabelaProduto) {
			if(produto.getId() == id) {
				return produto;
			}
		}
		return null;
	}
	
	public List<Produto> listar(){
		return tabelaProduto;
	}
	
}
