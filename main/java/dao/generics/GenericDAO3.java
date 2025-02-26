package dao.generics;

import java.io.Serializable;

import main.Persistente;

public abstract class GenericDAO3<T extends Persistente, E extends Serializable> extends GenericDAO<T, E> {

	public GenericDAO3(Class<T> persistenteClass) {
		super(persistenteClass, "Mysql1");
	}

}
