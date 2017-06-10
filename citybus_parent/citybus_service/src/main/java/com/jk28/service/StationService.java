package com.jk28.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.domain.Station;
import com.jk28.util.Page;

public interface StationService {
	//查询所有，带条件查询
		public  List<Station> find(String hql, Class<Station> entityClass, Object[] params);
		//获取一条记录
		public  Station get(Class<Station> entityClass, Serializable id);
		//分页查询，将数据封装到一个page分页工具类对象
		public  Page<Station> findPage(String hql, Page<Station> page, Class<Station> entityClass, Object[] params);
		
		//新增和修改保存
		public  void saveOrUpdate(Station entity);
		//批量新增和修改保存
		public  void saveOrUpdateAll(Collection<Station> entitys);
		
		//单条删除，按id
		public  void deleteById(Class<Station> entityClass, Serializable id);
		//批量删除
		public  void delete(Class<Station> entityClass, Serializable[] ids);
}
