package com.jk28.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.dao.BaseDao;
import com.jk28.domain.GuestBook;
import com.jk28.service.GuestBookService;
import com.jk28.util.Page;

public class GuestBookServiceImpl implements GuestBookService {
	//注入baseDao
	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	//
	public List<GuestBook> find(String hql, Class<GuestBook> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	public GuestBook get(Class<GuestBook> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	public Page<GuestBook> findPage(String hql, Page<GuestBook> page, Class<GuestBook> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	public void saveOrUpdate(GuestBook entity) {
		baseDao.saveOrUpdate(entity);
	}

	public void saveOrUpdateAll(Collection<GuestBook> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	public void deleteById(Class<GuestBook> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);
	}

	public void delete(Class<GuestBook> entityClass, Serializable[] ids) {
		baseDao.delete(entityClass, ids);
	}

}
