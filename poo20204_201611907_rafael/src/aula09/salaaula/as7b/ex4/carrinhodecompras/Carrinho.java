package aula09.salaaula.as7b.ex4.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Produto> produtos = new ArrayList<Produto>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	} 


}