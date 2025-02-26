package dao;

import dao.generics.IGenericDAO;
import main.Persistente;

public interface IClienteDAO<T extends Persistente> extends IGenericDAO<T, Long> {

}
