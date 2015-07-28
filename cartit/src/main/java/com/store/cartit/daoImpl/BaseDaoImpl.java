package com.store.cartit.daoImpl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.store.cartit.dao.BaseDao;

public class BaseDaoImpl  extends HibernateDaoSupport implements BaseDao{
	
	@Autowired
	public void settingSession(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
		
	}

	public void save(Object o) {
		getHibernateTemplate().save(o);
	}

	public Object get(Class<?> entityName, Serializable id) {
		return getHibernateTemplate().get(entityName, id);
	}
	
	
}
