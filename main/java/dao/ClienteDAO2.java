package dao;

import dao.generics.GenericDAO2;
import main.Cliente;

public class ClienteDAO2 extends GenericDAO2<Cliente, Long> implements IClienteDAO<Cliente> {

	public ClienteDAO2() {
		super(Cliente.class);
	}

}
