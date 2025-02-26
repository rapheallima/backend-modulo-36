package dao;

import dao.generics.GenericDAO1;
import main.Produto;

public class ProdutoDAO extends GenericDAO1<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

}
