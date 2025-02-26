package dao.generics;

import java.io.Serializable;

import main.Persistente;

public abstract class GenericDAO1<T extends Persistente, E extends Serializable> extends GenericDAO<T, E> {

	public GenericDAO1(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
