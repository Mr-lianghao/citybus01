package com.jk28.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.dao.BaseDao;
import com.jk28.domain.Station;
import com.jk28.service.StationService;
import com.jk28.util.Page;

public class StationServiceImpl implements StationService {
	//注入baseDao
	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	//
	public List<Station> find(String hql, Class<Station> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	public Station get(Class<Station> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	public Page<Station> findPage(String hql, Page<Station> page, Class<Station> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	public void saveOrUpdate(Station entity) {
		baseDao.saveOrUpdate(entity);
	}

	public void saveOrUpdateAll(Collection<Station> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	public void deleteById(Class<Station> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);
	}

	public void delete(Class<Station> entityClass, Serializable[] ids) {
		baseDao.delete(entityClass, ids);
	}

}
