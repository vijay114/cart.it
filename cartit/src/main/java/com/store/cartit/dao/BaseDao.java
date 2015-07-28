package com.store.cartit.dao;

import java.io.Serializable;

public interface BaseDao {

	
	public void save(Object o);
	
	public Object get(Class<?> entityClass, Serializable id);
}
