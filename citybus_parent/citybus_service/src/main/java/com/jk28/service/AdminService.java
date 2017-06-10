package com.jk28.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.domain.Admin;
import com.jk28.util.Page;

public interface AdminService {
	//查询所有，带条件查询
		public  List<Admin> find(String hql, Class<Admin> entityClass, Object[] params);
		//获取一条记录
		public  Admin get(Class<Admin> entityClass, Serializable id);
		//分页查询，将数据封装到一个page分页工具类对象
		public  Page<Admin> findPage(String hql, Page<Admin> page, Class<Admin> entityClass, Object[] params);
		
		//新增和修改保存
		public  void saveOrUpdate(Admin entity);
		//批量新增和修改保存
		public  void saveOrUpdateAll(Collection<Admin> entitys);
		
		//单条删除，按id
		public  void deleteById(Class<Admin> entityClass, Serializable id);
		//批量删除
		public  void delete(Class<Admin> entityClass, Serializable[] ids);
}
