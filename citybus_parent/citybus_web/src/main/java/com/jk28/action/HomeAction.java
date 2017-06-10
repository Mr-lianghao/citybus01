package com.jk28.action;

import java.util.ArrayList;
import java.util.List;

import com.jk28.domain.Line;
import com.jk28.domain.News;
import com.jk28.service.LineService;
import com.jk28.service.NewsService;


//因为涉及到多个实体，不能使用model
public class HomeAction extends BaseAction{

	//注入newsService
	NewsService newsService;
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	//注入线路
	LineService lineService;
	public void setLineService(LineService lineService) {
		this.lineService = lineService;
	}
	
	//注入page--但是涉及到多个page--直接list吧
	public String home() throws Exception {
		
		//查找新闻列表
		List<News> list1 = new ArrayList<News>();
		List<News> list = newsService.find("from News", News.class, null);
		for(int i=0;i<10;i++){
			list1.add(list.get(i));
		}
		
		//放入栈顶
		this.put("list1", list1);
		
		
		//查找线路列表
		List<Line> listBus = lineService.find("from Line", Line.class, null);
		List<Line> listBus1 = new ArrayList<Line>();
		for(int i=0;i<2;i++){
			listBus1.add(listBus.get(i));
		}
		this.put("listBus", listBus1);
		
		return "home";
	}
}
