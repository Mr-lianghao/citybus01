package com.jk28.action.front;

import com.jk28.action.BaseAction;
import com.jk28.domain.News;
import com.jk28.service.NewsService;
import com.jk28.service.impl.NewsServiceImpl;
import com.jk28.util.Page;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class NewsAction extends BaseAction implements ModelDriven<News>{

	private News model = new News();
	public News getModel() {
		return model ;
	}
	//分页查询
	private Page page  = new Page();
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	//注入newsService
	NewsService newsService;
	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}
	
	
	/**
	 * 分页
	 * @return
	 * @throws Exception
	 */
	public String list() throws Exception {
		String name=model.getNewstitle();
		//查找所有
		if(name==null){
		newsService.findPage("from News", page, News.class, null);
		//放入值栈
		this.push(page);
		
		}else{
			String hql="from News where newstitle like '%"+name+"%'";
			newsService.findPage(hql, page, News.class,null);
			//放入值栈
			this.push(page);
		}
		return "list";
	}
	
	/**
	 * 查看新闻详情
	 * @return
	 * @throws Exception
	 */
	public String view() throws Exception {
		News findById = newsService.get(News.class, model.getId());
		this.push(findById);
		return "view";
	}
	
}
