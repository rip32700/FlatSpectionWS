package de.flatspection.dao;

import java.util.List;

public interface DataAccessObject<T> {

	T findById(final String id);
	List<T> findAll();
	boolean delete(final String id);
	boolean update(final T object);
	boolean save(T object);
	
}