package BLL;

import java.util.List;

import DAL.DaoProduto;
import Model.Produto;

public class CadProduto {
	DaoProduto daoProduto = new DaoProduto();
	
	public void CadastrarProduto(Produto produto) {
		if(produto!=null) {
			daoProduto.Create(produto);
		}
	}
	
	public Produto BuscarProduto(int id) {
		Produto c=daoProduto.Recovery(id);
		return c;
	}
	
	public void RemoverProduto(Produto produto) {
		daoProduto.Delete(produto);
	}
	
	public void UpdateProduto(Produto produto) {
		daoProduto.Update(produto);
	}
	
	public List<Produto> ListarProdutos() {
		return daoProduto.listar();
	}
	
	
	
}
