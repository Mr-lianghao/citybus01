package com.jk28.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.dao.BaseDao;
import com.jk28.domain.News;
import com.jk28.service.NewsService;
import com.jk28.util.Page;

public class NewsServiceImpl implements NewsService {
	//注入baseDao
	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	//
	public List<News> find(String hql, Class<News> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	public News get(Class<News> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	public Page<News> findPage(String hql, Page<News> page, Class<News> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	public void saveOrUpdate(News entity) {
		baseDao.saveOrUpdate(entity);
	}

	public void saveOrUpdateAll(Collection<News> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	public void deleteById(Class<News> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);
	}

	public void delete(Class<News> entityClass, Serializable[] ids) {
		baseDao.delete(entityClass, ids);
	}

}
