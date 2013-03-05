package com.jawsmith.dao;

import java.util.List;

import com.jawsmith.interfaces.DataAccesses;


public class TreatmentPlanDao extends HibernateDaoSupport implements DataAccesses{

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
		List list = getHibernateTemplate().find("from treatment_plan where TREATMENT_PLAN_ID=?",i);
		return list.get(0);
	}

	@Override
	public List getAll() {
		List list = getHibernateTemplate().find("from treatment_plan");
		return list;
	}