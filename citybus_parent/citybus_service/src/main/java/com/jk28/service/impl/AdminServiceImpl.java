package com.jk28.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.dao.BaseDao;
import com.jk28.domain.Admin;
import com.jk28.service.AdminService;
import com.jk28.util.Page;

public class AdminServiceImpl implements AdminService {
	//注入baseDao
	private BaseDao baseDao;
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	//
	public List<Admin> find(String hql, Class<Admin> entityClass, Object[] params) {
		return baseDao.find(hql, entityClass, params);
	}

	public Admin get(Class<Admin> entityClass, Serializable id) {
		return baseDao.get(entityClass, id);
	}

	public Page<Admin> findPage(String hql, Page<Admin> page, Class<Admin> entityClass, Object[] params) {
		return baseDao.findPage(hql, page, entityClass, params);
	}

	public void saveOrUpdate(Admin entity) {
		baseDao.saveOrUpdate(entity);
	}

	public void saveOrUpdateAll(Collection<Admin> entitys) {
		baseDao.saveOrUpdateAll(entitys);
	}

	public void deleteById(Class<Admin> entityClass, Serializable id) {
		baseDao.deleteById(entityClass, id);
	}

	public void delete(Class<Admin> entityClass, Serializable[] ids) {
		baseDao.delete(entityClass, ids);
	}

}
