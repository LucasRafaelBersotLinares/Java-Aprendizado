package BLL;

import Model.Item;
import Model.Produto;

public class GerItem {
	
	public boolean Transacao(Produto produto, Item item) {
		if(produto.getQuantidade() < item.getQuantidade()) {
			return false;
		}
		produto.setQuantidade(produto.getQuantidade() - item.getQuantidade());
		return true;
	}
}
