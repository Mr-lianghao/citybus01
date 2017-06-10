package com.jk28.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


import com.jk28.dao.BaseDao;
import com.jk28.domain.StationLine;
import com.jk28.service.StationLineService;
import com.jk28.util.Page;

public class StationLineServiceImpl implements StationLineService {
	//注入baseDao
	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	//
	public List<StationLine> find(String hql, Class<StationLine> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	public StationLine get(Class<StationLine> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	public Page<StationLine> findPage(String hql, Page<StationLine> page, Class<StationLine> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	public void saveOrUpdate(StationLine entity) {
		baseDao.saveOrUpdate(entity);
	}

	public void saveOrUpdateAll(Collection<StationLine> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	public void deleteById(Class<StationLine> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);
	}

	public void delete(Class<StationLine> entityClass, Serializable[] ids) {
		baseDao.delete(entityClass, ids);
	}

}
