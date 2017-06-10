package com.jk28.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import com.jk28.domain.Line;
import com.jk28.domain.StationLine;
import com.jk28.util.Page;

public interface LineService {
	//查询所有，带条件查询
		public  List<Line> find(String hql, Class<Line> entityClass, Object[] params);
		//获取一条记录
		public  Line get(Class<Line> entityClass, Serializable id);
		//分页查询，将数据封装到一个page分页工具类对象
		public  Page<Line> findPage(String hql, Page<Line> page, Class<Line> entityClass, Object[] params);
		
		//新增和修改保存
		public  void saveOrUpdate(Line entity);
		//批量新增和修改保存
		public  void saveOrUpdateAll(Collection<Line> entitys);
		
		//单条删除，按id
		public  void deleteById(Class<Line> entityClass, Serializable id);
		//批量删除
		public  void delete(Class<Line> entityClass, Serializable[] ids);
}
