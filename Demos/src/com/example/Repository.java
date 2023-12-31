package com.example;

import java.util.List;

public interface Repository<T, K> {
	List<T> getAll();
	T getOne(K id);
	T add(T item);
	T modify(T item);
	void delete(T item);
	void deleteBy(K id);
}
