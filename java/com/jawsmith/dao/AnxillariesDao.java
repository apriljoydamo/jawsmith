package com.jawsmith.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.jawsmith.interfaces.DataAccesses;



import interfaces.DataAccesses;

public class AnxillariesDao extends HibernateDaoSupport implements DataAccesses{

	DataAccesses dataAccesses;
	
	@Override
	public void save(Object obj) {
		getHibernateTemplate().save(obj);
		
	}

	@Override
	public void update(Object obj) {
		getHibernateTemplate().update(obj);
		
	}

	@Override
	public void delete(Object obj) {
		getHibernateTemplate().delete(obj);
		
	}

	@Override
	public Object findById(int i) {
		List list = getHibernateTemplate().find("from anxillaries where ANXILLARIES_ID=?",i);
		return list.get(0);
	}

	@Override
	public List getAll() {
		List list = getHibernateTemplate().find("from anxillaries");
		return list;
	}