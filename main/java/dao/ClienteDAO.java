package dao;

import dao.generics.GenericDAO1;
import main.Cliente;

public class ClienteDAO extends GenericDAO1<Cliente, Long> implements IClienteDAO<Cliente> {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
