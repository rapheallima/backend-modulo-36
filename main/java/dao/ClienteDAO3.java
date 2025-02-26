package dao;

import dao.generics.GenericDAO3;
import main.Cliente2;

public class ClienteDAO3 extends GenericDAO3<Cliente2, Long> implements IClienteDAO<Cliente2> {

	public ClienteDAO3() {
		super(Cliente2.class);
	}

}
