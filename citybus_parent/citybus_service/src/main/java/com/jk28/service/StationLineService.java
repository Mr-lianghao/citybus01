package com.jk28.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.domain.StationLine;
import com.jk28.util.Page;

public interface StationLineService {
	//查询所有，带条件查询
		public  List<StationLine> find(String hql, Class<StationLine> entityClass, Object[] params);
		//获取一条记录
		public  StationLine get(Class<StationLine> entityClass, Serializable id);
		//分页查询，将数据封装到一个page分页工具类对象
		public  Page<StationLine> findPage(String hql, Page<StationLine> page, Class<StationLine> entityClass, Object[] params);
		
		//新增和修改保存
		public  void saveOrUpdate(StationLine entity);
		//批量新增和修改保存
		public  void saveOrUpdateAll(Collection<StationLine> entitys);
		
		//单条删除，按id
		public  void deleteById(Class<StationLine> entityClass, Serializable id);
		//批量删除
		public  void delete(Class<StationLine> entityClass, Serializable[] ids);
		
}
