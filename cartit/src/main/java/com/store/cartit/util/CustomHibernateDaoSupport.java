package com.store.cartit.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class CustomHibernateDaoSupport extends HibernateDaoSupport {
	
	@Autowired
	public void settingSession(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}

}
