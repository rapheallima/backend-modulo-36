package dao.generics;

import java.io.Serializable;
import java.util.Collection;

import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import exceptions.TipoChaveNaoEncontradaException;
import main.Persistente;

public interface IGenericDAO<T extends Persistente, E extends Serializable> {

	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

	public void excluir(T entity) throws DAOException;

	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

	public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

	public Collection<T> buscarTodos() throws DAOException;
}
