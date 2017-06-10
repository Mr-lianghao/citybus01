package com.jk28.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.domain.GuestBook;
import com.jk28.util.Page;

public interface GuestBookService {
	//查询所有，带条件查询
		public  List<GuestBook> find(String hql, Class<GuestBook> entityClass, Object[] params);
		//获取一条记录
		public  GuestBook get(Class<GuestBook> entityClass, Serializable id);
		//分页查询，将数据封装到一个page分页工具类对象
		public  Page<GuestBook> findPage(String hql, Page<GuestBook> page, Class<GuestBook> entityClass, Object[] params);
		
		//新增和修改保存
		public  void saveOrUpdate(GuestBook entity);
		//批量新增和修改保存
		public  void saveOrUpdateAll(Collection<GuestBook> entitys);
		
		//单条删除，按id
		public  void deleteById(Class<GuestBook> entityClass, Serializable id);
		//批量删除
		public  void delete(Class<GuestBook> entityClass, Serializable[] ids);
}
