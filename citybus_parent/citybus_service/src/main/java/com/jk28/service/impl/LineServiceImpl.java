package com.jk28.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


import com.jk28.dao.BaseDao;
import com.jk28.domain.Line;
import com.jk28.domain.StationLine;
import com.jk28.service.LineService;
import com.jk28.util.Page;

public class LineServiceImpl implements LineService {
	//注入baseDao
	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	//
	public List<Line> find(String hql, Class<Line> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	public Line get(Class<Line> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	public Page<Line> findPage(String hql, Page<Line> page, Class<Line> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	public void saveOrUpdate(Line entity) {
		baseDao.saveOrUpdate(entity);
	}

	public void saveOrUpdateAll(Collection<Line> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	public void deleteById(Class<Line> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);
	}

	public void delete(Class<Line> entityClass, Serializable[] ids) {
		baseDao.delete(entityClass, ids);
	}


}
