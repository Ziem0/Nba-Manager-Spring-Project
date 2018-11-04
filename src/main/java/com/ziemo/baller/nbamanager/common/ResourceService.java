package com.ziemo.baller.nbamanager.common;

public interface ResourceService<T> {

	T get(int id);

	Iterable<T> getAll();

	void create(T object);

	void delete(int id);

	void finalDelete(int id);

	Iterable<T> getAllByAdmin();
}
